package com.jcchv.java.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;
import javafx.event.ActionEvent;;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ConsoleTabController implements Initializable{

    @FXML
    private Button btnSpring;
    @FXML
    private Label lblSpring;


    @FXML
    private void sayHello(ActionEvent onMouseClicked){
        lblSpring.setText("Hello Spring! :D");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO:
    }
}
