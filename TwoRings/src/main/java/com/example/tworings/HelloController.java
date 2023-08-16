package com.example.tworings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class HelloController extends Application
{
    static int x1 = 250;
    static int y1 = 100;
    static int radius1 = 50;

    static int x2 = 300;
    static int y2 = 150;
    static int radius2 = 50;

    public static void main(String args[])
    {
            int disranceBetweenRings = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            String commonSpaceOfRings = (disranceBetweenRings <= radius1 + radius2 && disranceBetweenRings + radius1 >= radius2 && disranceBetweenRings + radius2 >= radius1) ? "Окружности пересакаются друг с другом." : "Окружности не пересекаются друг с другом.";
            System.out.println(commonSpaceOfRings);
            launch(args);
    }

    public void start(Stage stage)
    {
        Circle circle1 = new Circle();
        circle1.setCenterX(x1);
        circle1.setCenterY(y1);
        circle1.setRadius(radius1);
        circle1.setFill(Color .ORANGE);

        Circle circle2 = new Circle();
        circle2.setCenterX(x2);
        circle2.setCenterY(y2);
        circle2.setRadius(radius2);
        circle2.setFill(Color .GREEN);

        Group root = new Group(circle1, circle2);

        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Пересекаются ли две окружности друг с другом?");
        stage.setScene(scene);
        stage.show();
    }


}

   //@FXML
    //private Label welcomeText;

    //@FXML
    //protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    //}