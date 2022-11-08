/*
 * Matthew Szymanski
 * CSCD212
 * 
 */
package holiday_decorations;

public class Star extends HolidayDecorator {

	private Star(final HolidayItem component) {
		super("Star", 4, component);
		
	} // Star was avery confusing one for me
	
	public static HolidayItem addStar(final HolidayItem component) {
		if(component.getDescription().contains("star, ")) {
			System.out.println("already has a star.");
			return component;
		}
		
		else { // if else for the extra star.
			HolidayItem newComponent = new Star(component);
			
			return newComponent;
		}
	}
}
