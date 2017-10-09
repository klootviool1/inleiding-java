package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11_5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.drawRect(20, 20, 50, 50);
        g.drawRect(70, 70, 50, 50);
        g.drawRect(120, 120, 50, 50);
        g.drawRect(170, 170, 50, 50);
        g.drawRect(220, 220, 50, 50);
    }
}
