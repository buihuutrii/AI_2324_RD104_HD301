package baitap_3_1;

public class House {
String kind;
int numsOfRoom;
double price;
Address address;
/**
 * this is constructor
 * example
 * House h1= new House("Ranch", 7, 375000, a1);
	House h2= new House("Colonial", 9, 450000, a2);
	House h3= new House("Cape", 6, 235000, a3);
 * @param kind
 * @param numsOfRoom
 * @param price
 * @param address
 */
public House(String kind, int numsOfRoom, double price, Address address) {
	this.kind = kind;
	this.numsOfRoom = numsOfRoom;
	this.price = price;
	this.address = address;
}
/**
 * this method to determine whether a house has more room other house
 *example:
 *House house1 = new House("Ranch", 7,

new Address("23", "Mapple Street", "Brooklyn"), 375000);

House house2 = new House("Colonial", 9,

new Address("5", "Jove Road", "Newton"), 450000);

House house3 = new House("Cape", 6,

new Address("83", "Winslow Road", "Waltham"), 235000);

house1.hasMoreRooms(house2) => false

house2.hasMoreRooms(house3)=> true
 * @param that
 * @return
 */
public boolean hasMoreRoom(House that) {
	return this.numsOfRoom > that.numsOfRoom;
	
}
/**
 * this method checks whether the advertised
house is in some given city 
example:
House house1 = new House("Ranch", 7,

new Address("23", "Mapple Street", "Brooklyn"), 375000);

House house2 = new House("Colonial", 9,

new Address("5", "Jove Road", "Newton"), 450000);

House house3 = new House("Cape", 6,

new Address("83", "Winslow Road", "Waltham"), 235000);

house1.inThisCity("Brooklyn")=> true

house1.inThisCity("Newton")=> false
 * @param city
 * @return
 */
public boolean inThisCity(String city) {

return this.address.inThisCity(city);

}
/**
 * this method to 
 * example:
 * House house1 = new House("Ranch", 7,

new Address("23", "Mapple Street", "Brooklyn"), 375000);

House house2 = new House("Colonial", 9,

new Address("5", "Jove Road", "Newton"), 450000);

House house3 = new House("Cape", 6,

new Address("83", "Winslow Road", "Waltham"), 235000);

house1.sameCity(house1)=>true

house1.sameCity(house2)=>false
 * @param that
 * @return
 */
public boolean sameCity(House that) {

return this.address.sameCity(that.address);

}
}

	
