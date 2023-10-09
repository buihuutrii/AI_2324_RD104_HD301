package baitap_3_1;

public class Address {
int houseNum;
String street;
String city;
/**
 * this is constructor
 * example:
 * Address a1 = new Address(23, "Mapple Street", "Brookline");
	Address a2 = new Address(5, "Joye Road", "Newton");
	Address a3 = new Address(83, "Winslow Road", "Waltham");
 * @param houseNum
 * @param street
 * @param city
 */
public Address(int houseNum, String street, String city) {
	this.houseNum = houseNum;
	this.street = street;
	this.city = city;
}
/**
 * this method to check whether this city same other city
 * @param thatCity
 * @return
 */
public boolean inThisCity(String thatCity) {

return this.city.equals(thatCity);

}
/**
 * this method to check whether this address have a same city with other address
 * @param that
 * @return
 */
public boolean sameCity(Address that) {

return this.city.equals(that.city);

}

}
