/*
 * Matthew Szymanski
 * CSCD212
 * Tree description: LEDs, Ruffles, Star, Colorado Blue Spruce, Total:57

Tree description: Blue Balls, Red Balls, Star, Fraser Fir, Total:42

Tree description: Lights, Blue Balls, Silver Balls, Star, Balsam Fir, Total:36

Tree description: Lights, LEDs, Silver Balls, Star, Douglas Fir, Total:41
 */
package treetest;

import holiday_decorations.*;

public class TreeTester {

	public static void main(String[] args) {
	
		HolidayItem mySpruce = new BlueSpruce();
		mySpruce = Star.addStar(mySpruce);
		mySpruce = new Ruffles(mySpruce);
		mySpruce = new LEDs(mySpruce);
		
		HolidayItem myFraser = new FraserFir();
		myFraser = Star.addStar(myFraser);
		myFraser = new RedBalls(myFraser);
		myFraser = new BlueBalls(myFraser);
		
		HolidayItem myBalsam = new BalsamFir();
		myBalsam = Star.addStar(myBalsam);
		myBalsam = new SilverBalls(myBalsam);
		myBalsam = new BlueBalls(myBalsam);
		myBalsam = new Lights(myBalsam);
		
		HolidayItem myDouglas = new DouglasFir();
		myDouglas = Star.addStar(myDouglas);
		myDouglas = new SilverBalls(myDouglas);
		myDouglas = new LEDs(myDouglas);
		myDouglas = new Lights(myDouglas);
		
		
		
		System.out.println();
		
		System.out.println("Tree description: " + mySpruce.getDescription() + ", Total:" + mySpruce.getCost() + "\n");
		
		System.out.println("Tree description: " + myFraser.getDescription() + ", Total:" + myFraser.getCost() + "\n");
		
		System.out.println("Tree description: " + myBalsam.getDescription() + ", Total:" + myBalsam.getCost() + "\n");
		
		System.out.println("Tree description: " + myDouglas.getDescription() + ", Total:" + myDouglas.getCost() + "\n");

		
	}
}
