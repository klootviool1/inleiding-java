package h01;


    import java.awt.*;
    import java.applet.*;

    public class JavaOpdrachten extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {

            //Indicatie
            g.drawLine(190, 610, 190, 200);
            g.drawLine(190, 610, 700, 610);

            //Namen
            g.setColor(Color.black);
            g.drawString("Valerie", 200, 630);
            g.drawString("Jeroen", 400, 630);
            g.drawString("Hans", 600, 630);

            //Diagram
            g.setColor(Color.pink);
            g.fillRect(200, 530, 80,80);
            g.setColor(Color.GREEN);
            g.fillRect(400, 410, 80, 200);
            g.setColor(Color.blue);
            g.fillRect(600, 450, 80, 160);

            //gewichten
            g.setColor(Color.BLACK);
            g.drawString("40", 150, 550);
            g.drawString("80", 150, 450);
            g.drawString("100", 150, 400);

        }
    }

