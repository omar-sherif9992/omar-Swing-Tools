package omar_trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    JPanel panel;
    ImageIcon image=new ImageIcon("Rome.png");
    int width=image.getIconWidth();
    int height=image.getIconHeight();
    Point imageCorner;
    Point prevpt;

    public DragPanel(){

        imageCorner=new Point(0,0);
        ClickListener clickListener=new ClickListener();
        DragListener dragListener=new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g){
    super.paintComponent(g);
    image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevpt=e.getPoint();
        }
    }


    private class DragListener extends MouseMotionAdapter{

public void mouseDragged(MouseEvent e){
    Point currentPt=e.getPoint();
    imageCorner.translate((int)(currentPt.getX()-prevpt.getX()),(int)(currentPt.getY()-prevpt.getY()));
prevpt=currentPt;
repaint();
}
    }
}
