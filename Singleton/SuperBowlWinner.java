/*
 * Matthew Szymanski
 * CSCD212 Singleton
 * Output:
 * Creating unique instance of Super Bowl Winner;
The one winner of SuperBowl LV is Tampa Bay Buccaneers
SuperBowl LV Winners: Tampa Bay Buccaneers!
The one winner of SuperBowl LV is Tampa Bay Buccaneers
SuperBowl LV Losers: Kansas City Chiefs:(

 */
package main;

public class SuperBowlWinner {
	private boolean winner; // private booleans
	private boolean loser;
	private static SuperBowlWinner uniqueInstance; // needs to be private
	
	private SuperBowlWinner() {
		loser = true; //set =
		winner = false;
	}
	
	public static SuperBowlWinner getOnlyInstance() { //Singleton boom
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Super Bowl Winner:");
			uniqueInstance = new SuperBowlWinner(); //creates only one uniqueInstance
		}
		System.out.println("The one winner of SuperBowl LV is Tampa Bay Buccaneers");
		return uniqueInstance;
	}
	
	public void win() {
		if (isLoser()) { // boolean checks
				loser = false;
				winner = false;
				
		}
	}
	
	public void loss() { // more boolean
		if (isWinner() || isLoser()) {
			// Losing team
			loser = true;
		}
	}
	public boolean isLoser() { //create isLoser
		return loser;
	}
	public boolean isWinner() { //create isWinner
		return winner;
	}
}
