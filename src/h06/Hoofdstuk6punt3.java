package h06;

import java.applet.Applet;
import java.awt.*;

    public class Hoofdstuk6punt3 extends Applet {
        int a;
        int b;
        int uitkomst;

        public void init() {
            a = 200;
            b = 100;
            uitkomst = (a + b);
        }

        public void paint(Graphics g) {
            g.drawString(uitkomst + "De uitkomst is: ", 20, 20);
        }
    }

