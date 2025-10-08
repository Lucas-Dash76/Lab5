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
        ListView<String> lv = new ListView();
        lv.getItems().addAll("Full decorative", "Beaded", "Pirate Design", "Fringed", "Leather", "Plain");
        
        ComboBox<String> cb = new ComboBox();
        cb.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(30);
        
        gp.add(label1, 0, 0);
        gp.add(lv, 1, 0);
        GridPane gp2 = new GridPane();
        HBox hb1 = new HBox();
        hb1.getChildren().addAll(label2,cb);
        gp2.add(hb1, 0, 0);
       
        
        Button btn1 = new Button("Place Order");
        Button btn2 = new Button("Clear Selections");
        HBox hb3 = new HBox();
        hb3.getChildren().addAll(btn1,btn2);
        gp.add(hb3, 2, 2);
        
        
        RadioButton r1 = new RadioButton("Small");
        RadioButton r2 = new RadioButton("Medium");
        RadioButton r3 = new RadioButton("Large");
        
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(r1, r2, r3);
        gp2.add(hb2, 0, 1);
        gp2.setAlignment(Pos.CENTER);
        gp2.setVgap(50);
        gp.add(gp2, 2, 0);
        
        Label lbl3 = new Label();
        
       
        btn1.setOnAction(e -> {
            if (cb.getValue() != null && lv.getSelectionModel().getSelectedItem() != null && ((RadioButton)tg.getSelectedToggle()).getText() != null)
        lbl3.setText("You ordered : "+ cb.getValue() + " " + lv.getSelectionModel().getSelectedItem()+ 
               " bags at size: "+ ((RadioButton)tg.getSelectedToggle()).getText());
        });
        btn2.setOnAction(e -> {
            lv.getSelectionModel().clearSelection();
            cb.getSelectionModel().clearSelection();
            tg.getSelectedToggle().setSelected(false);
            lbl3.setText("");
        });
        gp.add(lbl3, 1, 1);
        Scene s = new Scene(gp, 1000, 500);
        stage.setTitle("Bag Order Form");
        stage.setScene(s);
        stage.show();
    }
    
}
 