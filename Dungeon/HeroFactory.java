package Dungeon;

public class HeroFactory {
  
  public HeroFactory() {
  
  }//DVC
  
  public Hero generateHero(final int choice) {
    
    if(choice < 1 || choice > 3)//error catching
        throw new IllegalArgumentException("Please enter a number between 1 and 3 to select hero");
    
    if(choice == 1)//if choice == 1, then warrior is selected, 2 thief, 3 Sorceress
        return new Warrior();
    
    if(choice == 3)
        return new Thief();
    
    if(choice == 2)
        return new Sorceress();
  
    return new Warrior();
  }
}
