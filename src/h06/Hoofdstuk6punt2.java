package h06;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk6punt2 extends Applet {
    double a;
    double b;
    double c;
    double d;
    long e;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        uitkomst = (a + b + c) / d * e / e;
        uitkomst = (int) uitkomst;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}