/*
 * Matthew Szymanski
 * CSCD212
 * This is basically the only code that you have to write that is different from the rest.
 */
package holiday_decorations;

public class HolidayItem {
	
	private String description;
	private int cost;
	
	public HolidayItem(final String description, final int cost) {
		if(description == null || cost < 0) { // Throw exception
			throw new IllegalArgumentException("Not compatable.");
		}
		
		this.description = description;
		this.cost = cost;
	}
	
	public String getDescription() { // getDescription
		return description;
	}

	public int getCost() { // getCost
		return cost;
	}
	
}
