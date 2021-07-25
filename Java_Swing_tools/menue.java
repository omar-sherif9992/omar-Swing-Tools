package omar_trials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class menue implements ActionListener {
    myFrame frame;
    JMenuBar menuBar;
    JMenuItem save;
    JMenuItem exit;

    public menue(){
        frame=new myFrame();
    menuBar=new JMenuBar();
    JMenu fileMenue=new JMenu("File");
        JMenu editMenue=new JMenu("Edit");
        JMenu helpMenue=new JMenu("Help");
menuBar.add(fileMenue);
        menuBar.add(editMenue);
        menuBar.add(helpMenue);
         save=new JMenuItem("Save");
        exit=new JMenuItem("exit");
        save.addActionListener(this);
        exit.addActionListener(this);
        fileMenue.setMnemonic(KeyEvent.VK_F);
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);
        fileMenue.add(exit);
        fileMenue.add(save);
frame.add(menuBar);
frame.pack();
    }

    public static void main(String[] args) {
        new menue();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==save)
         System.out.println("save");
    if (e.getSource()==exit)
if( (JOptionPane.showConfirmDialog(frame,"are You sure","Exit",JOptionPane.YES_NO_OPTION))==0){//TODO imp
        System.exit(0);}


    }
}
