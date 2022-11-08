/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 */
package defaultpackage;

public class DocumentWriteCommand implements Command{
	
	private Document editableDoc;
	private String text;
	//EVC
	public DocumentWriteCommand(final Document doc, final String text)
	{
		this.editableDoc = doc;
		this.text = text;
		editableDoc.write(text);
	}
	
	//undo
	public void undo() 
	{
		editableDoc.erase(this.text);
	}
	
	//redo
	public void redo()
	{
		editableDoc.write(this.text);
	}
	
	
	//toStringWrite
	public String toString()
	{
		return "Write";
	}
}

