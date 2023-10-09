package baitap_1_2;

import baitap_1_1.Book;
import junit.framework.TestCase;

public class ImageTest extends TestCase {
	/**
	 * this is testing for constructor
	 */
public void testConstructor() {
	//Image with it's information include height is 5,width is 10,source is small.gif,quality is low
	new Image(5, 10, "small.gif", "low");
	//Image with it's information include height is 120,width is 200,source is med.gif,quality is low
	new Image(120, 200, "med.gif", "low");
	//Image with it's information include height is 1200,width is 1000,source is small.gif,quality is high
	new Image(1200, 1000, "large.gif", "high");
}
}
