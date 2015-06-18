
import java.awt.BorderLayout;
import javax.swing.JApplet;

/**
 *
 * @author Tjen
 */
public class SplitterApplet extends JApplet
{
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
        setLayout(new BorderLayout());
        add(new Splitter(), BorderLayout.CENTER);
    }
}
