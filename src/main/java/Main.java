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

        PaginaPrincipala pagina = new PaginaPrincipala();
        pagina.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
