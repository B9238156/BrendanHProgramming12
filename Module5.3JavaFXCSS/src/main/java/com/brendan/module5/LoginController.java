package com.brendan.module5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


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

        public void login() throws IOException {
            System.out.println("this will log me in with an id of " + userName.getText() + " and a password of " + password.getText());
            System.out.println(handler.);
            //createNewWindow(userName.getText());
            //System.exit(1);
        }

        public void createNewWindow(String userName) throws IOException {
            // Create a new stage (window)
            Stage newWindow = new Stage();
            newWindow.setTitle("New Window");

            // Load the FXML document
            Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));

            // Set the scene
            Scene scene = new Scene(root);
            newWindow.setScene(scene);

            TextField welcomeTxt = (TextField) root.lookup("#welcome");
            welcomeTxt.setText(userName);


            // Display the stage
            newWindow.show();
        }

}