import org.code.theater.*;
import org.code.media.*;
/*
 * Represents an image that can be modified with filters and effects
 */
public class ImagePlus extends Image {

  private Pixel[][] pixels;    // The 2D array of pixels

  /*
   * Constructor to create an ImagePlus object
   * with a specified file name
   */
  public ImagePlus(String filename) {
    super(filename);   // calls the Image class constructor

    // Initialize the pixels array by getting the pixels from the image
    pixels = getPixels();
  }

  /*
   * Returns the pixels in the image as a 2D array of Pixel objects
   */
  public Pixel[][] getPixels() {
    // Level 2
    // TO DO #1: Create and return a 2D array of Pixel objects that
    // contains the pixels from the image.

    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
    
    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }

    return tempPixels;
  }

  // // Unit 5 Lesson 6 - Level 3a
  // public void zeroRed() {
  //   for (int row = 0; row < pixels.length; row++) {
  //     for (int col = 0; col < pixels[0].length; col++) {
  //       Pixel currentPixel = pixels[row][col];

  //       currentPixel.setRed(0);
  //     }
  //   }
  // }

  // Unit 5 Lesson 6 - Level 3b
  public void zeroBlue() {
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        currentPixel.setBlue(0);
      }
    }
  }

  // Unit 5 Lesson 6 - Level 3c
  public void zeroGreen() {
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        currentPixel.setGreen(0);
      }
    }
  }
  
}
