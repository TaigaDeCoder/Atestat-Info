package com.tayga;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Pages {

    private static Stage stage;

    public static Scene PAGINA_PRINCIPALA;
    public static Scene BUBBLE;

    public static void init(Stage s) {
        stage = s;
        PAGINA_PRINCIPALA = new Scene(PaginaPrincipala.create(), Main.xSize, Main.ySize);
        BUBBLE = new Scene(Bubble.create(), Main.xSize, Main.ySize);

        stage.setScene(PAGINA_PRINCIPALA);
        stage.setMaximized(true);
    }

    public static void show(Scene scene) {
        stage.setScene(scene);
    }
}
