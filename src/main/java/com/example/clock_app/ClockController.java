package com.example.clock_app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ClockController {
            @FXML
            private Label welcomeText;

            @FXML
            protected void onHelloButtonClick() {
                        welcomeText.setText("Welcome to JavaFX Application!");
            }
}