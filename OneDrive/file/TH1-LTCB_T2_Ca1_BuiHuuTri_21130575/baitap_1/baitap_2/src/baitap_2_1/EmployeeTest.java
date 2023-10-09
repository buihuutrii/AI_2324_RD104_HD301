package baitap_2_1;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	//this is testing for constructor
	public void testContructor() {

		Employee aEmployee1 = new Employee("Mai", 30);

		Employee aEmployee2 = new Employee("Minh", 102);

		}
	//this is tesing  to determine the wage of an employee
	public void testWage() {
		Employee aEmployee1 = new Employee("Mai", 30);
		Employee aEmployee2 = new Employee("Minh", 102);
		assertEquals(aEmployee1.wage(), 360);
		assertEquals(aEmployee2.wage(), 1224);
		
	}
	//this is testing for method to determine the wage of an employee
	public void testTax() {
		Employee aEmployee1 = new Employee("Mai", 30);
		 Employee aEmployee2 = new Employee("Minh", 102);
		 assertEquals(aEmployee1.tax(), 54.0, 0.001);

		 assertEquals(aEmployee2.tax(), 183.6, 0.001);
	}
	//this is testing for method to determine the netpay of an employee 
	public void testNetpay() {
		Employee aEmployee1 = new Employee("Mai", 30);
		Employee aEmployee2 = new Employee("Minh", 102);
		assertEquals(aEmployee1.netpay(), 306.0, 0.01);
		assertEquals(aEmployee2.netpay(), 1040.4, 0.01);
	}
	//this is testing for method to raise the wage of employee with 14$ 
	public void testRaisedWage() {
		Employee aEmployee1 = new Employee("Mai", 30);
		Employee aEmployee2 = new Employee("Minh", 102);
		assertEquals(aEmployee1.raisedWage(), 374.0, 0.001);
		assertEquals(aEmployee2.raisedWage(), 1238.0, 0.001);
	}
	//this is testing for method to determine whether the number of hours of work exceed 100
	public void testCheckOverTime() {
		Employee aEmployee1 = new Employee("Mai", 30);
		Employee aEmployee2 = new Employee("Minh", 102);
		assertFalse(aEmployee1.checkOverTime());
		assertTrue(aEmployee2.checkOverTime());
	}
	//this is testing for method to determine the amount of tax owed base on the grosspay
	public void testTaxWithRate() {

		Employee aEmployee1 = new Employee("Mai", 30);

		assertEquals(aEmployee1.taxWithRate(), 54.0, 0.001);

		Employee aEmployee2 = new Employee("Minh", 102);

		assertEquals(aEmployee2.taxWithRate(), 342.72, 0.001);

		}
	//this is testing for method to determine the netpay of an employee is is the gross pay minus the tax.
	public void testNetpayWithRate() {

		Employee aEmployee1 = new Employee("Mai", 30);

		assertEquals(aEmployee1.netpayWithRate(), 306.0, 0.001);

		Employee aEmployee2 = new Employee("Minh", 102);

		assertEquals(aEmployee2.netpayWithRate(), 881.28, 0.001);

		}
	
}
