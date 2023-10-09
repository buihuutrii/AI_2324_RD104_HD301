package baitap_3_1;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	/**
	 * this is testing for constructor
	 */
	public void testConstructor() {
		Address a1 = new Address(23, "Mapple Street", "Brookline");
		Address a2 = new Address(5, "Joye Road", "Newton");
		Address a3 = new Address(83, "Winslow Road", "Waltham");

		House h1 = new House("Ranch", 7, 375000, a1);
		House h2 = new House("Colonial", 9, 450000, a2);
		House h3 = new House("Cape", 6, 235000, a3);

	}

//this is testing for hasMoreRoom method 
	public void testHasMoreRooms() {

		House house1 = new House("Ranch", 7,

				375000, new Address(23, "Mapple Street", "Brooklyn"));

		House house2 = new House("Colonial", 9,

				450000, new Address(5, "Jove Road", "Newton"));

		House house3 = new House("Cape", 6,

				235000, new Address(83, "Winslow Road", "Waltham"));

		assertFalse(house1.hasMoreRoom(house2));

		assertTrue(house2.hasMoreRoom(house3));

	}
//this is testing for method testThisCity
	public void testThisCity() {
		House house1 = new House("Ranch", 7,

				375000, new Address(23, "Mapple Street", "Brooklyn"));

		House house2 = new House("Colonial", 9,

				450000, new Address(5, "Jove Road", "Newton"));

		House house3 = new House("Cape", 6,

				235000, new Address(83, "Winslow Road", "Waltham"));

		assertTrue(house1.inThisCity("Brooklyn"));

		assertFalse(house1.inThisCity("Newton"));

	}
	//this is testing for method testSameCity
	public void testSameCity() {

		House house1 = new House("Ranch", 7,

				375000, new Address(23, "Mapple Street", "Brooklyn"));

		House house2 = new House("Colonial", 9,

				450000, new Address(5, "Jove Road", "Newton"));

		House house3 = new House("Cape", 6,

				235000, new Address(83, "Winslow Road", "Waltham"));

		assertTrue(house1.sameCity(house1));

		assertFalse(house1.sameCity(house2));

	}
}
