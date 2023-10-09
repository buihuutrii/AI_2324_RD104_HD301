package baitap_3_3;

public class WeatherRecord {

	private Date d;

	private TemperatureRange today;

	private TemperatureRange normal;

	private TemperatureRange record;

	private double precipitation;
	/**
	 * this is constructor
	 * example:
	 * WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem1, tem1, tem3, 60);
	 * @param d
	 * @param today
	 * @param normal
	 * @param record
	 * @param precipitation
	 */

	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal,

			TemperatureRange record, double precipitation) {

		this.d = d;

		this.today = today;

		this.normal = normal;

		this.record = record;

		this.precipitation = precipitation;

	}

	/**
	 * this method to determines whether today's high and low were within the normal
	 * range; 
	 * example:
	 * Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem2, tem1, tem3, 60);
	
	q1.withinRange()=true
	q2.withinRange()=> false
	 * @return
	 */
	public boolean withinRange() {

		return this.today.within(this.normal);

	}

	/**
	 * this method to determines whether the precipitation is higher than some given
	 * value;
	 *  example:
	 * Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem2, tem1, tem3, 60);
	
	q1.rainyDay(50)=>false
	q2.rainyDay(50)=>true
	 * @param thatPrecipitation
	 * @return
	 */
	public boolean rainyDay(double thatPrecipitation) {

		return this.precipitation >= thatPrecipitation;

	}

	/**
	 * this method to determines whether the temperature today broke either the high
	 * or the low record. 
	 * example:
	 * Date d1 = new Date(1, 3,2020);
	Date d2 = new Date(1, 4,2020);
	
	TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(-900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
	
	WeatherRecord q1 = new WeatherRecord(d1, tem1, tem1, tem3, 40);
	WeatherRecord q2 = new WeatherRecord(d2, tem2, tem1, tem3, 60);
	
	q2.recordDay()=> true
	q1.recordDay()=>false
	 * @return
	 */
	public boolean recordDay() {

		return !this.today.within(this.record);

	}
}
