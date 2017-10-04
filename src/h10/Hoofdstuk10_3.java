package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Hoofdstuk10_3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een nummer in, van 1 t/m 12");
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
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari en deze maand heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Februari en deze maand heeft 28 dagen, tenzij dit een schrikkeljaar is.";
                    break;
                case 3:
                    tekst = "Maart en deze maand heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April en deze maand heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei en deze maand heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni en deze maand heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli en deze maand heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus en deze maand heeft 31 dagen";
                case 9:
                    tekst = "September en deze maand heeft 30 dagen";
                case 10:
                    tekst = "Oktober en deze maand heeft 31 dagen";
                case 11:
                    tekst = "November en deze maand heeft 30 dagen";
                case 12:
                    tekst = "December en deze maand heeft 31 dagen";
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt!!!";
                    break;
            }
            repaint();
        }
    }
}