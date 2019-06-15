import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class HanoiGUITest{

    private FrameFixture window;
    private HanoiGUI frame;

    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @Before
    public void setUp() {
        frame = GuiActionRunner.execute(() -> new HanoiGUI());
        window = new FrameFixture(frame);
    }

    @Test
    public void checkTitle() {
        assertTrue("Put a tittle to your frame.", frame.getTitle().length() > 0);
    }

    @Test
    public void checkVisible() {
        window.requireVisible();
    }

    @Test
    public void checkSize(){
        int width = frame.getWidth();
        int height = frame.getHeight();
        assertTrue("Please set a dimension.", width > 0 && height > 0);
    }

    @Test
    public void checkIfFrameHaveMenu(){
        assertTrue("Create a JMenuBar.", frame.getJMenuBar() != null);
    }

    @Test
    public void checkFrameMenuCount(){
        assertTrue("Your JMenuBar is empty.", frame.getJMenuBar().getMenuCount() > 0);
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }

}