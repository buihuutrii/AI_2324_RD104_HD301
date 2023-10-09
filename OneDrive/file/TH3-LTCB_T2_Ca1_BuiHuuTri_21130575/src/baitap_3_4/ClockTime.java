package baitap_3_4;

public class ClockTime {
int hours;
int minute;
/**
 * this is constructor
 * example:
 * ClockTime c1 = new ClockTime(3, 2);
	ClockTime c2 = new ClockTime(1, 3);
 * @param hours
 * @param minute
 */
public ClockTime(int hours, int minute) {
	
	this.hours = hours;
	this.minute = minute;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if (null==obj || !(obj instanceof ClockTime))

		return false;

		else {

		ClockTime that = (ClockTime) obj;

		return (this.hours==that.hours)

		&& (this.minute == that.minute);

		}
}

}
