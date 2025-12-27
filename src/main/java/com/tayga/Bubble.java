package com.tayga;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bubble {
    public static void start(Stage stage) {
        Button butonMeniuPrincipal = new Button("Meniu Principal");
        butonMeniuPrincipal.setLayoutX(100);
        butonMeniuPrincipal.setLayoutY(160);
        butonMeniuPrincipal.setPrefSize(300, 100);

        Bubble pagina = new Bubble();

        butonMeniuPrincipal.setOnAction(e ->
                PaginaPrincipala.start(stage)
        );

        Text Text = new Text(100,150,"Bubble Sort");
        Text.setFont(new Font(20));


        Pane layout = new Pane();
        layout.getChildren().add(butonMeniuPrincipal);
        layout.getChildren().add(Text);

        Scene scene = new Scene(layout, Main.xSize, Main.ySize);

        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
}
