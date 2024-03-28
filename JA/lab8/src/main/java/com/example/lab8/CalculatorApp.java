package com.example.lab8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    private Label display;
    private double num1, num2;
    private String operation;
    private boolean start;

    @Override
    public void start(Stage primaryStage) {
        display = new Label("0");
        display.setStyle("-fx-font-size: 24px;");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Button ac = new Button("AC");
        Button plusMinus = new Button("+/-");
        Button percent = new Button("%");
        Button divide = new Button("/");

        grid.add(ac, 0, 0);
        grid.add(plusMinus, 1, 0);
        grid.add(percent, 2, 0);
        grid.add(divide, 3, 0);

        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button multiply = new Button("x");

        grid.add(btn7, 0, 1);
        grid.add(btn8, 1, 1);
        grid.add(btn9, 2, 1);
        grid.add(multiply, 3, 1);

        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button subtract = new Button("-");

        grid.add(btn4, 0, 2);
        grid.add(btn5, 1, 2);
        grid.add(btn6, 2, 2);
        grid.add(subtract, 3, 2);

        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button add = new Button("+");

        grid.add(btn1, 0, 3);
        grid.add(btn2, 1, 3);
        grid.add(btn3, 2, 3);
        grid.add(add, 3, 3);

        Button btn0 = new Button("0");
        Button decimal = new Button(".");
        Button equal = new Button("=");

        grid.add(btn0, 0, 4, 2, 1);
        grid.add(decimal, 2, 4);
        grid.add(equal, 3, 4);

        VBox root = new VBox(display, grid);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        configureButtons(ac, plusMinus, percent, divide, btn7, btn8, btn9, multiply, btn4, btn5, btn6, subtract, btn1, btn2, btn3, add, btn0, decimal, equal);
    }

    private void configureButtons(Button... buttons) {
        for (Button button : buttons) {
            button.setOnAction(event -> handleButtonClick(button.getText()));
        }
    }

    private void handleButtonClick(String input) {
        switch (input) {
            case "AC":
                display.setText("0");
                num1 = 0;
                num2 = 0;
                operation = "";
                start = true;
                break;
            case "+/-":
                // Implement the +/- functionality
                break;
            case "%":
                // Implement the percentage functionality
                break;
            case "/":
                handleOperation("/");
                break;
            case "x":
                handleOperation("*");
                break;
            case "-":
                handleOperation("-");
                break;
            case "+":
                handleOperation("+");
                break;
            case "=":
                calculate();
                operation = "";
                break;
            case ".":
                // Implement the decimal functionality
                break;
            default:
                handleDigit(input);
                break;
        }
    }

    private void handleOperation(String op) {
        if (!operation.isEmpty()) {
            calculate();
        }
        num1 = Double.parseDouble(display.getText());
        operation = op;
        start = true;
    }

    private void handleDigit(String digit) {
        if (start || display.getText().equals("0")) {
            display.setText(digit);
            start = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    private void calculate() {
        if (!operation.isEmpty()) {
            num2 = Double.parseDouble(display.getText());
            switch (operation) {
                case "/":
                    if (num2 != 0) {
                        num1 /= num2;
                    } else {
                        display.setText("Error: Division by zero");
                        num1 = 0;
                        num2 = 0;
                    }
                    break;
                case "*":
                    num1 *= num2;
                    break;
                case "-":
                    num1 -= num2;
                    break;
                case "+":
                    num1 += num2;
                    break;
            }
            display.setText(String.valueOf(num1));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}