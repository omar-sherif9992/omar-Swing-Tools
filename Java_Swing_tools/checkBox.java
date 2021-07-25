package omar_trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkBox implements ActionListener {
    JCheckBox checkBox1;
    JButton button;
public  checkBox(){
     button=new JButton();
    myFrame frame=new myFrame();
    button.setText("submit");
    button.addActionListener(this);
    checkBox1=new JCheckBox();
    checkBox1.setText("im not ");
    checkBox1.setFocusable(false);
    checkBox1.setFont(new Font("Consols",Font.PLAIN,35));
    frame.add(checkBox1);
frame.add(button);
    frame.pack();



}

    public static void main(String[] args) {
new checkBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           System.out.println(checkBox1.isSelected());

       }
    }
}
