/*Matthew Szymanski
 * CSCD212
 * The upcoming Guitar Hero VIII: Legends of Rock needs a player configuration system.

Guitar Hero VIII lets you play three different characters (Slash, Jimi Hendrix, and Angus Young).
Each character can use one of three different guitars (Gibson SG, Fender Telecaster or Gibson Flying V) as well as 
perform a unique solo act (Put the Guitar on Fire, Jump off the Stage, Smash the Guitar).
 Implement a player configuration system in Java using the Strategy design pattern.  
You should have separate classes to represent each of the components specified.
 */

package mainpackage;

public abstract class GameCharacter {
	// Create guitarType and soloActBehavior
	GuitarType guitarType;
	SoloActBehavior soloActBehavior;
	// Default
	public GameCharacter() {
	
	}
	// method playGuitar
	public void playGuitar() {
		guitarType.guitar();
	}
	// method playSolo
	public void playSolo() {
		soloActBehavior.soloAct();
	}
	// method setSolo
	public void setSolo(SoloActBehavior sab) {
		this.soloActBehavior = sab;	
	}
	// method setGuitar
	public void setGuitar(GuitarType guitarType) {
		this.guitarType = guitarType;
	}
}