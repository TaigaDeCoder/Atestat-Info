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

        // buttons

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        buttons.setSpacing(10);

        Button buttonBubble = new Button("Bubble");
        buttonBubble.setPrefSize(100, 30);

        Button buttonCycle = new Button("Cycle");
        buttonCycle.setPrefSize(100, 30);

        Button buttonHeap = new Button("Heap");
        buttonHeap.setPrefSize(100, 30);

        Button buttonInsertion = new Button("Insertion");
        buttonInsertion.setPrefSize(100, 30);

        Button buttonMerge= new Button("Merge");
        buttonMerge.setPrefSize(100, 30);

        Button buttonQuick = new Button("Quick");
        buttonQuick.setPrefSize(100, 30);

        Button buttonSelection = new Button("Selection");
        buttonSelection.setPrefSize(100, 30);


        buttons.getChildren().add(buttonBubble);

        // navigation (here will come a HBox with all of the buttons)
        buttonBubble.setOnAction(e ->
                Pages.show(Pages.BUBBLE)
        );

        buttonCycle.setOnAction(e ->
                Pages.show(Pages.CYCLE)
        );

        buttonHeap.setOnAction(e ->
                Pages.show(Pages.HEAP)
        );

        buttonInsertion.setOnAction(e ->
                Pages.show(Pages.INSERTION)
        );

        buttonMerge.setOnAction(e ->
                Pages.show(Pages.MERGE)
        );

        buttonQuick.setOnAction(e ->
                Pages.show(Pages.QUICK)
        );

        buttonSelection.setOnAction(e ->
                Pages.show(Pages.SELECTION)
        );

        // root
        BorderPane root = new BorderPane();
        root.setTop(titleBox);
        root.setLeft(textBox);
        root.setBottom(buttons);

        return root;
    }
}