/*
 * Matthew Szymanski
 * CSCD212
 */
package main;

public class RoundPeg implements AdvancedShapePlayer{
		@Override
		public void playRoundPeg(String name) {
			System.out.println("RoundPeg inserts needed: " + name);
		}
		
		@Override
		public void playSquarePeg(String name) {
			//do nothing
		}
}
