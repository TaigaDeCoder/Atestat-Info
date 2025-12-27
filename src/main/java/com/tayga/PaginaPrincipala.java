package com.tayga;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PaginaPrincipala {

    public void start(Stage stage) {

        Button buttonBubble = new Button("Bubble");
        buttonBubble.setLayoutX(100);
        buttonBubble.setLayoutY(160);
        buttonBubble.setPrefSize(300, 100);

        buttonBubble.setOnAction(e -> {
            System.out.println("Bubble button clicked");
        });

        Pane root = new Pane();
        root.getChildren().add(buttonBubble);

        Scene scene = new Scene(root, Main.xSize, Main.ySize);

        stage.setTitle("Pagina Principala");
        stage.setScene(scene);
        stage.show();
    }
}