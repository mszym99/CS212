package mainpack;
/*
 * Matthew Szymanski
 * CSCD212
 * 
 */

import java.util.Observable;

public class EyeOfSauron extends Observable {
	
	//DVC
	public EyeOfSauron() {
		
	}
	
	//constructor no-arg
	public void enemiesSpotted(GoodGuys gg) {
		
		//Built in method form Observerable class.
		//This method returns marks theis Observable object as having been changed
		//The hasChanged method will now return true.
		
		setChanged();
		
		//eye.enemiesSpotted(gg);
		notifyObservers(gg);
		
		clearChanged();
	}

}
