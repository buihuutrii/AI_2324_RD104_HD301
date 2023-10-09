package baitap_3_2;

public class Author {
String name;
int birthYear;
/**
 * this is constructor
 * @param name
 * @param birthYear
 * example
 * Author felleisen = new Author("Matthias Felleisen", 1960);
 */
public Author(String name, int birthYear) {
	
	this.name = name;
	this.birthYear = birthYear;
}
/**
 * phuong thuc nay kiem tra nam sinh co lon hon 1940 hay khong
 * @return
 */
public boolean currentAuthor() {

return this.birthYear >= 1940;

}
/**
 * phuong thuc nay kiem tra ten cua tac gia nay co giong voi ten tac gia khac hay khong
 * @param that
 * @return
 */
public boolean same(Author that) {

return (this.name.equals(that.name)) &&

(this.birthYear == that.birthYear);
}
/**
 * phuong thuc nay  kiem tra tac gia nay co cung mot the he hay khong 
 * ( chenh lech nam sinh khong lon hon 10)
 * @param that
 * @return
 */
public boolean sameGeneration(Author that) {

return Math.abs(this.birthYear - that.birthYear) <= 10;

}
}
