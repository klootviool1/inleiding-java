package h08;

import javax.swing.text.TextAction;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk8 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );
        label = new Label("Typ iets in, in dit tekstvak" + "en druk dan op ENTER");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        add(knop);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50,50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }

        class KnopListener implements ActionListener       {
            public void actionPeformed( ActionEvent e) {
                tekstvak.setText("jammer, er staat iets anders");
                repaint();
            }
        }
    }
        }





