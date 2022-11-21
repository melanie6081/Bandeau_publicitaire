package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Rotate extends Effet{
    private double rotation = Math.PI/2.0f;

    public void executer(Bandeau b) {
        b.setMessage("Je vais vous faire tourner la tête !!!");
        b.setFont(new Font("SansSerif",Font.PLAIN,20));
        for (int i =0; i<4; i++) {
            b.setRotation(b.getRotation() + rotation);
            b.sleep(250);
        }
        b.sleep(1000);
    }
}
