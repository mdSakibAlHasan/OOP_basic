package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label inputLabel;
    @FXML
    private TextField textField;

    @FXML
    protected void textFieldController(){
        inputLabel.setText(" ");
    }


    @FXML
    protected void onHelloButtonClick() {
        int mark =  Integer.parseInt(textField.getText());
        if(mark<0 || mark>100)
            inputLabel.setText("Invalid mark");
        else if (mark>=80) {
            inputLabel.setText("You got A+");
        }
        else if (mark>=70) {
            inputLabel.setText("You got A");
        }
        else if (mark>=60) {
            inputLabel.setText("You got A-");
        }
        else if (mark>=50) {
            inputLabel.setText("You got B");
        }
        else if (mark>=40) {
            inputLabel.setText("You got C");
        }
        else if (mark>=33) {
            inputLabel.setText("You got D");
        }
        else{
            inputLabel.setText("You fail");
        }

    }


}