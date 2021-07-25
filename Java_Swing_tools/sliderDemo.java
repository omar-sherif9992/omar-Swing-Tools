package omar_trials;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class sliderDemo implements ChangeListener {
    myFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    public sliderDemo(){
      frame=new myFrame();
      panel=new JPanel();
      label=new JLabel();
      slider=new JSlider(0,100,50);
      slider.setPreferredSize(new Dimension(400,200));
slider.setPaintTicks(true);
slider.setMinorTickSpacing(10);
        slider.setOrientation(SwingConstants.VERTICAL);
label.setText(slider.getValue()+"CELSIUS");

slider.addChangeListener(this);
     panel.add(slider);
     panel.add(label);
     frame.add(panel);

     frame.pack();

    }
    public static void main(String[] args) {
        new sliderDemo();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
label.setText(slider.getValue()+"CELSIUS");
    }
}
