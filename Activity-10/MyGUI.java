import javax.swing.*;
import java.awt.event.*;

class MyGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField t = new JTextField();
        JButton b = new JButton("Submit");

        t.setBounds(50, 50, 200, 30);
        b.setBounds(50, 100, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = t.getText();
                if (s.equals("")) {
                    JOptionPane.showMessageDialog(f, "Error");
                } else {
                    JOptionPane.showMessageDialog(f, s);
                }
            }
        });

        f.add(t);
        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}