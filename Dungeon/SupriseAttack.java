package Dungeon;

public class SupriseAttack implements SpecialAttack {

	//ctrl +c out of original Thief class, pulled out for a more plug and play dynamic
	public void SpecAttack(Hero hero, DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		double surprise = Math.random();
		if (surprise <= .4)//
		{
			System.out.println("Surprise attack was successful!\n" +
								hero.getName() + " gets an additional turn.");
			
			hero.attack(opponent);
		}//end surprise
		else if (surprise >= .9)//gets detected if roll is too high
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		}
		else
		    hero.attack(opponent);//attempts an attack if all else fails
	}

}
