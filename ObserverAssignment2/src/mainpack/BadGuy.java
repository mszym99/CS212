package mainpack;
/*
 * Matthew Szymanski
 * CSCD212
 * 
 */
import java.util.Observable; //class
import java.util.Observer; //interface

//Bad guy class is the observer that observers the subjects information
public class BadGuy implements Observer{

	// declare variables private use this.
	private EyeOfSauron eyeOfSauron;
	private String name;
	

	
	
	//DVC constructor to create BadGuy object
	
	public BadGuy(EyeOfSauron eyeOfSauron, String name) {
		this.eyeOfSauron = eyeOfSauron;
		this.name = name;
		this.eyeOfSauron.addObserver(this); // Using itself to add Observer to itself
	}
	
	
	//Update the user that the data has been updated
	@Override
	public void update(Observable obs, Object args) {
		//Observable obs, Object arg^^^
		if (obs instanceof EyeOfSauron) {
			//System.out.println this.name + " knows about -\n"
			GoodGuys gg = (GoodGuys)args;
			
			System.out.println(this.name + " knows about -\n" + args);
			
		}
		
	}
	
	public void defeated() {
		System.out.println(this.name + " was defeated. \n");
		this.eyeOfSauron.deleteObserver(this);
	}
}
