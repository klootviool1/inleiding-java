package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_2 extends Applet {
    TextField tekstvak;
    Button knop;
    int invoer = 0;
    String s;



    public void init() {
        this.setSize(350, 300);
        tekstvak = new TextField("", 10);
        knop = new Button("Toon de tijden");
        knop.addActionListener(new knopListener());


        add(tekstvak);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        int teller = 1;
        int y = 50;
        int LO = 1;
        int ZA = 0;
        int To = 7;
        int NY = 6;

        if (invoer > 0 && invoer < 24) {
            while(teller <= 1) {

         if (NY < 0) {
             NY = NY + 24;

         if (LO < 0) {
             LO = LO + 24;

         if (To > 23) {
             To = To - 24;
         }
         }

         }

                g.drawString("Het is in Londen: " + (invoer-LO) + ":00"+ "uur", 70, 40);
                g.drawString("Het is in Zuid-Afrika: " + (invoer-ZA) + ":00"+ "uur", 70, 60);
                g.drawString("Het is in Tokyo:" + (invoer+To) + ":00" + "uur", 70, 80);
                g.drawString("Het is in New York: " + (invoer-NY) + ":00" + "uur", 70, 100);

                y += 20;
                teller++;
            }
        }
        tekstvak.setText("");
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            invoer = Integer.parseInt(tekstvak.getText());
            repaint();

        }
    }

}
