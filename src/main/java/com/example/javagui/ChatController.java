package com.example.javagui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChatController {
  private Parent root;
  private Stage stage;
  private Scene scene;
  @FXML
  private Button beginButton;

  public void begin(){
    root = FXMLLoader.load(getClass().getResource("ChatScene.fxml"));
    stage = (Stage) beginButton.getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }


}
