package baitap_3_4;

public class Route {
	String origin;
	String destination;

	/**
	 * this is constructor
	 * example:
	 * Route r1 = new Route("ben cau", "linh trung");
	Route r2 = new Route("ben cau", "linh tay");
	 * @param origin
	 * @param destination
	 */
	public Route(String origin, String destination) {

		this.origin = origin;
		this.destination = destination;
	}

//	/**
//	 * this method to check whether customer's destination match the destination of
//	 * the train trip
//	 * example:
//	 * 
//	 * @param hisroute
//	 * @return
//	 */
//	public boolean checkDes(Route hisroute) {
//		return this.destination == hisroute.destination;
//	}
}
