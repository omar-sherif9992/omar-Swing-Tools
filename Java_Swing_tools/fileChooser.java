package omar_trials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fileChooser implements ActionListener {
myFrame frame=new myFrame();
JButton button =new JButton("Select file");
public fileChooser(){

    frame.add(button);
    button.addActionListener(this);
frame.pack();

}
    public static void main(String[] args) {
new fileChooser();
    }
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==button){
    JFileChooser fileChooser=new JFileChooser();
    int response=fileChooser.showSaveDialog(null);
    if(response== JFileChooser.APPROVE_OPTION){

    }

}
    }
}
