import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxEventGUI extends JFrame implements ActionListener {
    JTextField t1, t2, result;
    JComboBox<String> operations;
    ComboBoxEventGUI() {
        setTitle("ComboBox Event Demo");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        operations = new JComboBox<String>();
        operations.addItem("Add");
        operations.addItem("Subtract");
        operations.addItem("Multiply");
        operations.addItem("Divide");
        operations.addActionListener(this);
        add(new JLabel("Enter Number 1:"));
        add(t1);
        add(new JLabel("Enter Number 2:"));
        add(t2);
        add(new JLabel("Select Operation:"));
        add(operations);
        add(new JLabel("Result:"));
        add(result);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            String op = (String) operations.getSelectedItem();
            double res;
            if (op.equals("Add")) {
                res = num1 + num2;
            } else if (op.equals("Subtract")) {
                res = num1 - num2;
            } else if (op.equals("Multiply")) {
                res = num1 * num2;
            } else {
                if (num2 == 0) {
                    result.setText("Error");
                    return;
                }
                res = num1 / num2;
            }
            result.setText(String.valueOf(res));
        } catch (Exception ex) {
            result.setText("Invalid");
        }
    }
    public static void main(String[] args) {
        new ComboBoxEventGUI();
    }
}