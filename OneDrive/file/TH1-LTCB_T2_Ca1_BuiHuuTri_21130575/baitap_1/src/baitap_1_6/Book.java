package baitap_1_6;

public class Book {
	
	    private String title;
	    private double price;
	    private int yearOfPublication;
	    private Author author;
	    /**
	     * this is constructor
	     * @param title
	     * @param price
	     * @param yearOfPublication
	     * @param author
	     */
	    public Book(String title, double price, int yearOfPublication, Author author) {
	        this.title = title;
	        this.price = price;
	        this.yearOfPublication = yearOfPublication;
	        this.author = author;
	    }
}
