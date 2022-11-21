package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Dezoom extends Effet{

    private int fontSizeMin = 20;
    public void executer(Bandeau b){
        for(int i=b.getFont().getSize(); i>fontSizeMin; i-=5){
            b.setFont(new Font("Dialog", Font.BOLD, b.getFont().getSize()-5));
            b.sleep(50);
        }
        b.sleep(1000);
    }
}
