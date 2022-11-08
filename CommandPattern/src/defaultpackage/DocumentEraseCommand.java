/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 */
package defaultpackage;

public class DocumentEraseCommand implements Command{

	private Document editableDoc;
	private String text;
	//EVC
	public DocumentEraseCommand(final Document editableDoc, final String text)
	{
		this.editableDoc = editableDoc;
		this.text = text;
		editableDoc.erase(text);
	}
	
	
	//undoes the function
	public void undo()
	{
		editableDoc.write(this.text);
	}
	
	
	//does the same function
	public void redo()
	{
		editableDoc.erase(this.text);
	}
	
	
	//toString
	public String toString()
	{
		return "Erase";
	}
}