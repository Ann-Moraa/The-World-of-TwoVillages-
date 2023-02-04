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

//Door class
public class Door {
    //declaring x and y
    private double x;
    private double y;
    //declaring width and height
    private double width;
    private double height;

    //constructor for door class
    public Door(double x, double y, double width, double height) {
        //initializing value of x
        this.x = x;
        //initializing value of y
        this.y = y;
        //initializing width
        this.width = width;
        //initializing height
        this.height = height;
    }

    //method used to draw the door
    public void draw(GraphicsContext gc) {
        //setting the color of the door to white
        gc.setFill(Color.BLACK);
        //filling the values of x,y, width and height of the door
        gc.fillRect(x, y, width, height);
    }
}

