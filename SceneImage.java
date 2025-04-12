/**
 * Represents a image drawn in the Scene
 */
public class SceneImage {

  // Instance Variables
  private String fileName;
  private int x;
  private int y;

  // Constructor(s)
  /**
   * Creates a new SceneImage with a given file name and position
   * @param fileName The image file name to be displayed
   * @param x The x-coordinate of the image's position
   * @param y The y-coordinate of the image's position
   */
  public SceneImage(String fileName, int x, int y) {
    this.fileName = fileName;
    this.x = x;
    this.y = y;
  }

  // Accessor Methods
  /**
   * Gets the x-coordinate of the image
   * @return The x-coordinate of the image
   */
  public int getX() {
    return x;
  }

  /**
   * Gets the y-coordinate of the image
   * @return The y-coordinate of the image
   */
  public int getY() {
    return y;
  }

  /**
   * Gets the file name of the image
   * @return The file name of the image
   */
  public String getFileName() {
    return fileName;
  }

   // Mutator Methods
  /**
   * Sets the x-coordinate of the image.
   * @param newX The new x-coordinate to set
   */
  public void setX(int newX) {
    x = newX;
  }

  /**
   * Sets the y-coordinate of the image
   * @param newY The new y-coordinate to set
   */
  public void setY(int newY) {
    y = newY;
  }

  /**
   * Sets the file name of the image
   * @param newFileName The new image file name to set
   */
  public void setFile(String newFileName) {
    fileName = newFileName;
  }

}