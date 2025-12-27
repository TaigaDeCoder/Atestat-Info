package com.tayga;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PaginaPrincipala {

    public static Parent create() {


        Pane background = new Pane();
        background.setStyle("-fx-background-color: green;");

        // title
        Text title = new Text("Pagina Principala");
        title.setFont(new Font("Arial", 20));
        StackPane.setMargin(title, new Insets(10));

        StackPane titleBox = new StackPane(background, title);
        titleBox.setAlignment(Pos.CENTER);

        // left panel
        Pane textBox = new Pane();
        textBox.setPrefWidth(500);
        textBox.setStyle("-fx-background-color: red;");

        // button
        Button buttonBubble = new Button("Bubble");
        buttonBubble.setPrefSize(300, 100);

        BorderPane.setAlignment(buttonBubble, Pos.CENTER_RIGHT);
        BorderPane.setMargin(buttonBubble, new Insets(20));

        // navigation (here will come a HBox with all of the buttons)
        buttonBubble.setOnAction(e ->
                Pages.show(Pages.BUBBLE)
        );

        // root
        BorderPane root = new BorderPane();
        root.setTop(titleBox);
        root.setLeft(textBox);
        root.setBottom(buttonBubble);

        return root;
    }
}