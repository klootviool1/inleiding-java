package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10_2 extends Applet {

    int cijfer;
    int cijfer2;
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstVakListener());
        tekst = "";
        tekstvak2 = new TextField("", 5);
        tekstvak2.addActionListener(new TekstVakListener());
        label = new Label("Kies twee getallen naar eigen keus");
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);

    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            String l;
            s = tekstvak.getText();
            l = tekstvak2.getText();
            cijfer = Integer.parseInt(s);
            cijfer2 = Integer.parseInt(l);
            if (cijfer > cijfer2) {
                tekst = "Grootste getal= " + cijfer;
            }
            if (cijfer2 > cijfer) {
                tekst = "Grootste getal= " + cijfer2;
            }
            if (cijfer < cijfer2) {
                tekst = "Kleinste getal= " + cijfer;
            }
            if (cijfer2 < cijfer) {
                tekst = "Kleinste getal= " + cijfer2;
            }
            repaint();

        }
    }
}
