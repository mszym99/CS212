package Dungeon;

public class MonsterFactory {

  public MonsterFactory() {
  
  }
  
  public Monster generateMonster(final int choice) {
  
    if(choice < 1 || choice > 3)
      throw new IllegalArgumentException("Please enter a number between 1 and 3");
      
    if(choice == 1)//generates a monster using 1, 2, 3, Gremlin, Ogre, and Skeleton respectively
      return new Gremlin();
     
    if(choice == 2)
      return new Ogre();
      
    if(choice == 3)
      return new Skeleton();
    
    return new Gremlin();
  }
}
