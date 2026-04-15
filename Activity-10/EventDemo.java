import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo extends JFrame implements KeyListener, MouseListener {
    JTextArea area;
    EventDemo() {
        setTitle("Keyboard & Mouse Events");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        area = new JTextArea(10, 30);
        area.setFocusable(true);
        area.addKeyListener(this);
        area.addMouseListener(this);
        add(new JScrollPane(area));

        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        area.append("Key Pressed: " + e.getKeyChar() + "\n");
    }
    public void keyReleased(KeyEvent e) {
        area.append("Key Released: " + e.getKeyChar() + "\n");
    }
    public void keyTyped(KeyEvent e) {
        area.append("Key Typed: " + e.getKeyChar() + "\n");
    }
    public void mouseClicked(MouseEvent e) {
        area.append("Mouse Clicked at (" + e.getX() + "," + e.getY() + ")\n");
    }
    public void mousePressed(MouseEvent e) {
        area.append("Mouse Pressed\n");
    }
    public void mouseReleased(MouseEvent e) {
        area.append("Mouse Released\n");
    }
    public void mouseEntered(MouseEvent e) {
        area.append("Mouse Entered\n");
    }
    public void mouseExited(MouseEvent e) {
        area.append("Mouse Exited\n");
    }
    public static void main(String[] args) {
        new EventDemo();
    }
}