/*
 * Matthew Szymanski
 * CSCD212
 * 
 */

package mainpack;

public class GoodGuys {

	
	//DVC
	public GoodGuys(){
		
	}
	
	//types of people
	int hobbit;
	int dwarf;
	int human;
	int elf;
	
	//EVC
	
	public GoodGuys(int hobbit, int elf, int dwarf, int human) {
		this.hobbit = hobbit;
		this.dwarf = dwarf;
		this.human = human;
		this.elf = elf;
		
	}
	//Display
	@Override
	public String toString() {
			return "Hobbits: " + this.hobbit + "\n" + 
					"Elves: " + this.elf + "\n" + 
					"Dwarves: " + this.dwarf + "\n" + 
					"Humans: " + this.human + "\n"; 
			//System.out.println(this.name + "knows about -\n" + args);
			
			}
	
	
	
	
}
