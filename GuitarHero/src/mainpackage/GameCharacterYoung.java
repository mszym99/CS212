/*Matthew Szymanski
 * CSCD212
 * young
 */

package mainpackage;
// extends GameCharacter
public class GameCharacterYoung extends GameCharacter { // inheritence
							// new
	public GameCharacterYoung() {
		this.guitarType = new FenderTelecaster();
		this.soloActBehavior = new SmashGuitar();
	}
	// Print then call
	public void playGuitar() {
		System.out.print("Angus Young");
		guitarType.guitar();
		
	}
	// Print then call
	public void playSolo() {
		System.out.print("Angus Young");
		soloActBehavior.soloAct();
	}
	
}
