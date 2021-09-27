package com.ruokonen.UI;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class GUI {

  private Stage primaryStage;
  private char[][] mapMatrix;

  //TODO: Parameters
  public GUI(char[][] mapMatrix) {
    this.mapMatrix = mapMatrix;
    primaryStage = new Stage();
    setupView();
  }

  private void setupView(){

    Pane mapPane = new Pane();
    mapPane.getChildren().add(new Label("Hello Pane"));
    drawMap(mapMatrix, mapPane);

    Scene scene = new Scene(mapPane);
    primaryStage.setScene(scene);

  }

  public void renderGUI(){
    primaryStage.show();
  }

  public void drawMap(char[][] map, Pane mapPane) {
    for (int x = 0; x < map.length; x++) {
      for (int y = 0; y < map[0].length; y++) {
        if (map[x][y] == '@') {
          Rectangle square = new Rectangle(x * 3, y * 3 + 5, 3, 3);
          square.setFill(Color.BLACK);
          mapPane.getChildren().add(square);
        }
      }
    }
  }
}
