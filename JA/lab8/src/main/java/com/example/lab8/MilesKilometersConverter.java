package com.example.lab8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MilesKilometersConverter extends Application {

    private TextField milesField, kilometersField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Miles/Kilometers Converter");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label milesLabel = new Label("Miles:");
        Label kilometersLabel = new Label("Kilometers:");

        milesField = new TextField();
        kilometersField = new TextField();

        milesField.setOnAction(e -> convertMilesToKilometers());
        kilometersField.setOnAction(e -> convertKilometersToMiles());

        gridPane.add(milesLabel, 0, 0);
        gridPane.add(milesField, 1, 0);
        gridPane.add(kilometersLabel, 0, 1);
        gridPane.add(kilometersField, 1, 1);

        Scene scene = new Scene(gridPane, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void convertMilesToKilometers() {
        try {
            double miles = Double.parseDouble(milesField.getText());
            double kilometers = miles * 1.60934;
            kilometersField.setText(String.format("%.10f", kilometers));
        } catch (NumberFormatException e) {
            kilometersField.setText("Invalid input");
        }
    }

    private void convertKilometersToMiles() {
        try {
            double kilometers = Double.parseDouble(kilometersField.getText());
            double miles = kilometers * 0.621371;
            milesField.setText(String.format("%.10f", miles));
        } catch (NumberFormatException e) {
            milesField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}