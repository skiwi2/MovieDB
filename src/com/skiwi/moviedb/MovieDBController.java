
package com.skiwi.moviedb;

import com.skiwi.moviedb.settings.SettingsController;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Frank van Heeswijk
 */
public class MovieDBController implements Initializable {
    @FXML
    private Parent root;
    
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle) {
        
    }
    
    @FXML
    private void handleFileQuitButtonAction(final ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    private void handleOptionsSettingsButtonAction(final ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SettingsController.class.getResource("SettingsStage.fxml"), 
            ResourceBundle.getBundle("com/skiwi/bundles/bundle", new Locale("en")));
        Stage stage = fxmlLoader.load();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.initStyle(StageStyle.DECORATED);
        stage.show();
    }
}
