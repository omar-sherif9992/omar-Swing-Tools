package omar_trials;

import javax.swing.*;

public class dialogBox {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"hello","dont come",JOptionPane.PLAIN_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"hello","dont come",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,"bro, do you even","ss",JOptionPane.YES_NO_OPTION);
        String[] responses={"omar","hallaaaa","noaa"};
   JOptionPane.showOptionDialog(null,
           "hi",
           "secret",
           JOptionPane.YES_NO_OPTION,
           JOptionPane.INFORMATION_MESSAGE,null,responses,0);


    }
}
