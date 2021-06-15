package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(23, 59);
		assert(myTimeOfDay.getHours() == 23);
		assert(myTimeOfDay.getMinutes() == 59);
		myTimeOfDay.setHours(3);
		assert(myTimeOfDay.getHours() == 3);
		assert(myTimeOfDay.getMinutes() == 59);
		myTimeOfDay.setMinutes(40);
		assert(myTimeOfDay.getHours() == 3);
		assert(myTimeOfDay.getMinutes() == 40);
	}

}
