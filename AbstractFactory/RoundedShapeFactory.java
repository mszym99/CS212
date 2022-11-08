/*
 * Matthew Szymanski
 * CSCD212
 * 
 * 
 */
package main;

public class RoundedShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle(); // first option
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 //in not first then second
		return null;
	}
	
}
