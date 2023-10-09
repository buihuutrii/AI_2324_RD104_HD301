package baitap_1_1;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	/**
	 * this is testing for constructor
	 */
public void testConstructor () {
	Book q1 = new Book("Robinson Crusoe", 15.50, 1719, "Daniel Defoe");
	Book q2 = new Book("Heart of Darkness", 12.80, 1902, "Joseph Conrad");
	Book q3 = new Book("Beach Music", 9.50, 1996, "Pat Conroy");
}
}
