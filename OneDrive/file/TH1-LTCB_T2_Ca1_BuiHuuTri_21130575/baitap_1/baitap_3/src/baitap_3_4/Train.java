package baitap_3_4;

public class Train {
	Schedule schedule;
	Route route;
	boolean local;

	/**
	 * this is constructor example:
	 *Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	 * @param schedule
	 * @param route
	 * @param local
	 */
	public Train(Schedule schedule, Route route, boolean local) {

		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}
	

	/**
	 * this method to check whether customer's destination match the destination of
	 * the train trip
	 * example:
	 * ClockTime c1 = new ClockTime(3, 2);
	ClockTime c2 = new ClockTime(1, 3);
	
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	t1.checkDes(r2) =>True
	t2.checkDes(r3) => False
	 * @param hisroute
	 * @return
	 */
	public boolean checkDes(Route hisroute) {
		return this.route.destination == hisroute.destination;
	}
	
	/**
	 * this method to determine time to train start
	 * example:
	 * ClockTime c1 = new ClockTime(3, 2);
	ClockTime c2 = new ClockTime(1, 3);
	
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	t1.checkDepartTime()   //should be c1
	t2.checkDepartTime()   //should be c2
	 * @return
	 */
public ClockTime checkDepartTime() {
	return this.schedule.checkTimeDepart();
}
/**
 * this method compute time between arrival and departure
 * example:
 * ClockTime c1 = new ClockTime(1, 10);
	ClockTime c2 = new ClockTime(1, 30);
	ClockTime c3 = new ClockTime(0, 20);
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	t1.returnTimetrip() //should be c3
 */
public ClockTime returnTimetrip() {
	return this.schedule.returnTimeTrip();
}
}
