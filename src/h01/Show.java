package h01;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       setBackground(Color.BLACK);

        g.setColor(Color.WHITE);
        g.drawLine(50, 200, 200, 200);
        g.drawLine(50, 200, 50, 50);
        g.drawLine(200, 200, 50, 50);
        g.drawLine(50, 200, 50, 400);
        g.drawLine(200, 200, 200, 400);
        g.drawRect(70, 350, 30, 50);
        g.drawOval(80, 135, 40, 40);
        g.drawLine(50, 400, 200, 400);


    }
}