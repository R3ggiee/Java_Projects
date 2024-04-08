import java.awt.Dimension;
import javax.swing.*;

public class GuiTemplate {
    private JFrame frame;
    private JPanel mainPanel;
    // Declarations of labels, buttons, etc. go here...

    public GuiTemplate() {
        frame = new JFrame("This is the text in the title bar.");
        mainPanel = new JPanel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
        initialize();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuiTemplate();
            }
        });
    }

    private void initialize() {
        mainPanel.setPreferredSize(new Dimension(300,300));
        // Create labels, buttons, etc. and place them on the window here...
    }
}