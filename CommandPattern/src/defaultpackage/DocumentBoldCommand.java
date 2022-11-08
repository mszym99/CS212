/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 */
package defaultpackage;

public class DocumentBoldCommand implements Command{
	
	private Document editableDoc;
	private int line;
	//EVC
	public DocumentBoldCommand(final Document doc, final int line)
	{
		this.editableDoc = doc;
		this.line = line;
		editableDoc.bold(line);
	}
	
	
	
	//undo
	public void undo()
	{
		editableDoc.removeBold(this.line);
	}
	
	
	//redo
	public void redo()
	{
		editableDoc.bold(this.line);
	}
	
	//toStringBold
	public String toString()
	{
		return "Bold";
	}
}
