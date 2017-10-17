package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_2 extends Applet {

    Label label;
    TextField textField;
    Button button;

    int tokyo;
    int sydney;
    int newYork;
    int londen;

    public void init() {
        label = new Label("Voer een uur in");
        textField = new TextField(10);
        button = new Button("Toon Tijden");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String invoer = textField.getText();
                int input = Integer.parseInt(invoer);

                tokyo = input + 7;

                if (tokyo > 23)
                    tokyo = tokyo - 24;

                sydney = input + 9;

                if (sydney > 23)
                    sydney = sydney - 24;

                newYork = input - 6;

                if (newYork < 0)
                    newYork = newYork + 24;

                londen = input - 1;

                if (londen < 0)
                    londen = londen + 24;


                repaint();
            }
        });

        add(label);
        add(textField);
        add(button);
    }

    @Override
    public void paint(Graphics g) {

        setBackground(Color.black);


        int x = 50;
        int y = 50;
        g.setColor(Color.WHITE);
        g.drawString("Het is in Tokyo: " + tokyo + ":00", x, y);
        y += 20;
        g.drawString("Het is in Sydney: " + sydney + ":00", x, y);
        y += 20;
        g.drawString("Het is in New York: " + newYork + ":00", x, y);
        y += 20;
        g.drawString("Het is in Londen: " + londen + ":00", x, y);

    }
}