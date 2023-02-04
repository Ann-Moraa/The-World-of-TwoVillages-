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

//Window class
public class Window {
    //declaring x
    private double x;
    //declaring y
    private double y;
    //declaring radius
    private double radius;

    //constructor for window's class
    public Window(double x, double y, double radius) {
        //initializing value of x
        this.x = x;
        //initializing value of y
        this.y = y;
        //initializing radius
        this.radius = radius;
    }

    //method used to draw the window for the house displayed on the scene
    public void draw(GraphicsContext gc) {
        //setting the color of the window to white
        gc.setFill(Color.WHITE);
        //filling the values of x,y radii of the window
        gc.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

