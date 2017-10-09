package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11_9 extends Applet {
    int marge;
    int breedte;
    int hoogte;
    Color wit;
    Color zwart;
    Color achtergrond;


    public void init() {
        wit = Color.white;
        zwart = Color.BLACK;
        achtergrond = Color.gray;
        marge = 60;
        breedte = 40;
        hoogte = breedte;

        int breedteScherm = 2 * marge + 8 * breedte;
        int hoogteScherm = 2 * marge + 8 * hoogte;
        setSize(breedteScherm, hoogteScherm);
        setBackground(achtergrond);
    }

    public void paint(Graphics g) {
        int y = marge;
        for (int rij = 0; rij < 8; rij++) {
            int x = marge;
            for (int kolom = 0; kolom < 8; kolom++) {
                if ((rij + kolom) % 2 == 0) {
                    g.setColor(zwart);
                } else {
                    g.setColor(wit);
                }
                g.fillRect(x, y, breedte, hoogte);
                x += breedte;


            }


            y += hoogte;
        }


    }
}



