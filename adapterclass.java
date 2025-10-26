import java.awt.*;
import java.awt.event.*;

// Custom adapter class implementing MouseListener.

abstract class MyAdapter implements MouseListener {
    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}

// Child class overriding only the needed method.

class MyMouseEvent extends MyAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked:");
    }
}

public class adapterclass {
    public static void main(String args[]) {
        Frame f = new Frame("Adapter In Java");
        MyMouseEvent obj = new MyMouseEvent();
        f.addMouseListener(obj);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
