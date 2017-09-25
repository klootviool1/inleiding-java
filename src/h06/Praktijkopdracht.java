package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet{

    double a;
    double b;
    double c;
    double d;
    double e;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;

        uitkomst = (a + b + c) / 3;
        uitkomst = (int) (uitkomst * 10);
        uitkomst = uitkomst / 10;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }


}
