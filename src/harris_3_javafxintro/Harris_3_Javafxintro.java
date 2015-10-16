/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harris_3_javafxintro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Data4Life
 */
public class Harris_3_Javafxintro extends Application {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
     @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBackroud(gc);
        drawShapes(gc);
        drawHouse(gc);
        drawLotsOfCircles(gc, 500);
        drawLotsOfCirclesReverse(gc, 500);
        drawTriangleBottom(gc); 
        writeThisTotallyDeservesaONEHUNDRED(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
    
    private void drawHouse(GraphicsContext gc) {
        gc.fillText("My House", 42, 42);
        gc.strokeRect(87, 56, 50, 60);
        gc.strokeRect(25, 32, 50, 60);
        gc.strokeRect(52, 113, 150, 60);
        gc.strokeRect(45, 51, 50, 60);
        gc.strokeRect(64, 35, 510, 60);
        
    }
    
    private void drawBackroud(GraphicsContext gc){
        gc.strokeRect(1000,1000,1000,1000);
        gc.fillRect(0, 0, 1000, 1000);
    }
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color .BLUEVIOLET);
        gc.setStroke(Color .GOLD);
        
    }
    private void drawTriangleBottom(GraphicsContext gc){
        gc.setFill(Color .BLUEVIOLET);
        gc.fillPolygon (new double[]{0, 1000, 500},new double[]{750,750,400}, 3);
    }
    private void drawSomeCircles(GraphicsContext gc, int num1, int num2, int num3 ) {
        gc.setFill(Color .SKYBLUE);
        gc.fillOval(num1, num2, num3, 5);
    }
    private void drawLotsOfCircles(GraphicsContext gc, int num) {
        for(int i = 0; i<num; i++){
            drawSomeCircles(gc, -25*i, (i*25), 25);

        }
    }
    private void drawLotsOfCirclesReverse(GraphicsContext gc, int num) {
        for(int t = 0; t<num; t++){
            drawSomeCircles(gc, 36*t, (t*25), 25);
        }
    }
    private void writeThisTotallyDeservesaONEHUNDRED(GraphicsContext gc){
        gc.fillText("This Totally Deserves a ONE HUNDRED", 740, 15);
    }
    
}

