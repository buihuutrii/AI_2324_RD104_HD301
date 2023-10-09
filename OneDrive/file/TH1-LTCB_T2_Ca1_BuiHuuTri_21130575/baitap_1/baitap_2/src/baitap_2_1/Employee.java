package baitap_2_1;

public class Employee {
String name ;
int  hours;
/**
 * this is constructor 
 * @param name
 * @param hoursofwork
 * example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * Employee aEmployee2 = new Employee("Minh", 102);
 */
public Employee(String name, int  hours) {
	this.name = name;
	this.hours = hours;
}
/**
 * Determine the wage of an employee
 * from the number of hours of work
 * @return this.hoursofwork*12
 * Example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee1.wage()//should be 360
 * aEmployee2.wage()//should be 102
  */

int wage() {
	return this.hours*12;
	
}
/**
 * Determine the tax of an employee
 * @return this.wage()*0.15
 * Example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee1.tax()//should be 54.0
 * aEmployee2.tax()//should be 183.0
 */
double tax() {
	return this.wage()*0.15;
	
}
/**
 * Determine the netpay of an employee
 * @return this.wage()-this.tax()
 * Example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee1.netpay()//should be 306.0
 * aEmployee2.netpay()//should be 1040.0
 */
double netpay() {
	return this.wage()-this.tax();
}
/**
 * Raise the wage of employee with 14$
 * @return this.wage()+14
 * Example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee1.raisedWage()//should be 374.0
 * aEmployee2.raisedWage()//should be 1238.0
 */
int raisedWage() {
	return 	this.wage()+14;
}
/**
 * Determine whether the number of hours of work exceed 100
 * @return boolean
 * Employee aEmployee1 = new Employee("Mai", 30);
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee1.checkOverTime();=>False
 * aEmployee2.checkOverTime();=>True
 * 
 */
boolean checkOverTime() {

return this.hours > 100;

}
/**
 * Determine the amount of tax owed base on the grosspay
 * grossPay <=240 --> @return 0.0
 * grossPay <= 480 --> @return grossPay*0.15 
 * else @return grossPay*0.28
 * Example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * aEmployee1.taxWithRate() //should be 54.0
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee2.taxWithRate() //should be 342.72
 */
double taxWithRate() {

double grossPay = this.wage();

if (grossPay <= 240)

return 0.0;

if (grossPay <= 480)

return grossPay * 0.15;

return grossPay * 0.28;

}
/**
 * Determine the net pay of an employee is is the gross pay minus the tax.
 * @return this.wage()- this.taxWithRate()
 * Example:
 * Employee aEmployee1 = new Employee("Mai", 30);
 * aEmployee1.netpayWithRate() //should be 306.0
 * Employee aEmployee2 = new Employee("Minh", 102);
 * aEmployee2.netpayWithRate() //should be 881.28
 */
double netpayWithRate() {
	return this.wage()- this.taxWithRate();
}
}
