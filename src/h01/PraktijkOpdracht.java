package h01;


    import java.awt.*;
import java.applet.*;

    public class PraktijkOpdracht extends Applet {
        //declaratie

        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;


        public void init() {
            //initialisatie

            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 200;
            hoogte = 100;
        }

        public void paint(Graphics g) {

            //figuren

            g.setColor(lijnkleur);
            g.drawLine(20, 30, 100, 30);
            g.drawString("Lijn", 20, 20);
            g.setColor(lijnkleur);
            g.drawRect(20, 70, 100, 60);
            g.drawString("Rectangle", 20, 60);
            g.setColor(lijnkleur);
            g.drawRoundRect(20, 170, 100, 60, 20, 20);
            g.drawString("RoundRectangle", 20, 160);
            g.setColor(opvulkleur);
            g.fillOval(20, 240, 100, 60);
            g.setColor(opvulkleur);
            g.fillRect(20, 320, 100, 60);
            g.setColor(lijnkleur);
            g.drawOval(20, 320, 100, 60);
            g.setColor(lijnkleur);
            g.drawOval(20, 400, 100, 60);
            g.setColor(opvulkleur);
            g.fillArc(20, 398, 100, 60, 45, 90);
            g.setColor(lijnkleur);
            g.drawOval(20, 490, 100, 100);




        }
    }

