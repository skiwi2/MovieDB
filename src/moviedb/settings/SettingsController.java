
package moviedb.settings;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Frank van Heeswijk
 */
public class SettingsController implements Initializable {
    @FXML
    private TitledPane generalTitledPane;
    
    @FXML
    private AnchorPane contentPane;
    
    @Override
    public void initialize(final URL url, final ResourceBundle resourceBundle) {
        Platform.runLater(() -> generalTitledPane.expandedProperty().setValue(true));
    }
    
    @FXML
    private void handleMenuGeneralGeneralAction(final ActionEvent actionEvent) {
        
    }
}
