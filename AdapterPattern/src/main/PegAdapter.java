/*
 * Matthew Szymanski
 * CSCD212
 */

package main;
//main adapter
public class PegAdapter extends SquarePeg {

	private RoundPeg roundPeg;
	
	public PegAdapter(RoundPeg peg) { // Adapts round peg into a square peg
		this.roundPeg = peg;
	}
	
	public void insert(String str) {
		roundPeg.playRoundPeg(str);
	}
}
