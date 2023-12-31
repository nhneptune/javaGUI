package com.example.javagui;

import static javafx.fxml.FXMLLoader.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatApplication extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    Parent root = load(getClass().getResource("StartScene.fxml"));
    Scene scene = new Scene(root);
    stage.setTitle("Java GUI");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}