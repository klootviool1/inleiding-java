package h01;

import java.applet.Applet;
import java.awt.*;


public class Hoofdstuk6 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 13;
        b = 100;
        c = 4;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}

