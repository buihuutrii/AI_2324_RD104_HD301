package baitap_1_2;

public class Image {
	// represent computer images
	
	int height; // pixels
	int width; // pixels
	String source; // file name
	String quality; // informal
	/**
	 * this is constructor
	 * Example:
	 * new Image(5, 10, "small.gif", "low")
	 * new Image(120, 200, "med.gif", "low")
	 * new Image(1200, 1000, "large.gif", "high")
	 * @param height
	 * @param width
	 * @param source
	 * @param quality
	 */
	public Image(int height, int width, String source, String quality) {
		
		this.height = height;
		this.width = width;
		this.source = source;
		this.quality = quality;
	}
	
}
