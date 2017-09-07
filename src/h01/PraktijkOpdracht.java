package h01;


    import java.awt.*;
import java.applet.*;

    public class PraktijkOpdracht extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {

            //figuren

            g.setColor(Color.red);
            g.drawLine(20, 30, 100, 30);
            g.drawString("Lijn", 20, 20);
            g.setColor(Color.ORANGE);
            g.drawRect(20, 70, 100, 60);
            g.drawString("Rectangle", 20, 60);
            g.setColor(Color.darkGray);
            g.drawRoundRect(20, 170, 100, 60, 20, 20);
            g.drawString("RoundRectangle", 20, 160);
            g.setColor(Color.green);
            g.fillOval(20, 240, 100, 60);
            g.setColor(Color.blue);
            g.fillRect(20, 320, 100, 60);
            g.setColor(Color.BLACK);
            g.drawOval(20, 320, 100, 60);
            g.setColor(Color.black);
            g.drawOval(20, 400, 100, 60);
            g.setColor(Color.cyan);
            g.fillArc(20, 398, 100, 60, 45, 90);
            g.setColor(Color.pink);
            g.drawOval(20, 490, 100, 100);




        }
    }

