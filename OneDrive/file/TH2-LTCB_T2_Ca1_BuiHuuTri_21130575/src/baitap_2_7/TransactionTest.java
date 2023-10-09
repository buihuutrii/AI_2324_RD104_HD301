package baitap_2_7;

import junit.framework.TestCase;

public class TransactionTest extends TestCase {
	//this is testing for method to compute interest
	public void testInterest(){

		Transaction t1 = new Transaction("Thuy", 6000, 2);

		Transaction t2 = new Transaction("Mai", 2500, 1);

		Transaction t3 = new Transaction("Nam", 1500, 2);

		Transaction t4 = new Transaction("Tien", 500, 2);

		assertEquals(300.0, t1.interest(), 0.001);

		assertEquals(112.5, t2.interest(), 0.001);

		assertEquals(67.5, t3.interest(), 0.001);

		assertEquals(20.0, t4.interest(), 0.001);

		}
	//this is testing for method to compute charges pay back for a customer makes over a year.
	public void testPayback() {

		Transaction t1 = new Transaction("Thuy", 6000, 2);

		Transaction t2 = new Transaction("Mai", 2500, 1);

		Transaction t3 = new Transaction("Nam", 1500, 2);

		Transaction t4 = new Transaction("Tien", 500, 2);

		assertEquals(48.75, t1.payback(), 0.001);

		assertEquals(13.75, t2.payback(), 0.001);

		assertEquals(6.25, t3.payback(), 0.001);

		assertEquals(1.25, t4.payback(), 0.001);

		}
}
