package omar_trials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox implements ActionListener {

   JComboBox comboBox;
public comboBox(){
    myFrame frame=new myFrame();
    String [] animals={"dog","cat","bird"};
    comboBox=new JComboBox(animals);
    comboBox.addActionListener(this);
    frame.add(comboBox);
    comboBox.setVisible(true);
    frame.pack();


}

    public static void main(String[] args) {
        new comboBox();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
