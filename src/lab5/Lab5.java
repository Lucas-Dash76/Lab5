/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author 2389873
 */
public class Lab5 extends Application{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    launch(args);    
            }


    @Override
    public void start(Stage stage) {
        Label messageLabel = new Label("Name: ");
        HBox hb = new HBox(messageLabel);
        Scene s = new Scene(hb, 1000, 500);
        stage.setTitle("First application");
        stage.setScene(s);
        stage.show();
    }
    
}
 