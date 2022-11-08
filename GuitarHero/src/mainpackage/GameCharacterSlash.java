/*Matthew Szymanski
 * CSCD212
 * Slash class
 */

package mainpackage;
// extends GameCharacter
public class GameCharacterSlash extends GameCharacter {

	public GameCharacterSlash() {
		this.guitarType = new GibsonFlyingV();
		this.soloActBehavior = new SetGuitarOnFire();
	}
	// Print then call
	public void playGuitar() {
		System.out.print("Slash");
		guitarType.guitar();
		
	}
	// Print then call
	public void playSolo() {
		System.out.print("Slash");
		soloActBehavior.soloAct();
	}
	
}
