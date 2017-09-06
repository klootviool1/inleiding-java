package h01;

import java.applet.Applet;
import java.awt.*;

    //Stoplicht

    public class Opdracht4punt6 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.lightGray);

            g.setColor(Color.black);
            g.fillRect(600, 200, 200, 500);
            g.setColor(Color.red);
            g.fillOval(625, 210, 150, 150);
            g.setColor(Color.ORANGE);
            g.fillOval(625, 370, 150,150);
            g.setColor(Color.green);
            g.fillOval(625, 530, 150,150);



        }
    }

