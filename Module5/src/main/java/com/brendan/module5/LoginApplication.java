package com.brendan.module5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.SQLException;

public class LoginApplication extends Application {
    public static DatabaseHandler handler;

    /**
     * Start Application
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 425, 240);
        stage.setTitle("Brendan's IT");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    public static void main(String[] args)  {
        handler = DatabaseHandler.getHandler();
        loadData();
        launch();
    }

    public static void loadData()  {
        handler.addUser("brendan", "1234") ;
    }
}