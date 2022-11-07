package Dungeon;

import java.util.Scanner;
//moved methods outside of the Dungeon class
public class DungeonMethods {
	/*-------------------------------------------------------------------
	chooseHero allows the user to select a hero, creates that hero, and
	returns it.  It utilizes a polymorphic reference (Hero) to accomplish
	this task
	---------------------------------------------------------------------*/
	public static Hero createHero(Scanner kb) {
		int choice;
		HeroFactory factory = new HeroFactory();
		//Request the input
		System.out.print("Choose a hero:\n" +
					     	"1. Warrior\n" +
						   "2. Sorceress\n" +
						   "3. Thief\n"
						   + "Input a your choice as the corresponding value: ");
		choice = getInput(kb, 3);//This will get input from the user between 1 and the range given (3).
		
		return factory.generateHero(choice);
		
		
		
	}
	
	
	
/*		public static Hero chooseHero(final Scanner kb)
	{
	
		int choice = -1;//Starting value is bad(not set to a default)

		//Request the input
		System.out.println("Choose a hero:\n" +
					     	"1. Warrior\n" +
						   "2. Sorceress\n" +
						   "3. Thief");
				

			choice = getInput(kb, 3);//This will get input from the user between 1 and the range given (3). 
			//It cannot not throw an uncontained exception!!
				
			if(choice == 1)
				return new Warrior();
			else
				if(choice == 2)
					return new Sorceress();
				else
					if(choice == 3)
						return new Thief();
					else
					{//JUST INCASE SOMETHING BREAKS, the program will still run just fine.
						System.err.println("Error in chooseHero, requested input not received, returning default warrior class...");
						return new Warrior();
					}
	}//end chooseHero method
*/
/*-------------------------------------------------------------------
generateMonster randomly selects a Monster and returns it.  It utilizes
a polymorphic reference (Monster) to accomplish this task.
---------------------------------------------------------------------*/
	public static Monster createMonster() {
		int choice;
      		MonsterFactory factory =  new MonsterFactory();
      
		
		choice = (int)(Math.random() * 3) + 1;
		
      return factory.generateMonster(choice);
		
	}//end generateMonster method
	
/*	public static Monster generateMonster()
	{
		int choice;

		choice = (int)(Math.random() * 3) + 1;

		switch(choice)
		{
			case 1: return new Ogre();

			case 2: return new Gremlin();

			case 3: return new Skeleton();

			default: System.out.println("invalid choice, returning Skeleton");
				     return new Skeleton();
		}//end switch
	}//end generateMonster method
*/
/*-------------------------------------------------------------------
playAgain allows gets choice from user to play another game.  It returns
true if the user chooses to continue, false otherwise.
---------------------------------------------------------------------*/
	public static boolean playAgain(final Scanner kb)
	{
		char again;
		
		do{
			
			System.out.println("Play again (y/n)?");
			again = kb.nextLine().charAt(0);
			
		}while(again != 'Y' && again != 'y' && again != 'n' && again != 'N');
		
		return (again == 'Y' || again == 'y');
	}//end playAgain method


/*-------------------------------------------------------------------
battle is the actual combat portion of the game.  It requires a Hero
and a Monster to be passed in.  Battle occurs in rounds.  The Hero
goes first, then the Monster.  At the conclusion of each round, the
user has the option of quitting.
---------------------------------------------------------------------*/
	public static void battle(Hero theHero, Monster theMonster, Scanner kb)
	{
		
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " +
							theMonster.getName());
		System.out.println("---------------------------------------------");

		//do battle
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q')
		{
		    //hero goes first
			theHero.battleChoices(theMonster);

			//monster's turn (provided it's still alive!)
			if (theMonster.isAlive())
			    theMonster.attack(theHero);

			//let the player bail out if desired
			System.out.print("\n-->q to quit, anything else to continue: ");
			pause = kb.nextLine().charAt(0); 

		}//end battle loop

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else//both are alive so user quit the game
			System.out.println("Quitters never win ;-)");
	}//end battle method
	
	public static int getInput(final Scanner kb, int range)
	{

		int choice = -1;//outside of range so will not set to a default...
		do 
		{	
			try
			{//Request of input not nessessary here will only be called once it is asked for....

				//Grab input, this may throw a exception(why this is inside try-catch)
				choice = Integer.valueOf(kb.nextLine());
				
				if(choice <= range && choice > 0)
					return choice;//The choice is good!!!
				
				System.out.println("Please make a selection between the given range");//IF WE HAVE NOT RETURNED FROM THIS METHOD WE RECEIVED BAD INPUT
				
			}
			catch(Exception e)
			{
				System.out.println("No decimal or non-numeric characters please!");
			}
		}while(true);//Will always repeat until the loop breaks upon receiving good input!
	}
}
