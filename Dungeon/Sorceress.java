package Dungeon;



import java.util.Scanner;

public class Sorceress extends Hero
{
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;
	Scanner kb = new Scanner(System.in);
	
	private static int averageHitPoints = 75;
	private static int attackSpeed = 5;
	private static double chanceToHit = .7;
	private static int damageMin = 25;
	private static int damageMax = 50;
	private static double chanceToBlock = .3;//static parameters for future reference

//-----------------------------------------------------------------
    public Sorceress()
	{
		super("Sorceress", calcStartingHP(averageHitPoints), attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, new Heal());
    }//end constructor


//-----------------------------------------------------------------


//-----------------------------------------------------------------
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " casts a spell of fireball at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method

//-----------------------------------------------------------------
    public void battleChoices(DungeonCharacter opponent)
	{
    	super.battleChoices(opponent);
		int choice;	
			do
			{
			    System.out.println("1. Attack Opponent");
			    System.out.println("2. Heal");
			    if(this.item != null)
			    {
			    	System.out.println("3. Use " + this.item.getName());//displays an item if it exists
			    }
			   	System.out.print("Choose an option: ");
			    choice = Integer.parseInt(kb.nextLine()); //was keyboard class
			    if(this.item != null)//switches which switch statement used based on if item is null or not
			    {
				    switch (choice)
				    {
					    case 1: attack(opponent);
					        break;
					    case 2: super.specAttack(opponent);
					        break;
					    case 3: super.useItem(opponent);
					    break;
					    default:
					        System.out.println("invalid choice!");
				    }//end switch
			    }
			    else
			    {
			    	switch (choice)
			    	{
			    		case 1: attack(opponent);
			    			break;
			    		case 2: super.specAttack(opponent);
			    			break;
			    		default: 
			    			System.out.println("invalid choice!");
					 }//end switch	
			    }
	
				numTurns--;
				if (numTurns > 0)
				    System.out.println("Number of turns remaining is: " + numTurns);
	
			} while(numTurns > 0);
		
    }//end overridden method

}//end class
