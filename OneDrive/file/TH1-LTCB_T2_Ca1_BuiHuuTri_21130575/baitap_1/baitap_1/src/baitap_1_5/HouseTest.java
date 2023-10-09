package baitap_1_5;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	/**
	 * this is testing for constructor
	 */
public void testConstructor() {
	new House("Ranch", 7, 375000, new Address(23, "Maple", "Brookline") );
	new House("Colonial", 9, 450000,new Address(5, "Joye Road", "Newton") );
	new House("Cape", 6, 235000,new Address(83, "Winslow Road", "Waltham"));
 
}
}
