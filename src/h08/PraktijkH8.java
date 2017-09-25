package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PraktijkH8 extends Applet {
    TextField input1;
    TextField input2;
    Button Keerknop;
    Button Deelknop;
    Button Plusknop;
    Button Minknop;

    double cijfer1;
    double cijfer2;

    public void init() {
        super.init();

        input1 = new TextField("", 20);
        add(input1);

        input2 = new TextField("", 20);
        add(input2);

        Keerknop = new Button("x");
        KeerknopListener keerknopListener = new KeerknopListener();
        Keerknop.addActionListener(keerknopListener);
        add(Keerknop);

        Deelknop = new Button("/");
        DeelknopListener deelknopListener = new DeelknopListener();
        Deelknop.addActionListener(deelknopListener);
        add(Deelknop);

        Plusknop = new Button("+");
        PlusknopListener plusknopListener = new PlusknopListener();
        Plusknop.addActionListener(plusknopListener);
        add(Plusknop);

        Minknop = new Button("-");
        MinknopListener minknopListener = new MinknopListener();
        Minknop.addActionListener(minknopListener);
        add(Minknop);

    }

    class KeerknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String a1 = input1.getText();
            cijfer1 = Double.parseDouble(a1);

            String a2 = input2.getText();
            cijfer2 = Double.parseDouble(a2);

            Double uitkomstKeer = cijfer1 * cijfer2;
            input1.setText("" + uitkomstKeer);
            input2.setText("");
        }
    }

     class DeelknopListener implements ActionListener {

         public void actionPerformed(ActionEvent e) {
             String a1 = input1.getText();
             cijfer1 = Double.parseDouble(a1);

             String a2 = input2.getText();
             cijfer2 = Double.parseDouble(a2);

             Double uitkomstDeel = cijfer1 / cijfer2;
             input1.setText("" + uitkomstDeel);
             input2.setText("");
         }
     }

      class PlusknopListener implements  ActionListener {

          public void actionPerformed(ActionEvent e) {
              String a1 = input1.getText();
              cijfer1 = Double.parseDouble(a1);

              String a2 = input2.getText();
              cijfer2 = Double.parseDouble(a2);

              Double uitkomstPlus = cijfer1 / cijfer2;
              input1.setText("" + uitkomstPlus);
              input2.setText("");
          }


      }

       class MinknopListener implements ActionListener {

                    public void actionPerformed(ActionEvent e) {

                        String a1 = input1.getText();
               cijfer1 = Double.parseDouble(a1);

               String a2 = input2.getText();
               cijfer2 = Double.parseDouble(a2);

               Double uitkomstMin = cijfer1 / cijfer2;
               input1.setText("" + uitkomstMin);
               input2.setText("");
           }

       }






}

