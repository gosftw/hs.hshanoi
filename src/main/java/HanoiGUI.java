import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HanoiGUI extends JFrame {

    public HanoiGUI(){
        super("Tower of Hanoi");
        setSize(600, 300);


        JMenuBar menu = createMenuBar();
        setJMenuBar(menu);


        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu game = new JMenu("Game");
        JMenuItem newItem = new JMenuItem("New");
        game.add(newItem);
        menuBar.add(game);
        return menuBar;
    }
}
