package baitap_3_3;

import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
	//this is testing for constructor
public void testConstructor () {
	Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem1, tem1, tem3, 60);
}
/**
 * this is testing for method determines whether today's high and
low were within the normal range;
 */
public void testwithinRange() {
	Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem2, tem1, tem3, 60);
	
	assertTrue(q1.withinRange());
	assertFalse(q2.withinRange());
}
/**
 * this is testing for method determines whether the precipitation is
higher than some given value;
 */
public void testrainyDay() {
	Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem2, tem1, tem3, 60);
	
	assertFalse(q1.rainyDay(50));
	assertTrue(q2.rainyDay(50));
}
/**
 * this is testing for method determines whether the temperature
today broke either the high or the low record.
 */
public void testrecordDay() {
	Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(-900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem2, tem1, tem3, 60);
	
	assertTrue(q2.recordDay());
	assertFalse(q1.recordDay());
}
}
