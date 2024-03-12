package com.brendan.module5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class AddUserController {

    @FXML
    private TextField password;

    @FXML
    private TextField userName;
    public void addUser() throws IOException, SQLException {
            System.out.println("this will add me in with an id of " + userName.getText() + " and a password of " + password.getText());
            /*if (DatabaseHandler.handler.checkLogin(userName.getText(), password.getText())) {
                System.out.println("Password is correct!");
                createNewWindow(userName.getText());
            } else {
                System.out.println("Bad!!!!!!!!!!");
            }*/

    }

    public void cancel() {
        System.out.println("testing");
    }
}
