package com.brendan.module5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class welcomeController {
    /**
     * Pop up addUser prompt
     * @throws IOException
     * @throws SQLException
     */
    public void addUser() throws IOException, SQLException {
        // Create a new stage (window)
        Stage newWindow = new Stage();
        newWindow.setTitle("Add User");

        // Load the FXML document
        Parent root = FXMLLoader.load(getClass().getResource("add-user.fxml"));

        // Set the scene
        Scene scene = new Scene(root);
        newWindow.setScene(scene);

        // Display the stage
        newWindow.show();
    }
}
