package com.example.lab8;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StopwatchApp extends Application {
    private Label timeLabel;
    private Button startButton, pauseResumeButton, clearButton;
    private Timeline timeline;
    private long startTime;
    private boolean isRunning;

    @Override
    public void start(Stage primaryStage) {
        timeLabel = new Label("00:00:00");
        timeLabel.setStyle("-fx-font-size: 24px;");

        startButton = new Button("Start");
        pauseResumeButton = new Button("Pause");
        pauseResumeButton.setDisable(true);
        clearButton = new Button("Clear");

        startButton.setOnAction(event -> startStopwatch());
        pauseResumeButton.setOnAction(event -> pauseResumeStopwatch());
        clearButton.setOnAction(event -> clearStopwatch());

        VBox root = new VBox(10, timeLabel, startButton, pauseResumeButton, clearButton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Stopwatch");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startStopwatch() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            timeline = new Timeline(new KeyFrame(Duration.millis(10), event -> updateTime()));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
            isRunning = true;
            startButton.setDisable(true);
            pauseResumeButton.setDisable(false);
            pauseResumeButton.setText("Pause");
        }
    }

    private void pauseResumeStopwatch() {
        if (isRunning) {
            timeline.pause();
            isRunning = false;
            pauseResumeButton.setText("Resume");
        } else {
            timeline.play();
            isRunning = true;
            pauseResumeButton.setText("Pause");
        }
    }

    private void clearStopwatch() {
        if (timeline != null) {
            timeline.stop();
        }
        timeLabel.setText("00:00:00");
        startTime = 0;
        isRunning = false;
        startButton.setDisable(false);
        pauseResumeButton.setDisable(true);
        pauseResumeButton.setText("Pause");
    }

    private void updateTime() {
        long currentTime = System.currentTimeMillis() - startTime;
        long seconds = currentTime / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        seconds %= 60;
        minutes %= 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timeLabel.setText(timeString);
    }

    public static void main(String[] args) {
        launch(args);
    }
}