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

public class SuperBowlControl {
	public static void main(String[] args) {
		SuperBowlWinner win = SuperBowlWinner.getOnlyInstance();// win
		win.win(); //calling methods
		win.loss();
		System.out.println("SuperBowl LV Winners: Tampa Bay Buccaneers!");
		SuperBowlWinner loss = SuperBowlWinner.getOnlyInstance(); //loss
		loss.win();
		loss.loss();
		System.out.println("SuperBowl LV Losers: Kansas City Chiefs:(");
	}
}
