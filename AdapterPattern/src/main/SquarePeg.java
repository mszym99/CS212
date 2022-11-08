/*
 * Matthew Szymanski
 * CSCD212
 */
package main;

public class SquarePeg implements AdvancedShapePlayer {

		@Override
		public void playRoundPeg(String name) {
			// nothing happens
		}
	
	
	
		public void playSquarePeg(String name) {
			System.out.println("SquarePeg inserts needed: " + name);
		}
}
