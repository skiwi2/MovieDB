
package integration.menubar;

import org.junit.Test;
import static org.loadui.testfx.Assertions.*;

/**
 *
 * @author Frank van Heeswijk
 */
public class OptionsSettingsTest extends AbstractMenubarTest {
    @Test
    public void testOptionsSettingsAction() {
        click("#optionsMenu");
        click("#optionsSettingsButton");
        
        assertNodeExists("#settingsRoot");
    }
}
