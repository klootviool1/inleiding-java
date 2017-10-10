package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Praktijk11 extends Applet {
    Button knop;
    TextField tekstvak;
    int s;

    public void init() {
    tekstvak = new TextField("", 20);
    knop = new Button("OK");
    knop.addActionListener(new TekstvakListener());
    add(tekstvak);
    add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        int teller;
        int antwoord;
        int y = 20;

        for (teller = 1; teller < 11; teller++) {
            antwoord = s * teller ;
            y += 20;
            g.drawString(teller + " x " + s + "=" + antwoord, 110, y);
        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = (int)Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }

}
