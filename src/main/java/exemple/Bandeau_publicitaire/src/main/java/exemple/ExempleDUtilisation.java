package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {

       // new ExempleDUtilisation().exemple();
        new ExempleDUtilisation().exemple1();
    }

    public void exemple1() {
        Bandeau bandeau = new Bandeau();
        Font font = bandeau.getFont();
        Color back = bandeau.getBackground();
        Color fore = bandeau.getForeground();

        bandeau.setMessage("Hello");
        Zoom z = new Zoom();
        NombreRepetitionEffet nbZoom = new NombreRepetitionEffet(1, z);
        Dezoom dZ = new Dezoom();
        NombreRepetitionEffet nbDezoom = new NombreRepetitionEffet(1, dZ);
        Rotate r = new Rotate();
        NombreRepetitionEffet nbRot = new NombreRepetitionEffet(2, r);
        Multicolor m = new Multicolor();
        NombreRepetitionEffet nbM = new NombreRepetitionEffet(1, m);
        Clignotant c = new Clignotant();
        NombreRepetitionEffet nbC = new NombreRepetitionEffet(250,c);

        Scenario scenar = new Scenario();
        scenar.ajouterEffet(nbZoom);
        scenar.ajouterEffet(nbDezoom);
        scenar.ajouterEffet(nbRot);
        scenar.ajouterEffet(nbM);
        scenar.ajouterEffet(nbC);


        scenar.jouer(bandeau);
        bandeau.close();
    }


    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne de 45°...");
        monBandeau.setRotation(Math.PI / 2.0f);
        monBandeau.sleep(1000);
        monBandeau.setRotation(0.0f);

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}
