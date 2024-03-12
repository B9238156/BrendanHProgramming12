package com.brendan.module5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;


public class LoginController {

        @FXML
        private TextField password;


        @FXML
        private TextField welcome;

        @FXML
        private TextField userName;

        public void exitSystem() {
            System.exit(1);
        }

        public void login() throws IOException, SQLException {
            System.out.println("this will log me in with an id of " + userName.getText() + " and a password of " + password.getText());
            if (DatabaseHandler.handler.checkLogin(userName.getText(), password.getText())) {
                System.out.println("Password is correct!");
                createNewWindow(userName.getText());
            } else {
                System.out.println("Bad!!!!!!!!!!");
            }
        }

        public void createNewWindow(String userName) throws IOException {
            // Create a new stage (window)
            Stage newWindow = new Stage();
            newWindow.setTitle("Welcome");

            // Load the FXML document
            Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));

            // Set the scene
            Scene scene = new Scene(root);
            newWindow.setScene(scene);

            Text welcomeTxt = (Text) root.lookup("#Welcome");
            welcomeTxt.setText("Welcome " + userName);


            // Display the stage
            newWindow.show();
        }

}