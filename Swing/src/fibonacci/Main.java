package fibonacci;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fibonacci Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JTextField textField = new JTextField(10);
            ((AbstractDocument) textField.getDocument()).setDocumentFilter(new NumberOnlyFilter());


            JButton button = new JButton("Calculate");
            button.addActionListener(e -> {
                try {
                    int n = Integer.parseInt(textField.getText());
                    int result = FibonacciIterative.fibonacci(n);
                    JOptionPane.showMessageDialog(frame, "The " + n + " Fibonacci number is " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number");
                } catch (IntegerOverflowException ex) {
                    JOptionPane.showMessageDialog(frame, "Fibonacci number larger than max integer number");
                }
            });

            JPanel panel = new JPanel();
            panel.add(new JLabel("Enter a number:"));
            panel.add(textField);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        });
    }
}

class NumberOnlyFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
        if (string.matches("\\d*")) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) throws javax.swing.text.BadLocationException {
        if (text.matches("\\d*")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws javax.swing.text.BadLocationException {
        super.remove(fb, offset, length);
    }
}