package baitap_3_2;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	//this is testing for constructor
	public void testConstructor() {
		Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);

	}
	//this is testing for method to checks whether the book was published in 2004 or 2003
	public void testCurrentBook() {

		Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);

		assertTrue(htdch.currentBook());

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book("A Little Java, A Few Pattern", 25.9, 1998, friedman);

		assertFalse(aljafp.currentBook());

	}
/**
 * this is testing for method determines whether a book was
written by a current author (born after 1940);
 */
	public void testCurrentAuthor() {

		Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);

		assertTrue(htdch.currentAuthor());

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book("A Little Java, A Few Pattern", 25.9, 1998, friedman);

		assertFalse(aljafp.currentAuthor());

	}
/**
 * this is testing for method determines whether a book was written
by the specified author;
 */
	public void testThisAuthor() {

		Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book("How to Design Class Hierarchies", 0.0, 2004, felleisen);

		assertTrue(htdch.thisAuthor(felleisen));

		Author friedman = new Author("Daniel P. Friedman", 1939);

		assertFalse(htdch.thisAuthor(friedman));

	}
	/**
	 * this is testing for method determines whether one book was
written by the same author as some other book;
	 */
	public void testSameAuthor() {

		Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book(
		"How to Design Class Hierarchies", 0.0, 2004,felleisen);

		Book htdp = new Book(
		"How to Design Programs", 0.0, 2002,felleisen);

		assertTrue(htdch.sameAuthor(htdp));

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book(
		"A Little Java, A Few Pattern", 25.9, 1998,friedman);

		assertFalse(aljafp.sameAuthor(htdch));

		}
	/**
	 * this is testing for method determines whether two books were
written by two authors born less than 10 year apart.
	 */
	public void testSameGeneration() {

		Author felleisen = new Author("Matthias Felleisen", 1960);

		Book htdch = new Book(
		"How to Design Class Hierarchies", 0.0, 2004,felleisen);
		Book htdch1 = new Book(
				"How to Design Class Hierarchies bla bla", 0.0, 2006,felleisen);

		assertTrue(htdch.sameGeneration(htdch1));

		Author friedman = new Author("Daniel P. Friedman", 1939);

		Book aljafp = new Book(
		"A Little Java, A Few Pattern", 25.9, 1998,friedman);

		assertFalse(aljafp.sameGeneration(htdch));

		}
}
