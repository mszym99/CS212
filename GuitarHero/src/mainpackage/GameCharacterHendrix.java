/*Matthew Szymanski
 * CSCD212
 * Hendrix class
 */

package mainpackage;
	// Extends gamecharacter
public class GameCharacterHendrix extends GameCharacter {

	public GameCharacterHendrix() {
		// Gives game character method unique guitar and solo per character
		this.guitarType = new GibsonSG();
		this.soloActBehavior = new JumpOffStage();
	}
	// Print then call
	public void playGuitar() {
		System.out.print("Hendrix");
		guitarType.guitar();
		
	}
	// Print then call
	public void playSolo() {
		System.out.print("Hendrix");
		soloActBehavior.soloAct();
	}
	

}
