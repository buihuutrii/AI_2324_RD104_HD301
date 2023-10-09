package baitap_2_6;

import junit.framework.TestCase;

public class QuadraticTest extends TestCase {
	//this is testing 
	public void testWhatKind() {

		Quadratic q1= new Quadratic(0.0, 1.0, 2.0);

		Quadratic q2= new Quadratic(2.0, 1.0, 2.0);

		Quadratic q3= new Quadratic(1.0, 2.0, 1.0);

		Quadratic q4= new Quadratic(2.0, 3.0, 1.0);

		assertEquals("degenerate", q1.whatKind());

		assertEquals("none", q2.whatKind());

		assertEquals("one solution", q3.whatKind());

		assertEquals("two solution", q4.whatKind());

		}
}
