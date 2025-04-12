import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  // Instance Variables
  // Array to hold kitchen objects
  private KitchenObject[] allKitchenObjects;
  
  // Constructor(s)
public SceneOne() {
  // Initialize all kitchen objects with images and coordinates
  KitchenObject plate = new KitchenObject("plate.png", 120, 200);
  KitchenObject bottomBun = new KitchenObject("Adobe-Express---file.png", 135, 230);
  KitchenObject meat = new KitchenObject("Adobe-Express---file-(8).png", 135, 230);
  KitchenObject cheese = new KitchenObject("cheese.png", 120, 200);
  KitchenObject lettuce = new KitchenObject("lettuce.png", 120, 200);
  KitchenObject tomatoes = new KitchenObject("tomatoes.png", 120, 200);
  KitchenObject topBun = new KitchenObject("Remove-background-project.png", 135, 230);
  
      // Store the kitchen objects in an array for easy access
  allKitchenObjects = new KitchenObject[]{plate, bottomBun, meat, cheese, lettuce, tomatoes, topBun};
}
  // Public Methods
   /**
   * Draw the scene with images of all kitchen objects and speech bubbles
   */
  public void drawScene() {
    formatText();
    drawBackground();
    pause(1);
    drawBackground("Adobe-Express---file-(1).png");
    pause(1);
    drawImage(allKitchenObjects[0].getFileName(), allKitchenObjects[0].getX(), allKitchenObjects[0].getY(), 150);
    pause(0.5);
    drawImage(allKitchenObjects[1].getFileName(), allKitchenObjects[1].getX(), allKitchenObjects[1].getY(), 100);
    pause(0.5);
    drawImage(allKitchenObjects[2].getFileName(), allKitchenObjects[2].getX(), allKitchenObjects[2].getY(), 100);
    pause(0.5);
    drawImage(allKitchenObjects[3].getFileName(), allKitchenObjects[3].getX(), allKitchenObjects[3].getY(), 150);
    pause(0.5);
    drawImage(allKitchenObjects[4].getFileName(), allKitchenObjects[4].getX(), allKitchenObjects[4].getY(), 150);
    pause(0.5);
    drawImage(allKitchenObjects[5].getFileName(), allKitchenObjects[5].getX(), allKitchenObjects[5].getY(), 150);
    pause(0.5);
    drawImage(allKitchenObjects[6].getFileName(), allKitchenObjects[6].getX(), allKitchenObjects[6].getY(), 90);
    pause(1);
    drawImage("LeftSpeechBubble.png", 120, 20, 250);
    pause(0.4);
    drawText("Orders Up!", 190, 140);
    playSound("bike-bell-173588--AudioTrimmer.com-.wav");
      pause(1);
  }

  // Private Helper Methods
   /**
   * Draw the background with default image
   */
  private void drawBackground() {
    drawImage("thebackground.jpg", 0, 0, 800);
  }

  /**
   * Draw the background with a custom image
   * @param fileName The image file to use as background
   */
    private void drawBackground(String fileName) {
    drawImage(fileName, 5, 150, 250);
  }

  /**
   * Set text formatting for scene text
   */
  private void formatText() {
    setTextColor("black");
    setTextHeight(18);
    setTextStyle(Font.MONO, FontStyle.BOLD);
  }
}