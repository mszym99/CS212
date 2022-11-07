package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{

    	private static int averageHitPoints = 70;
	private static int attackSpeed = 5;
	private static double chanceToHit = .8;
	private static double chanceToHeal = .4;
	private static int damageMin = 15;
	private static int damageMax = 30;
	private static int minHeal = 20;
	private static int maxHeal = 40;//static parameters for future referencve
    public Gremlin()
	{
		super("Gnarltooth the Gremlin", calcStartingHP(averageHitPoints), attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal);
    	}//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Gremlin
