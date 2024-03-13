package com.brendan.module5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class AddUserController {

    @FXML
    private TextField password;

    @FXML
    private TextField userName;

    @FXML
    private javafx.scene.control.Button cancelButton;

    public void addUser() throws IOException, SQLException {
            System.out.println("this will add me in with an id of " + userName.getText() + " and a password of " + password.getText());
            if (DatabaseHandler.handler.addUser(userName.getText(), password.getText())) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("User was Successfully Added!");
                alert.setHeaderText("Success");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Adding the User was Not Successful!");
                alert.setHeaderText("Fail!!!!");
                alert.showAndWait();
            }

    }



    public void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
