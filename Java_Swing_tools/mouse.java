package omar_trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouse implements MouseListener {
myFrame frame=new myFrame();
JLabel label=new JLabel();

public  mouse(){
    frame.setLayout(null);
    label.setBounds(0,0,100,100);
    label.setBackground(Color.RED);
    label.setOpaque(true);
    label.addMouseListener(this);
    frame.add(label);

}



    public static void main(String[] args) {
new mouse();
    }
    public void mouseClicked(MouseEvent e) {
System.out.println("uuu");
label.setBackground(Color.YELLOW);
    }

    @Override
    public void mousePressed(MouseEvent e) {
System.out.println("uuu");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
