package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet{

    public void executer(Bandeau b){
        b.setMessage("Attention prochaine scène déconseillée aux personnes photo-sensible...");
        b.setBackground(Color.black);
        b.setForeground((Color.white));
        b.sleep(50);
        b.setBackground(Color.white);
        b.setForeground((Color.black));
        b.sleep(50);

    }
}
