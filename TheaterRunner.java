import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create scenes for the play
SceneOne scene1 = new SceneOne();
SceneTwo scene2 = new SceneTwo();

       // Draw the scenes
    scene1.drawScene();
    scene2.drawScene();

     // Play both scenes in sequence
    Theater.playScenes(scene1, scene2);
  }
}