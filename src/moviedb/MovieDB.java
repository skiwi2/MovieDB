
package moviedb;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Frank van Heeswijk
 */
public class MovieDB extends Application {
    @Override
    public void start(final Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieDBController.class.getResource("MovieDB.fxml"), ResourceBundle.getBundle("bundles/bundle", new Locale("en")));
        Parent root = fxmlLoader.load();
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("MovieDB");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
