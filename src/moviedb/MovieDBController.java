
package moviedb;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import moviedb.settings.SettingsController;

/**
 * FXML Controller class
 *
 * @author Frank van Heeswijk
 */
public class MovieDBController implements Initializable {
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle) {
        
    }
    
    @FXML
    private void handleFileQuitButtonAction(final ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    private void handleOptionsSettingsButtonAction(final ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SettingsController.class.getResource("SettingsStage.fxml"), ResourceBundle.getBundle("bundles/bundle", new Locale("en")));
        Stage stage = fxmlLoader.load();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(MovieDB.getPrimaryStage());
        stage.initStyle(StageStyle.DECORATED);
        
        stage.show();
    }
}
