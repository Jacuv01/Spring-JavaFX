package com.jcchv.java.controller;
import com.jcchv.java.services.SpringService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.event.ActionEvent;
import com.jcchv.java.tray.notification.NotificationType;
import com.jcchv.java.tray.notification.TrayNotification;


import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ConsoleTabController implements Initializable {

    private SpringService springService;

    @Autowired
    public ConsoleTabController(SpringService springService) {
        this.springService = springService;
    }

    @FXML
    private Button btnSpring;
    @FXML
    private Label lblSpring;


    @FXML
    private void sayHello(ActionEvent onMouseClicked) {
        lblSpring.setText(springService.getSpring().getSpring());
        String title = "Congratulations sir";
        String message = "You've successfully created your first Tray Notification";
        NotificationType notification = NotificationType.SUCCESS;
        TrayNotification tray = new TrayNotification(title, message, notification);
        tray.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO:
    }
}
