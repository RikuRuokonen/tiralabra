package com.ruokonen;

import com.ruokonen.UI.GUI;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main extends Application {

    public static void main(String[] args) {
        try {
            MapProvider mp = new MapProvider();
            char[][] convertedMap = mp.getMapAsMatrix();
            GUI gui = new GUI(convertedMap);
            gui.renderGUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My First JavaFX App");

        stage.show();
    }
}
