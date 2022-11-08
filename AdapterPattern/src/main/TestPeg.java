/*
 * Matthew Szymanski
 * CSCD212
 * Output:
 * SquarePeg inserts needed: Inserting square peg.
	RoundPeg inserts needed: Inserting round peg.
 */
package main;

public class TestPeg {
	public static void main(String[] args) {
		//pegs created
		RoundPeg roundPeg = new RoundPeg();
		SquarePeg squarePeg = new SquarePeg();
		
		//try insert square peg
		squarePeg.playSquarePeg("Inserting square peg.");
		
		//try round peg
		PegAdapter adapter = new PegAdapter(roundPeg);
		adapter.insert("Inserting round peg.");
	}
}
