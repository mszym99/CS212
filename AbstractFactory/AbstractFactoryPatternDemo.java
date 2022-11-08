/*
 * Matthew Szymanski
 * CSCD212
 * Output:
 * Inside Rectangle::draw() method.
Inside Square::draw() method.
Inside RoundedRectangle::draw() method.
Inside RoundedSquare::draw() method.

 * 
 */
package main;

public class AbstractFactoryPatternDemo {
	
		
		public static void main(String[] args) {
			
			// get shape factory needed
			AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
			
			// get an object that is a rectangle shape
			Shape shape1 = shapeFactory.getShape("Rectangle");
			
			//call the draw method of the rectangle
			shape1.draw();
			
			//get an object of Shape Square 
		    Shape shape2 = shapeFactory.getShape("SQUARE");
		      
		    //call the method that is square
		    shape2.draw();
		    
		    //get the factory
		    AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		    
		    //get an object of the RoundedRectangle
		    Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		    
		    //call draw method of Shape Rectangle
		    shape3.draw();
		    
		    //get an object of Shape Square 
		    Shape shape4 = shapeFactory1.getShape("SQUARE");
		    
		    //call draw method of Shape Square
		    shape4.draw();
		}

	}

