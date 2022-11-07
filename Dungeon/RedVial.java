package Dungeon;

public class RedVial implements Item {
	
	private String name = "Red Vial";
	@Override
	public void useItem(Hero hero, DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		if(Math.random() <= .9)//random chance between healing and getting poisoned
		{
			hero.addHitPoints(50);
			System.out.println(hero.getName() + " downs the healing potion and regains 50 hp!");
		}
		else
		{
			hero.subtractHitPoints(50);
			System.out.println(hero.getName() + " downs the red vial and finds it is a vial of poison! " + hero.getName() + " takes 50 damage!");
		}
	}
	
	public String getName()
	{
		return this.name;
	}
}
