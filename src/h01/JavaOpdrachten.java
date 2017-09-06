package h01;


    import java.awt.*;
    import java.applet.*;

    public class JavaOpdrachten extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {

            //Namen
            g.setColor(Color.black);
            g.drawString("Valerie", 200, 620);
            g.drawString("Jeroen", 400, 620);
            g.drawString("Hans", 600, 620);

            //Diagram
            g.setColor(Color.pink);
            g.fillRect(200, 400, 80,80);
            g.setColor(Color.GREEN);
            g.fillRect(400, 400, 80, 200);
            g.setColor(Color.blue);
            g.fillRect(600, 400, 80, 160);

        }
    }

