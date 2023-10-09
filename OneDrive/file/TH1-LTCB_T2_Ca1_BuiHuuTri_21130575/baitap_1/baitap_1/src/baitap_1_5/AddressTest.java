package baitap_1_5;

import junit.framework.TestCase;

public class AddressTest extends TestCase {
	/**
	 * this is testing for constructor
	 */
public void testConstructor() {
	new Address(23, "Maple", "Brookline");
	new Address(5, "Joye Road", "Newton");
	new Address(83, "Winslow Road", "Waltham");
}
}