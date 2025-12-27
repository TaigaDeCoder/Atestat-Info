package com.tayga;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class PaginaPrincipala {

    public static void start(Stage stage) {

        Button buttonBubble = new Button("Bubble");
        buttonBubble.setLayoutX(100);
        buttonBubble.setLayoutY(160);
        buttonBubble.setPrefSize(300, 100);

        Bubble pagina = new Bubble();

        buttonBubble.setOnAction(e ->
            Bubble.start(stage)
        );


        Text exText = new Text("Pagina Principala");
        exText.setLayoutX(100);
        exText.setLayoutY(150);

        StackPane root = new StackPane();

        Pane style = new Pane();
        style.prefWidthProperty().bind(root.widthProperty());
        style.prefHeightProperty().bind(root.heightProperty());
        style.setStyle("-fx-background-color: Green");

        Pane layout = new Pane();
        layout.getChildren().add(buttonBubble);
        layout.getChildren().add(exText);


        root.getChildren().addAll(style, layout); //be VERY careful of in what order you put the diffrent panes

        Scene scene = new Scene(root, Main.xSize, Main.ySize);

        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
}