package baitap_3_4;

public class Schedule {
ClockTime departure;
ClockTime arrival;
/**
 * this is constructor
 * example:
 * Schedule s1= new Schedule(c1, c2);
 * @param departure
 * @param arrival
 */
public Schedule(ClockTime departure, ClockTime arrival) {
	this.departure = departure;
	this.arrival = arrival;
}
/**
 * this method to determine time to train start
 * @return
 */
public ClockTime checkTimeDepart() {
	return this.departure ;
}
/**
 * this method compute time between arrival and departure
 * @return ClockTime
 */
public ClockTime returnTimeTrip() {
	int chenhLechGio =this.arrival.hours - this.departure.hours;
	int chenhLechPhut =this.arrival.minute - this.departure.minute;
	if(this.arrival.hours== this.departure.hours && this.arrival.minute== this.departure.minute) {
		return new ClockTime(24, 00);
	}
	if (chenhLechPhut < 0) {
        chenhLechGio--;
        chenhLechPhut += 60;
        if(chenhLechGio < 0) {
        	chenhLechGio=0;
        	}
    }
	
	return new ClockTime(chenhLechGio, chenhLechPhut);
	
}

}
