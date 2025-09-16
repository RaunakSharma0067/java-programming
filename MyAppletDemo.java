import javax.swing.*;
import java.awt.*;

public class MyAppletDemo extends JFrame {
    public MyAppletDemo() {
        setTitle("Applet Converted to JFrame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Welcome", 200, 200);
    }

    public static void main(String[] args) {
        MyAppletDemo frame = new MyAppletDemo();
        frame.setVisible(true);
    }
}
