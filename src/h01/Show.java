package h01;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       setBackground(Color.WHITE);

        //Huisie
        g.setColor(Color.BLACK);
        g.drawLine(50, 200, 200, 200);
        g.drawLine(50, 200, 50, 50);
        g.drawLine(200, 200, 50, 50);
        g.drawLine(50, 200, 50, 400);
        g.drawLine(200, 200, 200, 400);
        g.drawRect(70, 350, 30, 50);
        g.drawOval(80, 135, 40, 40);
        g.drawLine(50, 400, 200, 400);

        //Vlaggetje
        g.setColor(Color.black);
        g.drawLine(500, 200, 500, 600);
        g.drawLine(500, 200, 800, 200);
        g.setColor(Color.BLUE);
        g.fillRect(500, 200, 300, 66);
        g.setColor(Color.white);
        g.fillRect(500, 132, 300, 66);
        g.setColor(Color.red);
        g.fillRect(500, 66, 300, 66);

        //Triangle
        g.setColor(Color.green);
        g.drawLine(130, 130,210,35);
        g.drawLine(290, 130,210, 35);
        g.drawLine(130,130, 290, 130);

        







    }
}