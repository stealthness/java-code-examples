package base;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Basic Swing Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JButton button = new JButton("Click Me");
            button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

            frame.getContentPane().add(button);
            frame.setVisible(true);
        });
    }
}