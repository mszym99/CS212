/*
 * Matthew Szymanski
 * CSCD212
 * This is basically the only code that you have to write that is different from the rest.
 */

package holiday_decorations;

public abstract class HolidayDecorator extends HolidayItem {
	
	protected HolidayItem component;
	
	public HolidayDecorator(final String description, final int cost, final HolidayItem component) {
		super(description, cost);
		this.component = component;
		
		}			// Override this is basically tyhe decorator class at its finest
	
	@Override
	public int getCost() {
		return super.getCost() + component.getCost(); // override
	}
	
	@Override
	public String getDescription() { // override
		return super.getDescription() + ", " + component.getDescription();
	}
	
		
	}

