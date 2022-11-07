package Dungeon;

public class Bomb implements Item {
	
	private String bomb = "bomb";
	@Override
	public void useItem(Hero hero, DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		if(Math.random() <= .5)//50/50 shot to blowing up your opponent or yourself
		{
			opponent.subtractHitPoints(50);
			System.out.println(hero.getName() + " throws a bomb at " + opponent.getName() + " and " + opponent.getName() + " takes 50 damage!");
		}
		else
		{
			hero.subtractHitPoints(50);
			System.out.println(hero.getName() + " drops the bomb and it explodes at their feet for 50 damage!");
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.bomb;
	}

}
