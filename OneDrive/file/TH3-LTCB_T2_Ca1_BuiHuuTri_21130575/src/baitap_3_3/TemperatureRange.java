package baitap_3_3;

public class TemperatureRange {

	private int low;

	private int high;
/**
 * this is constructor
 * example:
 * TemperatureRange tem1 = new TemperatureRange(20, 50);
	TemperatureRange tem2 = new TemperatureRange(900, 1000);
	TemperatureRange tem3 = new TemperatureRange(-100, 9000);
 * @param low
 * @param high
 */
	public TemperatureRange(int low, int high) {

		this.low = low;

		this.high = high;

	}

	/**
	 * phuong thuc nay kiem tra nhiet do thap co trong khoang nhiet do binh thuong
	 * hay khong
	 * 
	 * @param that
	 * @return
	 */
	public boolean within(TemperatureRange that) {

		return (this.low >= that.low) && (this.high <= that.high);

	}
}
