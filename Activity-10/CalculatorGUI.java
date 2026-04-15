import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    JTextField t1, t2, result;
    JComboBox<String> operations;
    JButton calculate;
    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 250);
        setLayout(new FlowLayout());
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        String ops[] = {"+", "-", "*", "/"};
        operations = new JComboBox<>(ops);
        calculate = new JButton("Calculate");
        calculate.addActionListener(this);
        add(new JLabel("Number 1:"));
        add(t1);
        add(new JLabel("Number 2:"));
        add(t2);
        add(new JLabel("Operation:"));
        add(operations);
        add(calculate);
        add(new JLabel("Result:"));
        add(result);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            String op = (String) operations.getSelectedItem();
            double res = 0;
            switch (op) {
                case "+": res = num1 + num2; break;
                case "-": res = num1 - num2; break;
                case "*": res = num1 * num2; break;
                case "/": res = num1 / num2; break;
            }
            result.setText(String.valueOf(res));
        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }
    public static void main(String[] args) {
        new CalculatorGUI();
    }
}