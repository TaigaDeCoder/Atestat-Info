package com.tayga;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Pages {

    private static Stage stage;

    public static Scene PAGINA_PRINCIPALA;
    public static Scene BUBBLE;
    public static Scene CYCLE;
    public static Scene HEAP;
    public static Scene INSERTION;
    public static Scene MERGE;
    public static Scene QUICK;
    public static Scene SELECTION;

    public static void init(Stage s) {
        stage = s;

        // create scenes ONCE
        PAGINA_PRINCIPALA = new Scene(PaginaPrincipala.create(), Main.xSize, Main.ySize);
        BUBBLE = new Scene(Bubble.create(), Main.xSize, Main.ySize);
        CYCLE = new Scene(Cycle.create(), Main.xSize, Main.ySize);
        HEAP = new Scene(Heap.create(), Main.xSize, Main.ySize);
        INSERTION = new Scene(Insertion.create(), Main.xSize, Main.ySize);
        MERGE = new Scene(Merge.create(), Main.xSize, Main.ySize);
        QUICK = new Scene(Quick.create(), Main.xSize, Main.ySize);
        SELECTION = new Scene(Selection.create(), Main.xSize, Main.ySize);

        // set ONLY the initial scene
        stage.setScene(PAGINA_PRINCIPALA);
        stage.setMaximized(true);
    }

    public static void show(Scene scene) {
        stage.setScene(scene);
    }
}
