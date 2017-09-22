package h04;


import java.applet.Applet;
import java.awt.*;

public class DobbelDobbel extends Applet {

    public void init() {
    }

    //Dobbelsteen
    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        g.setColor(Color.white);
        g.fillRoundRect(500, 300, 350, 350, 20, 20);
        g.setColor(Color.black);
        g.fillOval(560,360, 50,50);
        g.fillOval(560, 550, 50,50);
        g.fillOval(740, 550, 50, 50);
        g.fillOval(740, 360, 50, 50);

    }
}
