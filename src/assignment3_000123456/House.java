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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.canvas.GraphicsContext;

//House class
public class House {
    //Declaring Rectangle house
  private Rectangle house;
  //Declaring door
  private Door door;
  //Declaring window
  private Window window;
  //Declaring x
    private double x;
    //Declaring y
    private double y;
    //Declaring size representing house width
    private double size;
    //Declaring size2 representing house height
    private double size2;
    //Declaring house color
    private Color color;
    //Declaring number of occupants
    private int occupants;

    //Constructor for House
  public House(double x, double y, double size, double size2, Color color, int occupants) {
      //Initializing x
  this.x = x;
  //Initializing y
  this.y = y;
  //Initializing house width
  this.size = size;
  //Initializing house height
  this.size2 = size2;
  //Initializing house color
  this.color = color;
  //Initializing number of occupants
  this.occupants = occupants;

  // Initialize door and window with appropriate size and placement
  door = new Door(x + (size / 2), y + (size2 / 2), size / 4, size2 / 2);
  window = new Window(x + (size * 1 / 4), y + (size2 / 4), size / 6);
}
  //This method is used to draw the House having a door and a window
public void draw(GraphicsContext gc) {
    //setting the color for the house
    gc.setFill(color);
    // Draw the house square
    gc.fillRect(x, y, size, size2);
    
        // Draw triangle roof
    double[] xPoints = {x, x + size/2, x + size};
    double[] yPoints = {y, y - size2/2, y};
    gc.fillPolygon(xPoints, yPoints, 3);
    
        // Draw the door and window
    door.draw(gc);
    window.draw(gc);
  }

  // Getters
//Method to get value of x
  public double getX() {
      //returning value of x
    return x;
  }

  //Method to get the value of y
  public double getY() {
      //returning the value of y
    return y;
  }

  //Method to get house width
  public double getWidth() {
      //returning the housewidth
    return size;
  }

  //Method to get house width
  public double getHeight() {
      //returning house height
    return size2;
  }
}

