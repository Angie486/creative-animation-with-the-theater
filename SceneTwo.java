import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  // Instance Variables
private KitchenObject[] allSnoopyCharacters;
  private KitchenObject burger;
  // Constructor(s)
public SceneTwo() {
   // Initialize characters with images and coordinates
  KitchenObject charlieB = new KitchenObject("Adobe-Express---file-(2).png", 90, 332);
  KitchenObject marcie = new KitchenObject("Marcie_from_Peanuts.png", 240, 332);
  KitchenObject schroeder = new KitchenObject("Sally-min.png", 277, 230);
   KitchenObject snoopy = new KitchenObject("Adobe-Express---file-(1).png", 277, 230);
   burger = new KitchenObject("Adobe-Express---file-(7).png", 342, 250);

   // Store characters in an array for easy access
   allSnoopyCharacters = new KitchenObject[]{charlieB, marcie, snoopy, schroeder};
}
  
  // Public Methods
  /**
   * Draw the second scene, animate the burger to the customer, and show a speech bubble
   */
  public void drawScene() {
    formatText();
    pause(0.5);
    slideBurgerToCustomer();
    pause(1);
    drawImage("LeftSpeechBubble.png", 330, 180, 100);
     pause(0.4);
    playSound("muffled-talking-6161--AudioTrimmer.com---AudioTrimmer.com-.wav");
    drawText("Enjoy!", 368, 225);
    
  }

  // Private Helper Methods
   /**
   * Set text formatting for scene text
   */
  private void formatText() {
    setTextColor("black");
    setTextHeight(12);
    setTextStyle(Font.SERIF, FontStyle.ITALIC);
  }

  /**
   * Draw the background for the second scene
   */
  private void drawBackground() {
    drawImage("outside.jpg", 0, 0, 500);
  }

   /**
   * Animate the burger moving to the customer
   */
private void slideBurgerToCustomer() {
  while(burger.getY() < 350) {

drawBackground();
    drawImage(allSnoopyCharacters[0].getFileName(), allSnoopyCharacters[0].getX(), allSnoopyCharacters[0].getY(), 150);
    drawImage(allSnoopyCharacters[1].getFileName(), allSnoopyCharacters[1].getX(), allSnoopyCharacters[1].getY(), 50);
    drawImage(allSnoopyCharacters[2].getFileName(), allSnoopyCharacters[2].getX(), allSnoopyCharacters[2].getY(), 130);
    
    drawImage(burger.getFileName(), burger.getX(), burger.getY(), 50);

    int newX = burger.getX() - 8;
    int newY = burger.getY() + 10;
burger.setY(newY);
burger.setX(newX);

    pause(0.1);
  }
}
  
}