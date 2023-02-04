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
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.text.Font;

//Village class
public class Village {
    //declaring name
  String name;
  //declaring color
  Color color;
  //declaring x,y,x1 and y1
  int x, y, x1, y1;
  //declaring and initializing population
  int population = 0;
  //declaring size
  int size;
  //declaring an array for houses
  ArrayList<House> houses;
  
  //Constructor for village class
  public Village(String name, Color color, int x, int y) {
      //initializing name
    this.name = name;
    //initializing color
    this.color = color;
    //initializing value of x
    this.x = x;
    //initializing value of y
    this.y = y;
    //initializing arraylist for houses
    houses = new ArrayList<>();
    
    //generating random houses for each village 
    Random random = new Random();
    //initializing the number of houses to be placed in each village
    int numberOfHouses = 6;
    //for loop to generate the houses in each village
for (int i = 0; i < numberOfHouses; i++) {
    //initializing the number of occupants
  int occupants = random.nextInt(15) + 15;
  //initializing housewidth
  int houseWidth = random.nextInt(40) + 30;
  //initializing houseHeight
  int houseHeight = random.nextInt(40) + 30;
  House house = new House((double)(x + i * (houseWidth + 15)), (double)(y), (double)(houseWidth), (double)(houseHeight), color, occupants);
 //adding the houses to the scene
  houses.add(house);
  //increasing population
  population += occupants;
}
  }
  
  //This method is used to draw the random houses generated and display details of the two villages
  public void draw(GraphicsContext gc) {
      //drawing the houses on the scene
      houses.forEach((House house) -> {
          house.draw(gc);
      });
      //setting the font and color for the village details
    gc.setFont(new Font("Times New Roman", 18));
    gc.setFill(Color.BLACK);

    //displaying the village details
    gc.fillText("Village Name: " + name, x, y + 70);
    gc.fillText("Village Population: " + population, x, y + 100);
  }
    
}
