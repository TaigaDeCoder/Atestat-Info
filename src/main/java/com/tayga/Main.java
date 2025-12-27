package com.tayga;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;

public class Main extends Application {

    public static double xSize;
    public static double ySize;

    @Override
    public void start(Stage stage) {

        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        xSize = bounds.getWidth();
        ySize = bounds.getHeight();

        Pages.init(stage);   // ✅ initialize scenes and navigation
        stage.show();        // ✅ show once
    }

    public static void main(String[] args) {
        launch();
    }
}
