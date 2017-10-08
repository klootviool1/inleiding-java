package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class Praktijk10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        setBackground(Color.orange);
        tekstvak = new TextField("", 20);
        label = new Label("Voer uw cijfer in van 1 t/m 10");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            switch(cijfer) {
                case 1:
                    tekst = "Dit is een slecht cijfer.";
                    break;
                case 2:
                    tekst = "Dit is een slecht cijfer.";
                    break;
                case 3:
                    tekst = "Dit is een slecht cijfer.";
                    break;
                case 4:
                    tekst = "Dit is een onvoldoende.";
                    break;
                case 5:
                    tekst = "Dit is een matig cijfer.";
                    break;
                case 6:
                    tekst = "Dit is een voldoende.";
                    break;
                case 7:
                    tekst = "Dit is een voldoende.";
                    break;
                case 8:
                    tekst = "Dit is een Goed.";
                    break;
                case 9:
                    tekst = "Dit is een Goed.";
                    break;
                case 10:
                    tekst = "Dit is een Goed.";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt!!!";
                    break;
            }
            repaint();
        }
    }

}


