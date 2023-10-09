package baitap_1_3;

public class Automobile {
String model;
int price;
double mileage;
boolean used;
/**
 * this is constructor
 * example
 * new Automobile("old",5000,1.23,true);
 * @param model
 * @param price
 * @param mileage
 * @param used
 */
public Automobile(String model, int price, double mileage, boolean used) {
	this.model = model;
	this.price = price;
	this.mileage = mileage;
	this.used = used;
}

}
