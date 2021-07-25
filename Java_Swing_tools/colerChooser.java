package omar_trials;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colerChooser implements ActionListener {
myFrame frame;
JButton button;
JLabel label;
    public colerChooser(){
        frame=new myFrame();
button=new JButton("submit");
button.setBackground(Color.lightGray);
label=new JLabel();
button.addActionListener(this);
label.setBackground(Color.WHITE);
label.setText("hello");
label.setOpaque(true);
frame.add(button);
frame.add(label);


frame.pack();

    }

    public static void main(String[] args) {
        new colerChooser();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    JColorChooser colorChooser=new JColorChooser();
    Color color=JColorChooser.showDialog(null,"Pick a color",Color.BLACK);
    label.setForeground(color);
}
    }
}
