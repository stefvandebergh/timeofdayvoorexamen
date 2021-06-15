package timeofday;


/**
 * @invar | getHours() >= 0 && getHours() <= 23
 * @invar | getMinutes() >= 0 && getMinutes() <= 59
 */
public class TimeOfDay {
	/**
	 * @invar | minutesSinceMidnight >= 0 && minutesSinceMidnight <=1439
	 */
	private int minutesSinceMidnight;
	
	
	
	/**
	 * @pre | hours >= 0 && hours <= 23
	 * @pre | minutes >= 0 && minutes <= 59
	 * @post | this.getHours() == hours
	 * @post | this.getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes){
		this.minutesSinceMidnight= 60*hours + minutes;
	}
	
	/**
	 * @basic
	 */
	public int getHours() {
		return minutesSinceMidnight / 60;
	}
	
	/**
	 * @basic
	 */
	public int getMinutes() {
		return minutesSinceMidnight % 60;
	}
	
	/**
	 * @pre | newHours >= 0 && newHours <= 23
	 * @post | newHours == getHours()
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int newHours) {
		this.minutesSinceMidnight = minutesSinceMidnight % 60 + 60 * newHours;
	}
	
	/**
	 * @pre | newMinutes >= 0 && newMinutes <= 59
	 * @post | newMinutes == getMinutes()
	 * @post | getHours() == old(getHours())
	 */
	public void setMinutes(int newMinutes) {
		this.minutesSinceMidnight= minutesSinceMidnight / 60 *60 + newMinutes;
	}
}
