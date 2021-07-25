package omar_trials;

import javax.swing.*;
import java.awt.*;

public class layeredPane {
    public layeredPane(){
        JLabel label1 =new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);
        JLabel label2 =new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100,100,200,200);
        JLabel label3 =new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,200,200);
        JButton b=new JButton("oamr");

        b.setBounds(100,160,200,200);
        JLayeredPane layer=new JLayeredPane();
        layer.setBounds(0,0,500,500);
        layer.add(label1, JLayeredPane.DEFAULT_LAYER);
        layer.add(b,JLayeredPane.DEFAULT_LAYER);

        layer.add(label3,JLayeredPane.DRAG_LAYER);
        JFrame frame=new JFrame();
        frame.add(layer);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new layeredPane();
    }

}
