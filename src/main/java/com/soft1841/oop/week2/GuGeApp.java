package com.soft1841.oop.week2;

import com.soft1841.oop.week2.GuGeApp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class GuGeApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/guge.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,1920,1000);
        scene.getStylesheets().add(GuGeApp.class.getResource("/css/style2.css").toExternalForm());
        primaryStage.setTitle("谷歌");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
