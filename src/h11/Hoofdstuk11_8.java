package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11_8 extends Applet {

    public void init() {}

    @Override
    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        int teller;
        int vergoting = 10;
        int x = 500;
        int y = 500;

        for (teller = 0; teller < 51; teller++) {
            vergoting += 10;
            x += -10;
            y += -5;
            g.drawOval(x, y, vergoting, vergoting);
        }
    }
}

