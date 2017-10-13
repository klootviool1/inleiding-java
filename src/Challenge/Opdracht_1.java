package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_1 extends Applet {
     TextField tekstvak;
     TextField tekstvak2;
     TextField tekstvak3;
     int Valerie = 40;
     int Jeroen = 80;
     int Hans = 60;

    public void init(){
        //labels
        Label Vlabel = new Label("VAlERIE");
        Label Jlabel = new Label("JEROEN");
        Label Hlabel = new Label("HANS");
        //tekstvakken
        tekstvak = new TextField(4);
        tekstvak2 = new TextField(4);
        tekstvak3 = new TextField(4);
        //knoppen
        Button knop = new Button("Toon");
        knop.addActionListener(new KnopListener());
        //adden
        add(Vlabel);
        add(tekstvak);
        add(Jlabel);
        add(tekstvak2);
        add(Hlabel);
        add(tekstvak3);
        add(knop);

    }
    public void paint( Graphics g){
        //lines
        g.drawLine(60, 60, 60, 200);
        g.drawLine(60, 200, 300, 200);
        g.drawLine(55, 180, 65, 180);
        g.drawLine(55, 160, 65, 160);
        g.drawLine(55, 140, 65, 140);
        g.drawLine(55, 120, 65, 120);
        g.drawLine(55, 100, 65, 100);
        g.drawLine(55, 80, 65, 80);
        g.drawLine(55,60,65,60);
//strings
        g.drawString("0",35,200);
        g.drawString("20",35,180);
        g.drawString("40",35,160);
        g.drawString("60",35,140);
        g.drawString("80",35,120);
        g.drawString("100",30,100);
        g.drawString("120",30,80);
        g.drawString("140",30,60);
        g.drawString("Valerie", 85, 220);
        g.drawString("Jeroen", 165, 220);
        g.drawString("Hans", 245, 220);
//stafen
        g.setColor(Color.red);
        g.fillRect(80, 200-Valerie,50,Valerie);
        g.setColor(Color.blue);
        g.fillRect(160,200-Jeroen,50,Jeroen);
        g.setColor(Color.green);
        g.fillRect(240,200-Hans,50,Hans);

    }

    class KnopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Valerie = Integer.parseInt(tekstvak.getText());
            Jeroen = Integer.parseInt(tekstvak2.getText());
            Hans = Integer.parseInt(tekstvak3.getText());
            repaint();
        }
    }
}