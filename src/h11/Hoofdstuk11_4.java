package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11_4 extends Applet {



    public void init(){

    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        int teller;
        int antwoord;
        int y = 0;

        for (teller = 1; teller < 11; teller++) {
            antwoord = teller * 3;
            y +=20;
            g.drawString(teller + " x 3 = " + antwoord, 120, y );
        }
    }
}
