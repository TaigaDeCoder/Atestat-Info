package com.tayga;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Bubble {

    public static Parent create() {

        Button butonMeniuPrincipal = new Button("Meniu Principal");
        butonMeniuPrincipal.setLayoutX(100);
        butonMeniuPrincipal.setLayoutY(160);
        butonMeniuPrincipal.setPrefSize(300, 100);

        butonMeniuPrincipal.setOnAction(e ->
                Pages.show(Pages.PAGINA_PRINCIPALA)
        );

        Text title = new Text(100, 150, "Bubble Sort");
        title.setFont(new Font(20));

        Pane layout = new Pane();
        layout.getChildren().addAll(butonMeniuPrincipal, title);

        return layout;
    }
}
