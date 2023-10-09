package baitap_3_2;

public class Book {
	String title;
	double price;
	int publishYear;
	Author author;
/**
 * this is constructor 
 * example
 * Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);
 * @param title
 * @param price
 * @param publishYear
 * @param author
 */
	public Book(String title, double price, int publishYear, Author author) {

		this.title = title;
		this.price = price;
		this.publishYear = publishYear;
		this.author = author;
	}

	/**
	 * this method to checks whether the book was published
in 2004 or 2003
example
Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);


		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book("A Little Java, A Few Pattern", 25.9, 1998, friedman);

		aljafp.currentBook() => false
		htdch.currentBook()=> true

	 * @return
	 */
	public boolean currentBook() {

		return (this.publishYear == 2004) ||

				(this.publishYear == 2003);

	}

	/**
	 * this method to determines whether a book was
written by a current author (born after 1940)
example:
Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);

		htdch.currentAuthor()=>true

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book("A Little Java, A Few Pattern", 25.9, 1998, friedman);

		aljafp.currentAuthor()= false

	 * @return
	 */
	public boolean currentAuthor() {

		return this.author.currentAuthor();

	}
/**
 * this method to determines whether a book was written
by the specified author;
example
Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);

		htdch.thisAuthor(felleisen)=> true

		Author friedman = new Author("Daniel P. Friedman", 1939);

		htdch.thisAuthor(friedman)=>false
 * @param that
 * @return
 */
	public boolean thisAuthor(Author that) {

		return this.author.same(that);
	}
/**
 * this method to determines whether one book was
written by the same author as some other book;
example:
Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book(
		"How to Design Class Hierarchies", 0.0, 2004,felleisen);

		Book htdp = new Book(
		"How to Design Programs", 0.0, 2002,felleisen);

		htdch.sameAuthor(htdp)=>true

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book(
		"A Little Java, A Few Pattern", 25.9, 1998,friedman);

		aljafp.sameAuthor(htdch)=>false

 * @param that
 * @return
 */
	public boolean sameAuthor(Book that) {

		return this.author.same(that.author);

	}
	/**
	 * this method to determines whether two books were
written by two authors born less than 10 year apart.
example :
Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book(
		"How to Design Class Hierarchies", 0.0, 2004,felleisen);
		Book htdch1 = new Book(
				"How to Design Class Hierarchies bla bla", 0.0, 2006,felleisen);

		htdch.sameGeneration(htdch1)=> true

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book(
		"A Little Java, A Few Pattern", 25.9, 1998,friedman);

		aljafp.sameGeneration(htdch)=>false
	 * @param that
	 * @return
	 */
	public boolean sameGeneration(Book that) {

		return this.author.sameGeneration(that.author);

		}
}
