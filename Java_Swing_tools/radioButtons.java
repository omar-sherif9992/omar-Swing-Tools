package omar_trials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radioButtons implements ActionListener {
    JRadioButton pizza;
    JRadioButton ham;
    JRadioButton hot;

    public radioButtons(){
        myFrame frame=new myFrame();
         pizza=new JRadioButton("Pizza");
         pizza.addActionListener(this);
         ham=new JRadioButton("ham");
         hot=new JRadioButton("hot");
         ham.addActionListener(this);
         hot.addActionListener(this);
        ButtonGroup group=new ButtonGroup();
   group.add(pizza);
   group.add(ham);
   group.add(hot);
   frame.add(pizza);
   frame.add(hot);
   frame.add(ham);




        frame.pack();



    }

    public static void main(String[] args) {
        new radioButtons();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizza)
            System.out.println("you ordered pizza");
        if(e.getSource()==ham)
            System.out.println("you ordered ham");
        if(e.getSource()==hot)
            System.out.println("you ordered hot");
    }

}
