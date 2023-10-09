package baitap_1_1;

public class Book {
String title;
double price;
int year ;
String authorName;
/**
 * this is constuctor 
 * example
 * Book q1 = new Book("Robinson Crusoe", 15.50, 1719, "Daniel Defoe");
	Book q2 = new Book("Heart of Darkness", 12.80, 1902, "Joseph Conrad");
	Book q3 = new Book("Beach Music", 9.50, 1996, "Pat Conroy");
 * @param title
 * @param price
 * @param year
 * @param authorName
 */
public Book(String title,double price, int year, String authorName) {
	this.title = title;
	this.year = year;
	this.authorName = authorName;
}

}
