package omar_trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {
    JLabel label=new JLabel();
    myFrame frame=new myFrame();
public Key(){
    frame.setLayout(null);
frame.addKeyListener(this);
label.setBackground(Color.RED);
label.setOpaque(true);
frame.setSize(500,500);

label.setBounds(0,0,100,100);
frame.add(label);



}
    public static void main(String[] args) {
        new Key();

    }

    @Override
    public void keyTyped(KeyEvent e) {
switch (e.getKeyChar()){
    case 'a':label.setLocation(label.getX()-10,label.getY());break;
    case 'd':label.setLocation(label.getX()+10,label.getY());break;
    case 's':label.setLocation(label.getX(),label.getY()-10);break;
    case 'w':label.setLocation(label.getX(),label.getY()+10);break;



}
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;

        }
         }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("ok good"+e.getKeyChar());


    }
}
