/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 */
package defaultpackage;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;

public class DocumentInvoker{

	private ArrayList<Command> commands = new ArrayList<Command>();
	private Document currentDoc;
	
	
	//EVC
	public DocumentInvoker(final String name)
	{
		this.currentDoc = new Document(name);
	}
	
	
	//redo 
	public void redo(int level)
	{
		Command tmp;
		System.out.println("--- Redo level" + level);
		tmp = (Command) commands.get(level);
		tmp.redo();
	}
	
	
	//undo
	public void undo(int level)
	{
		Command tmp;
		System.out.println("--- Undo level" + level);
		tmp = (Command) commands.get(level);
		tmp.undo();
	}
	
	
	//writes
	public void write(String text)
	{
		DocumentWriteCommand cmd = new DocumentWriteCommand(this.currentDoc, text);
		this.commands.add(cmd);
	}
	
	
	//erases
	public void erase(String text)
	{
		DocumentEraseCommand cmd = new DocumentEraseCommand(this.currentDoc, text);
		this.commands.add(cmd);
	}
	
	
	//bolds
	public void bold(int line)
	{
		DocumentBoldCommand cmd = new DocumentBoldCommand(this.currentDoc, line);
		this.commands.add(cmd);
	}
	
	
	//removes bold
	public void removeBold(int line)
	{
		DocumentRemoveBoldCommand cmd = new DocumentRemoveBoldCommand(this.currentDoc, line);
		this.commands.add(cmd);
	}
	
	
	//reads the Doc
	public String read()
	{
		return currentDoc.read();
	}
	
	
	//displays CommandBuffer
	public void printCommandBuffer()
	{
		StringBuffer txt = new StringBuffer();
		txt.append("--- Commands issued ---\n");
	
		for(int i = 0; i <= this.commands.size(); i++)
		{
			txt.append(i + ":" + (Command) commands.get(i) + "\n");
		}
		System.out.println(txt.toString());
	}
}
