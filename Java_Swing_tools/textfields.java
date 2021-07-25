package omar_trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textfields implements ActionListener {
    JButton button;
    JTextField textField;

public textfields(){
    myFrame frame=new myFrame();
    button=new JButton("Submit");
    button.addActionListener(this);
    frame.add(button);



    textField=new JTextField();
    textField.setPreferredSize(new Dimension(250,40));
    textField.setForeground(new Color(0x00FF00));
    textField.setFont(new Font("Consolas",Font.PLAIN,35));
    textField.setBackground(Color.BLACK);
    textField.setCaretColor(Color.GREEN);


    frame.add(textField);
    frame.pack();
}
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println( textField.getText());
        }}
    public static void main(String[] args) {
new textfields();

    }
}
