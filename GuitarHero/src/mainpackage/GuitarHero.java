/*Matthew Szymanski
 * CSCD212
 * The upcoming Guitar Hero VIII: Legends of Rock needs a player configuration system.

Guitar Hero VIII lets you play three different characters (Slash, Jimi Hendrix, and Angus Young).
Each character can use one of three different guitars (Gibson SG, Fender Telecaster or Gibson Flying V) as well as 
perform a unique solo act (Put the Guitar on Fire, Jump off the Stage, Smash the Guitar).
 Implement a player configuration system in Java using the Strategy design pattern.  
You should have separate classes to represent each of the components specified.The upcoming Guitar Hero VIII: 
Legends of Rock needs a player configuration system.
Output:
Slash is playing a Gibson Flying V!
Hendrix is playing a Gibson SG!
Angus Young is playing a Fender Telecaster!
Slash set the guitar on fire!
Hendrix jumped off the stage
Angus Young smashed the guitar!
Slash jumped off the stage
Hendrix smashed the guitar!
Angus Young set the guitar on fire!
Slash is playing a Gibson SG!
Hendrix is playing a Fender Telecaster!
Angus Young is playing a Gibson Flying V!


 */


package mainpackage;

public class GuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create GameCharacters
		
		GameCharacter player1 = new GameCharacterSlash();
		GameCharacter player2 = new GameCharacterHendrix();
		GameCharacter player3 = new GameCharacterYoung();
		//Method playGuitar
		player1.playGuitar();
		player2.playGuitar();
		player3.playGuitar();
		//Method playSolo
		player1.playSolo();
		player2.playSolo();
		player3.playSolo();
		
		// Adds unique solo
		player1.setSolo(new JumpOffStage());
		player2.setSolo(new SmashGuitar());
		player3.setSolo(new SetGuitarOnFire());
		// calls solo method
		player1.playSolo();
		player2.playSolo();
		player3.playSolo();
		// setGuitar Method
		player1.setGuitar(new GibsonSG());
		player2.setGuitar(new FenderTelecaster());
		player3.setGuitar(new GibsonFlyingV());
		// plays that unique GuitarMethod
		player1.playGuitar();
		player2.playGuitar();
		player3.playGuitar();
		
		
	}

}
