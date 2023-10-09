package baitap_1_5;

public class Address {
double housenumber;
String streetname;
String city;
/**
 * this is constructor 
 * @param housenumber
 * @param streetname
 * @param city
 * Example 
 * new Address(23, "Maple", "Brookline");
 * new Address(5, "Joye Road", "Newton");
 * new Address(83, "Winslow Road", "Waltham");
 */
public Address(double housenumber, String streetname, String city) {
	this.housenumber = housenumber;
	this.streetname = streetname;
	this.city = city;
}

}
