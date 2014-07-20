
package integration.menubar;

import org.junit.Test;

/**
 *
 * @author Frank van Heeswijk
 */
public class FileQuitTest extends AbstractMenubarTest {
    @Test
    public void testFileQuitAction() {
        click("#fileMenu");
        click("#fileQuitButton");
    }
}
