package baitap_1_7;

public class WeatherRecord {
Date d;
TemperatureRange today;
TemperatureRange normal;
TemperatureRange record;
double precipitation;
/**
 * this is constructor
 * @param d
 * @param today
 * @param normal
 * @param record
 * @param precipitation
 */
public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
		double precipitation) {
	
	this.d = d;
	this.today = today;
	this.normal = normal;
	this.record = record;
	this.precipitation = precipitation;
}

}
