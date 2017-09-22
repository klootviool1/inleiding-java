package h04;


    import java.awt.*;
    import java.applet.*;

    public class JavaOpdrachten extends Applet {

        Color invulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte1;

        public void init() {

            breedte = 150;
            hoogte1 = 140;
        }

        public void paint(Graphics g) {

            //Indicatie
            g.drawLine(190, 610, 190, 200);
            g.drawLine(190, 610, 760, 610);

            //Namen
            g.setColor(Color.black);
            g.drawString("Valerie", 200, 630);
            g.drawString("Jeroen", 400, 630);
            g.drawString("Hans", 600, 630);

            //Diagram
            g.setColor(Color.pink);
            g.fillRect(200, 470, 150, hoogte1);
            g.setColor(Color.GREEN);
            g.fillRect(400, 240, 150, 370);
            g.setColor(Color.blue);
            g.fillRect(600, 320, 150, 290);

            //gewichten
            g.setColor(Color.BLACK);
            g.drawString("40", 150, 480);
            g.drawString("80", 150, 320);
            g.drawString("100", 150, 240);
            g.drawString("10", 150, 600);
            g.drawString("20", 150, 560);
            g.drawString("30", 150, 520);
            g.drawString("50", 150, 440);
            g.drawString("60", 150, 400);
            g.drawString("70", 150, 360);
            g.drawString("90", 150, 280);

        }
    }

