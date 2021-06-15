package timeofday;


/**
 * @invar | getHours() >= 0 && getHours() <= 23
 * @invar | getMinutes() >= 0 && getMinutes() <= 59
 */
public class TimeOfDay {
	/**
	 * @invar | hours >= 0 && hours <= 23
	 * @invar | minutes >= 0 && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	
	
	/**
	 * @pre | hours >= 0 && hours <= 23
	 * @pre | minutes >= 0 && minutes <= 59
	 * @post | this.getHours() == hours
	 * @post | this.getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes){
		this.hours= hours;
		this.minutes = minutes;
	}
	
	/**
	 * @basic
	 */
	public int getHours() {
		return this.hours;
	}
	
	/**
	 * @basic
	 */
	public int getMinutes() {
		return this.minutes;
	}
	
	/**
	 * @pre | newHours >= 0 && newHours <= 23
	 * @post | newHours == getHours()
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int newHours) {
		this.hours = newHours;
	}
	
	/**
	 * @pre | newMinutes >= 0 && newMinutes <= 59
	 * @post | newMinutes == getMinutes()
	 * @post | getHours() == old(getHours())
	 */
	public void setMinutes(int newMinutes) {
		this.minutes = newMinutes;
	}
}
