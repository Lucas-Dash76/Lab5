/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import javafx.application.Application;
import javafx.geometry.Pos;


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
        GridPane gp = new GridPane();
        Label label1 = new Label("Select Bag Style: ");
        Label label2 = new Label("Select Quantity: ");
        ListView lv = new ListView();
        lv.getItems().addAll("Full decorative", "Beaded", "Pirate Design", "Fringed", "Leather", "Plain");
        
        ComboBox cb = new ComboBox();
        cb.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(30);
        
        gp.add(label1, 0, 0);
        gp.add(lv, 1, 0);
        GridPane gp2 = new GridPane();
        gp2.add(label2, 0, 0);
        gp2.add(cb, 1, 0);
        
        Button btn1 = new Button("Place Order");
        Button btn2 = new Button("Clear Selections");
       
        gp.add(btn1, 2, 2);
        gp.add(btn2, 3, 2);
        
        RadioButton r1 = new RadioButton("Small");
        RadioButton r2 = new RadioButton("Medium");
        RadioButton r3 = new RadioButton("Large");
        
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        
        gp2.add(r1, 0, 1);
        gp2.add(r2, 1, 1);
        gp2.add(r3, 2, 1);
        gp2.setAlignment(Pos.CENTER);
        gp2.setVgap(50);
        gp.add(gp2, 2, 0);
        
        btn1.setOnAction(e -> {
        
        });
        Scene s = new Scene(gp, 1000, 500);
        stage.setTitle("First application");
        stage.setScene(s);
        stage.show();
    }
    
}
 