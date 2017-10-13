package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_1 extends Applet {

    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    Button knop;
    Color opvulkleur;
    Color lijnkleur;
    int hoogtevdXas;
    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {

        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        tekstvak3 = new TextField("", 20);
        opvulkleur = Color.cyan;
        lijnkleur = Color.BLACK;
        hoogtevdXas = 200;
        Valerie = 60;
        Jeroen = 120;
        Hans = 90;
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(knop);

    }

    public void paint(Graphics g) {

        g.drawLine(50, hoogtevdXas, 300, hoogtevdXas);
        g.drawLine(50, hoogtevdXas, 50, 10);

        g.setColor(Color.green);
        g.fillRect(60, hoogtevdXas - Valerie, 40, Valerie);

        g.setColor(Color.red);
        g.fillRect(140, hoogtevdXas - Jeroen, 40, Jeroen);

        g.setColor(Color.blue);
        g.fillRect(220, hoogtevdXas - Hans, 40, Hans);

        g.setColor(lijnkleur);
        g.drawString("0", 40, 210);
        g.drawString("20", 30, 180);
        g.drawString("40", 30, 150);
        g.drawString("60", 30, 120);
        g.drawString("80", 30, 90);
        g.drawString("100", 25, 60);
        g.drawString("120", 25, 30);


    }
    class

}





