/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 * Output:
 --- Undo level0
Contents of: message_to_Nancy_Ripplinger 
0: Time you straightened right out
1: think about this
2: Stop in time

--- Undo level1
Contents of: message_to_Nancy_Ripplinger 
0: think about this
1: Stop in time

Contents of: message_to_Nancy_Ripplinger 
0: <b>think about this<b>
1: Stop in time

Contents of: message_to_Nancy_Ripplinger 
0: think about this
1: Stop in time
 * 
 */

package defaultpackage;

public class TestEditor {

	public static void main(String[] args) {
		DocumentInvoker myDocument = new DocumentInvoker("message_to_Nancy_Ripplinger");
		
		myDocument.write("Better think of your future");
		
		myDocument.write("Time you straighened right out");
		
		myDocument.write("think about this");
		
		myDocument.write("Stop in time");
		
		myDocument.undo(0);//undoes the command at 0
		System.out.println(myDocument.read());
		
		myDocument.undo(1);
		System.out.println(myDocument.read());
		
		myDocument.bold(0);//gives bold text <b>
		System.out.println(myDocument.read());
		
		myDocument.removeBold(0);;//rms bold
		System.out.println(myDocument.read());
	}

}