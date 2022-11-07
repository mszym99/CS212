package Dungeon;

public class Heal implements SpecialAttack{

	
	//ctrl +c out of original Sorceress class, pulled out for a more plug and play dynamic
	public void SpecAttack(Hero hero, DungeonCharacter opponent) {
    int hPoints;

	hPoints = (int)(Math.random() * (50 - 25 + 1)) + 50;//calculates the hp gained
	hero.addHitPoints(hPoints);//increases hp then adds message with how much hp gained
	System.out.println(hero.getName() + " added [" + hPoints + "] points.\n"
						+ "Total hit points remaining are: "
						+ hero.getHitPoints());
	 System.out.println();
	}
}
