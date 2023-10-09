package baitap_2_7;

class Transaction {

String customerName;

double depositeAmount;

int maturity;

Transaction(String customerName,
double depositeAmount, int maturity) {

this.customerName = customerName;

this.depositeAmount = depositeAmount;

this. maturity = maturity;

}
/**
 * this method consumes a
deposit amount and produces the actual amount of
interest that the money earns in a year with condition :
deposits of up to $1,000 =>flat is 4%
deposits of up to $5,000 =>flat is 4.5%
deposits of more than $5,000 =>flat is 5%

example:
Transaction t1 = new Transaction("Thuy", 6000, 2);

		Transaction t2 = new Transaction("Mai", 2500, 1);

		Transaction t3 = new Transaction("Nam", 1500, 2);

		Transaction t4 = new Transaction("Tien", 500, 2);

		t1.interest() => 300.0 

		t2.interest() =>112.5 

		t3.interest() => 67.5

		 t4.interest()=> 20.0

 * @return
 */
double interest() {

if (this.depositeAmount <= 1000)

return this.depositeAmount * 0.04;

if (this.depositeAmount <= 5000)

return this.depositeAmount * 0.045 ;

return this.depositeAmount * 0.05 ;

}
/**
 * this method to consumes a
charge amount and computes the corresponding
pay-back amount
Example:
Transaction t1 = new Transaction("Thuy", 6000, 2);

		Transaction t2 = new Transaction("Mai", 2500, 1);

		Transaction t3 = new Transaction("Nam", 1500, 2);

		Transaction t4 = new Transaction("Tien", 500, 2);

		 t1.payback() =>48.75

		t2.payback() => 13.75 

		 t3.payback()=>6.25

		t4.payback() => 1.25 


 * @return
 */
double payback() {

if (this.depositeAmount <= 500)

return this.depositeAmount * 0.0025;

if (this.depositeAmount <= 1500)

return 500 * 0.0025 + (this.depositeAmount - 500)* 0.005 ;

if (this.depositeAmount <= 2500 )

return 500 * 0.0025 + 1000 * 0.005 +

(this.depositeAmount -1500)* 0.0075;

return 500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 +

(this.depositeAmount - 2500)* 0.01;

}

}
