package h12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {

        private Button[] knop = new Button[25];

        @Override
        public void init() {

            for (int i = 0; i <knop.length ; i++) {
                knop[i] = new Button("Knop");
                add(knop[i]);
            }
        }
    }

