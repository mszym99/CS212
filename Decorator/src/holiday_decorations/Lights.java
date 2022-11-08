/*
 * Matthew Szymanski
 * CSCD212
 * 
 */
package holiday_decorations;

public class Lights extends HolidayDecorator { // These are alot of rinse and repeat code
	public Lights(final HolidayItem component) {
		super("Lights", 2, component);
	}
}
