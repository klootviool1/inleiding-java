package h01;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk6punt2 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 60;
        b = 3600;
        c = 86400;
        uitkomst = (a * 60);
        uitkomst = (b * 24);
        uitkomst = (c * 31536000);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}