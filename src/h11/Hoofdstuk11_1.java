package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11_1 extends Applet {



    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.drawLine(20, 20, 20, 100);
        g.setColor(Color.red);
        g.drawLine(30, 20, 30, 100);
        g.setColor(Color.cyan);
        g.drawLine(40, 20, 40, 100);
        g.setColor(Color.orange);
        g.drawLine(50, 20, 50, 100);
        g.setColor(Color.yellow);
        g.drawLine(60, 20, 60, 100);
    }
}

