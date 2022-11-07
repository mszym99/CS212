package Dungeon;
import java.util.Scanner;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{
	Scanner kb = new Scanner(System.in);
	
   	private static int averageHitPoints = 75;
	private static int attackSpeed = 6;
	private static double chanceToHit = .8;
	private static int damageMin = 20;
	private static int damageMax = 40;
	private static double chanceToBlock = .5;//static parameters for future reference
	
    public Thief()
	{
		super("Thief", calcStartingHP(averageHitPoints), attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, new SupriseAttack());
    	}//end constructor




    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		int choice;	
			do
			{
			    System.out.println("1. Attack Opponent");
			    System.out.println("2. Surprise Attack");
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
			    		default: System.out.println("invalid choice!");
					 }//end switch	
			    }
	
				numTurns--;
				if (numTurns > 0)
				    System.out.println("Number of turns remaining is: " + numTurns);
	
			} while(numTurns > 0);
		

    }
}
