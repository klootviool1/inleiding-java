package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11_3 extends Applet {

    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.red);
        g.drawString("1,1,2,3,5,8,13,21,34,55,89,144,233 enzovoorts.", 50, 50);
    }
}
