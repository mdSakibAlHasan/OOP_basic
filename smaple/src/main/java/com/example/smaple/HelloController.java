package com.example.smaple;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private int counterNumber=0;

    @FXML
    protected void onHelloButtonClick() {
        counterNumber++;
        welcomeText.setText("Counter: "+counterNumber);
    }
}