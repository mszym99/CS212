package Dungeon;

public class CrushingBlow implements SpecialAttack {

	//ctrl +c out of original Warrior class, pulled out for a more plug and play dynamic
	public void SpecAttack(Hero hero, DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		if (Math.random() <= .4)//does an attempt to attack
		{
			int blowPoints = (int)(Math.random() * 76) + 100;//calc damage
			System.out.println(hero.getName() + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			opponent.subtractHitPoints(blowPoints);//does damage
		}//end blow succeeded
		else
		{
			System.out.println(hero.getName() + " failed to land a crushing blow");//if fails
			System.out.println();
		}
	}
}
