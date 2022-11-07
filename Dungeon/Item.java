package Dungeon;
//interface used for items
public interface Item {
	public void useItem(Hero hero, DungeonCharacter opponent);
	public String getName();
}
