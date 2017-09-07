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
        g.drawLine(80, 155, 120, 155);
        g.drawLine(100, 175, 100, 135);
        g.drawOval(90, 380, 5, 5);
        g.drawRect(130, 350, 50, 30);
        g.drawRect(150, 250, 30, 40);
        g.drawRect(70, 250, 30, 40);




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
        g.setColor(Color.BLACK);
        g.drawLine(250, 250,330,155);
        g.drawLine(410, 250,330, 155);
        g.drawLine(250,250, 410, 250);

        







    }
}