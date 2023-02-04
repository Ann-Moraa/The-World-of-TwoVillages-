/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_000123456;


/**
 *
 * @author User
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//This is the main javafx class that uses FXGraphicsTemplate
public class TwoVillages extends FXGraphicsTemplate {

    //Declaring village1
    private Village village1;
    //Declaring village2
    private Village village2;
    //Declaring kingsHouse
    private House kingsHouse;

  //Constructor for TwoVillages class
  public TwoVillages() {
      //Initializing village1
    village1 = new Village("Village 1", Color.RED,100, 80);
    //Initializing village2
    village2 = new Village("Village 2", Color.BLUE, 150, 450);
    //Initializing kingsHouse
    kingsHouse = new House((double)(500), (double)(200), (double)(100), (double)(100), Color.DARKMAGENTA,40);
  }

  //Method used to draw village1,village2 and kingsHouse on the scene
  public void draw(GraphicsContext gc) {
      //draw village 1
    village1.draw(gc);
    //draw village 2
    village2.draw(gc);
    //draw emperor's house
    kingsHouse.draw(gc);
        String name = "";
        int y = 250;
        double x = 500;
        gc.setFill(Color.BLACK);
    gc.fillText("Emperor's House " + name, x, y + 70);
    
  }
}
