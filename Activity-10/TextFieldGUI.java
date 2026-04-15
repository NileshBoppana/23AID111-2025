import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Checker");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        JLabel resultLabel = new JLabel("");

        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();

                if (input.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Error: Field is empty!");
                } else {
                    resultLabel.setText("You entered: " + input);
                }
            }
        });

        frame.setVisible(true);
    }
}