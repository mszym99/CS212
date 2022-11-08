/*
 * Matthew Szymanski
 * CSCD212
 * Command Pattern
 */
package defaultpackage;
import java.util.ArrayList;

public class Document {
	//Array containing Strings
	private ArrayList<String> textArray;
	
	
	private String name;//doc name
	
	
	//EVC
	public Document(final String name)
	{
		this.name = name;
		this.textArray = new ArrayList<String>();
	}
	
	
	//Adds to the existing document
	public void write(String text)
	{
		this.textArray.add(text);
	}
	
	
	//erases text
	public void erase(String text)
	{
		this.textArray.remove(text);
	}
	
	
	
	//bolds the line
	public void bold(int number)
	{
		StringBuffer txt = new StringBuffer();
		txt.append("<b>" + this.textArray.get(number) + "<b>");
		textArray.set(number, txt.toString());
	}
	
	
	
	
	public void removeBold(int number)
	{ // removes boldness
		String txt = textArray.get(number);
		txt = txt.substring(3, txt.length() - 4);
		textArray.set(number, txt.toString());
	}
	
	
	
	//erases line
	public void erase(int number)
	{
		this.textArray.remove(number);
	}
	
	
	//reads and displays the contents of the Doc
	public String read()
	{
		StringBuffer txt = new StringBuffer();
		txt.append("Contents of: " + this.name + " \n");
		
		for(int i = 0; i < textArray.size(); i++)
		{
			txt.append(i + ": " + textArray.get(i) + "\n");
		}
		return txt.toString();
	}
}
