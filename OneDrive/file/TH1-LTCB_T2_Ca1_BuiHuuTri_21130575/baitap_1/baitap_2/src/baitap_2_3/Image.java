package baitap_2_3;

//represent information about an image

class Image {
int width; // in pixels

int height; // in pixels

String source; // file name

String quality; // informal

Image(int width, int height,

String source, String quality) {

this.width = width;

this.height = height;

this.source = source;

this.quality = quality;

}
/**
 * the method to determines whether the image’s
height is larger than its width
 */
public boolean isPortrait() {
	return this.height > this.width;
	
}
/**
 * the method to computes how many pixels the image
contains
 * @return double
 * example
 * 
 */
public double size() {
	return this.height * this.width;
	
}
/**
 * this method to determines whether one image
contains more pixels than some other image

 * @param that
 */
public boolean  isLarger(Image that) {
	return this.size() > that.size() ;
	
}
/**
 * this method to determine whether this image is the same
as a given one.
 * @param that
 * @return
 */
public boolean same(Image that) {
	return this.height == that.height && this.width == that.width 
			&& this.source == that.source && this.quality == that.quality;
}
/**
 * this method to classify image depend on it's pixels
 * @return
 */
public String sizeString() {
	return this.size() <= 10000 ? "small" :(this.size()<= 1000000 ? "medium" : "large") ;
	
}
}
