package baitap_1_5;

public class House {
String kind;
int numberofroom;
double price;
Address address;
/**
 * this is constructor
 * @param kind
 * @param numberofroom
 * @param price
 * @param address
 * Example:
 * new House("Ranch", 7, 375000, new Address(23, "Maple", "Brookline") );
 * new House("Colonial", 9, 450000,new Address(5, "Joye Road", "Newton") );
 *  new House("Cape", 6, 235000,new Address(83, "Winslow Road", "Waltham"));
 */
public House(String kind, int numberofroom, double price, Address address) {
	
	this.kind = kind;
	this.numberofroom = numberofroom;
	this.price = price;
	this.address = address;
}

}
