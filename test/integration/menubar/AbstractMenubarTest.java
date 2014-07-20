
package integration.menubar;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import moviedb.MovieDBController;
import org.junit.Ignore;
import org.loadui.testfx.GuiTest;

/**
 *
 * @author Frank van Heeswijk
 */
@Ignore
public class AbstractMenubarTest extends GuiTest {
    @Override
    protected Parent getRootNode() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MovieDBController.class.getResource("MovieDB.fxml"), ResourceBundle.getBundle("bundles/bundle", new Locale("en")));
            return fxmlLoader.load();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
