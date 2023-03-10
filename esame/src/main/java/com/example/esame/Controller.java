package com.example.esame;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textFieldA;
    @FXML
    private TextField textFieldB;
    @FXML
    private TextField textFieldResult;

    private static final String ERROR = "ERROR";


    @FXML
    private void somma(ActionEvent ae){
        Double a = Double.parseDouble(textFieldA.getText());
        Double b = Double.parseDouble(textFieldB.getText());
        Double somma = a + b;
        textFieldResult.setText(String.valueOf(somma));
    }

    @FXML
    private void differenza(ActionEvent ae){
        Double a = Double.parseDouble(textFieldA.getText());
        Double b = Double.parseDouble(textFieldB.getText());
        Double differenza = a - b;
        textFieldResult.setText(String.valueOf(differenza));
    }

    @FXML
    private void moltiplicazione(ActionEvent ae){
        Double a = Double.parseDouble(textFieldA.getText());
        Double b = Double.parseDouble(textFieldB.getText());
        Double moltiplicazione = a * b;
        textFieldResult.setText(String.valueOf(moltiplicazione));
    }

    @FXML
    private void divisione(ActionEvent ae){
        Double a = Double.parseDouble(textFieldA.getText());
        Double b = Double.parseDouble(textFieldB.getText());
        if (b == 0) {
            textFieldResult.setText(ERROR);
        } else {
            Double divisione = a / b;
            textFieldResult.setText(String.valueOf(divisione));
        }
    }

    @FXML
    private void radiceA(ActionEvent ae){
        Double a = Double.parseDouble(textFieldA.getText());
        if (a < 0) {
            textFieldResult.setText(ERROR);
        } else {
            Double radice = Math.sqrt(a);
            textFieldResult.setText(String.valueOf(radice));
        }
    }
    @FXML
    private void logaritmoA(ActionEvent ae){
        Double a = Double.parseDouble(textFieldA.getText());
        Double logaritmo = Math.log10(a);
        textFieldResult.setText(String.valueOf(logaritmo));
    }

    @FXML
    private void radiceB(ActionEvent ae){
        Double b = Double.parseDouble(textFieldB.getText());
        if (b < 0) {
            textFieldResult.setText(ERROR);
        } else {
            Double radice = Math.sqrt(b);
            textFieldResult.setText(String.valueOf(radice));
        }
    }
    @FXML
    private void logaritmoB(ActionEvent ae){
        Double b = Double.parseDouble(textFieldB.getText());
        Double logaritmo = Math.log10(b);
        textFieldResult.setText(String.valueOf(logaritmo));
    }


}