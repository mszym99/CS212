package Dungeon;
/**
 * Title: DungeonCharacter.java
 *
 * Description: Abstract Base class for inheritance hierarchy for a
 *              role playing game
 *
 *  class variables (all will be directly accessible from derived classes):
 *    name (name of character)
 *    hitPoints (points of damage a character can take before killed)
 *    attackSpeed (how fast the character can attack)
 *    chanceToHit (chance an attack will strike the opponent)
 *    damageMin, damageMax (range of damage the character can inflict on
 *     opponent)
 *
 *  class methods (all are directly accessible by derived classes):
 *    DungeonCharacter(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax)
	  public String getName()
	  public int getHitPoints()
	  public int getAttackSpeed()
	  public void addHitPoints(int hitPoints)
	  public void subtractHitPoints(int hitPoints) -- this method will be
	    overridden
	  public boolean isAlive()
	  public void attack(DungeonCharacter opponent) -- this method will be
	    overridden
 *
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public abstract class DungeonCharacter implements Comparable
{

	protected String name;
	protected int hitPoints;
	protected int attackSpeed;
	protected double chanceToHit;
	protected int damageMin, damageMax;

	public int compareTo(Object o)
	{
		return 1;
	}

//-----------------------------------------------------------------
//explicit constructor to initialize instance variables -- it is called
// by derived classes
	public DungeonCharacter(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax)
	{

		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;

	}//end constructor

//-----------------------------------------------------------------
	public String getName()
	{
		return name;
	}//end getName

//-----------------------------------------------------------------
	public int getHitPoints()
	{
		return hitPoints;
	}//end getHitPoints
//-----------------------------------------------------------------
	public int getAttackSpeed()
	{
		return attackSpeed;
	}//end getAttackSpeed


/*-------------------------------------------------------
addHitPoints is used to increment the hitpoints a dungeon character has

Receives: number of hit points to add
Returns: nothing

This method calls: nothing
This method is called by: heal method of monsters and Sorceress
---------------------------------------------------------*/
	public void addHitPoints(int healAmount)
	{
		if (healAmount <=0)//adds hp as long as it is positve
			System.out.println("Healing amount must be positive.");
		else
		{
			this.hitPoints += healAmount;
			//System.out.println("Remaining Hit Points: " + hitPoints);

		}
	}//end addHitPoints method

/*-------------------------------------------------------
subtractHitPoints is used to decrement the hitpoints a dungeon character has.
It also reports the damage and remaining hit points (these things could be
done in separate methods to make code more modular ;-)

Receives: number of hit points to subtract
Returns: nothing

This method calls: nothing
This method is called by: overridden versions in Hero and Monster
---------------------------------------------------------*/
	public void subtractHitPoints(int damage)
	{
		if (damage <0)
			System.out.println("Damage amount must be positive.");
		else if (damage >0)
		{
			this.hitPoints -= damage;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " hit " +
								" for <" + damage + "> points damage.");
			System.out.println(getName() + " now has " + getHitPoints() + " hit points remaining.\n");//shows remaining hp and how much damage dealt
		}//end else if
	

		if (this.hitPoints == 0)//calculates death
			System.out.println(name + " has been killed :-(");


	}//end method

/*-------------------------------------------------------
isAlive is used to see if a character is still alive by checking hit points

Receives: nothing
Returns: true is hero is alive, false otherwise

This method calls: nothing
This method is called by: unknown (intended for external use)
---------------------------------------------------------*/
    public boolean isAlive()
	{
	  return (hitPoints > 0);
	}//end isAlive method

/*-------------------------------------------------------
attack allows character to attempt attack on opponent.  First, chance to hit
is considered.  If a hit can occur, then the damage is calculated based on
character's damage range.  This damage is then applied to the opponenet.

Receives: opponent being attacked
Returns: nothing

This method calls: Math.random(), subtractHitPoints()
This method is called by: overridden versions of the method in monster and
hero classes and externally
---------------------------------------------------------*/
	public void attack(DungeonCharacter opponent)
	{	
		if (attemptAttack())
		{			
			opponent.subtractHitPoints(calculateDamage());//if the hit is successful, calculates damage
			System.out.println();
		}//end if can attack
		else
		{
			System.out.println(getName() + "'s attack on " + opponent.getName() + " failed!\n");
					//System.out.println();		Waste of a line (added new line before)
		}//end else

	}//end attack method
	
	public boolean attemptAttack()//refactored attack methods to have it broken with different methods into different parts
	{
		return Math.random() <= this.chanceToHit;//does the chance to hit
	}
	public int calculateDamage()//calculates and returns damage
	{
		int damage = (int)(Math.random() * (damageMax - damageMin + 1)) + damageMin;
		return damage;
	}
//-----------------------------------------------------------------

/* 
*
*	This method is utilized by the Hero and Monster childeren to calculate their starting HP 
*	it works by taking a range of +- 15% from their average
*/
public static int calcStartingHP(int averageHP)
	 {
		 Double plusMinus = (averageHP * .15); //calculate 15% difference
		 int diff = plusMinus.intValue();//Convert to an integer
		 
		 int max = (averageHP + diff);//15% higher
		 int min = (averageHP - diff);//15% lower
		 
		//Used for retrieving random number
		 int res = (int) (Math.random()*((max - min) + 1) + min);
		 //returns a number between more or less than 15% of the average monster HP
		 return res;
	 }


}//end class Character
