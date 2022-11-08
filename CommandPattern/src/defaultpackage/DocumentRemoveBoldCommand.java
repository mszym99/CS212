/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 */
package defaultpackage;

public class DocumentRemoveBoldCommand implements Command{
	
	private Document editableDoc;
	private int line;
	
	
	//EVC
	public DocumentRemoveBoldCommand(final Document doc, final int line)
	{
		this.editableDoc = doc;
		this.line = line;
		editableDoc.removeBold(line);
	}
	
	
	public void undo()
	{//undoes the command
		editableDoc.bold(this.line);
	}
	
	
	public void redo()
	{//removes bold
		editableDoc.removeBold(this.line);
	}
	
	public String toString()
	{
		return "Remove Bold";
	}
}
