/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//https://github.com/Lucas-Dash76/Lab5/tree/master
package lab5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author 2389873
 */
public class Lab5_task2 extends Application{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    launch(args);  
    
            }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();
        Label lbl1 = new Label("Beverage");
        ComboBox beverage = new ComboBox();
        beverage.getItems().addAll("Coffee: 2.50$", "Tea: 2.00$", "Soft Drink: 1.75$", "Water: 2.95$", "Milk: 1.50$", "Juice: 2.50$");
        double[] bev = {2.5, 2.0, 1.75, 2.95, 1.5, 2.5};
        
        Label lbl2 = new Label("Appetizer");
        ComboBox appetizer = new ComboBox();
        appetizer.getItems().addAll("Soup: 4.50$", "Salad: 3.75$", "Spring rolls: 5.25$", "Garlic bread: 3.00$", "Chips and Salsa: 6.95");
        double[] app = {4.5, 3.75, 5.25, 3.00, 6.95};
        
        Label lb13 = new Label("Main Course");
        ComboBox main = new ComboBox();
        main.getItems().addAll("Steak: 15.00$", "Grilled Chicken: 13.50$", "Chicken Alfredo: 13.95$", "Turkey Club: 11.90$", "Shrimp Scampi: 18.99$", "Pasta: 11.25$", "Fish and Chips: 12.75$");
        double[] mn = {15.0, 13.50, 13.95, 11.90, 18.99, 11.75, 12.25};
        
        Label lb14 = new Label("Dessert");
        ComboBox dessert = new ComboBox();
        dessert.getItems().addAll("Apple Pie: 5.95$", "Carrot Cake: 4.50$", "Mud Pie: 4.75$", "Pudding: 3.25$", "Apple Crisp: 5.98$" );
        double[] des = {5.95, 4.5, 4.75, 3.25, 5.98};
        
        Slider tip = new Slider(0, 20, 10);
        tip.setShowTickLabels(true);
        tip.setShowTickMarks(true);
        tip.setMinorTickCount(4);
        tip.snapToTicksProperty().set(true);
        Label lbl5 = new Label("Tip Amount:");
        
        Button clear = new Button("Clear Bill");
        
        double[] totals = new double[7];
        Label lbl6 = new Label("SubTotal: ");
        Label lbl7 = new Label("Tax: 15%");
        Label lbl8 = new Label("Tip: " + tip.getValue() + "%");
        tip.setOnMouseReleased(e -> {
            lbl8.setText("Tip: " + tip.getValue() + "%");
        });
        Label lbl9 = new Label("Total: ");
        gp.add(lbl1, 0, 0);
        gp.add(beverage, 1, 0);
        gp.add(lbl2, 0, 1);
        gp.add(appetizer, 1, 1);
        gp.add(lb13, 0, 2);
        gp.add(main, 1, 2);
        gp.add(lb14, 0, 3);
        gp.add(dessert, 1, 3);
        gp.add(lbl5, 0, 4);
        gp.add(tip, 1, 4);
        gp.add(lbl6, 0, 5);
        gp.add(lbl7, 0, 6);
        gp.add(lbl8, 0, 7);
        gp.add(lbl9, 0, 8);
        gp.add(clear, 0, 9);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));
        
        beverage.setOnAction(e -> {
            totals[1] = totals[1] + bev[beverage.getSelectionModel().getSelectedIndex()] - totals[3];
            lbl6.setText("Subtotal: " + totals[1] + "$");
            totals[2] = totals[1] + totals[1]*(tip.getValue()* 0.01) + totals[1]*0.15;
            lbl9.setText("Total: " + totals[2] + "$");
            totals[3] = bev[beverage.getSelectionModel().getSelectedIndex()];
        });
        appetizer.setOnAction(e -> {
            totals[1] = totals[1] + app[appetizer.getSelectionModel().getSelectedIndex()] - totals[4];
            lbl6.setText("Subtotal: " + totals[1] + "$");
            totals[2] = totals[1] + totals[1]*(tip.getValue()* 0.01) + totals[1]*0.15;
            lbl9.setText("Total: " + totals[2] + "$");
            totals[4] = app[appetizer.getSelectionModel().getSelectedIndex()];
        });
        main.setOnAction(e -> {
            totals[1] = totals[1] + mn[main.getSelectionModel().getSelectedIndex()] - totals[5];
            lbl6.setText("Subtotal: " + totals[1] + "$");
            totals[2] = totals[1] + totals[1]*(tip.getValue()* 0.01) + totals[1]*0.15;
            lbl9.setText("Total: " + totals[2] + "$");
            totals[5] = mn[main.getSelectionModel().getSelectedIndex()];
        });
        dessert.setOnAction(e -> {
            totals[1] = totals[1] + des[dessert.getSelectionModel().getSelectedIndex()] - totals[6];
            lbl6.setText("Subtotal: " + totals[1] + "$");
            totals[2] = totals[1] + totals[1]*(tip.getValue()* 0.01) + totals[1]*0.15;
            lbl9.setText("Total: " + totals[2] + "$");
            totals[6] = des[dessert.getSelectionModel().getSelectedIndex()];
        });
        tip.setOnMouseReleased(e -> {
            totals[2] = totals[1] + totals[1]*(tip.getValue()* 0.01) + totals[1]*0.15;
            lbl9.setText("Total: " + totals[2] + "$");
        });
        clear.setOnAction(e -> {
            beverage.getSelectionModel().clearSelection();
            appetizer.getSelectionModel().clearSelection();
            main.getSelectionModel().clearSelection();
            dessert.getSelectionModel().clearSelection();
        });
        Scene s = new Scene(gp, 1000, 500);
        
        stage.setTitle("Restaurant Menu");
        stage.setScene(s);
        stage.show();
    }

}