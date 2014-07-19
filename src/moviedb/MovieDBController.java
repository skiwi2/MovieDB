
package moviedb;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

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
    private void handleOptionsSettingsButtonAction(final ActionEvent actionEvent) {
        
    }
}
