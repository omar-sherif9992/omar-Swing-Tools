package omar_trials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton myButton =new JButton("new Window");
    public launchPage(){
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(420,420);
         frame.setLayout(null);
         frame.setVisible(true);

    }
    public static void main(String[] args) {
        launchPage l=new launchPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==myButton){
    frame.dispose();
    window myWindow =new window();
}
    }
}
