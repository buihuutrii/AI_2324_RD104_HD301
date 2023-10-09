package baitap_3_4;

import junit.framework.TestCase;

public class TrainTest extends TestCase {
	/**
	 * this is testing for constructor
	 */
public void testConstructor () {
	ClockTime c1 = new ClockTime(3, 2);
	ClockTime c2 = new ClockTime(1, 3);
	
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
}
/**
 * this is testing for  method to check whether customer's destination match the destination of
	 * the train trip 
 */
public void testcheckDes() {
	ClockTime c1 = new ClockTime(3, 2);
	ClockTime c2 = new ClockTime(1, 3);
	
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	assertTrue(t1.checkDes(r2));
	assertFalse(t2.checkDes(r3));
}

/**
 * this is testing for method to determine time to train start
 */
public void testcheckDepartTime() {
	ClockTime c1 = new ClockTime(3, 2);
	ClockTime c2 = new ClockTime(1, 3);
	
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	assertEquals(t1.checkDepartTime(),c1);
	assertEquals(t2.checkDepartTime(),c2);
}
/**
 * this is testing for method compute time between arrival and departure
 */
public void testreturnTimeTrip() {
	ClockTime c1 = new ClockTime(1, 10);
	ClockTime c2 = new ClockTime(1, 30);
	ClockTime c3 = new ClockTime(0, 20);
	Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("long an", "linh trung");
	Route r3 = new Route("long an", "linh tay");
	Schedule s1= new Schedule(c1, c2);
	Schedule s2= new Schedule(c2, c1);
	Train t1 = new Train(s1, r1, false);
	Train t2 = new Train(s2, r2, false);
	assertEquals(t1.returnTimetrip(),c3);
}
}
