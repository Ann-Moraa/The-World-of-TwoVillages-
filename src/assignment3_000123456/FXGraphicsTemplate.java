/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_000123456;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author YOUR NAME
 */
public class FXGraphicsTemplate extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(800, 600); // Set canvas Size in Pixels
        stage.setTitle("Two Villages"); // Set window title
        
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 
        gc.setFill(javafx.scene.paint.Color.CHARTREUSE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        TwoVillages twoVillages = new TwoVillages();
        twoVillages.draw(gc);
        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
