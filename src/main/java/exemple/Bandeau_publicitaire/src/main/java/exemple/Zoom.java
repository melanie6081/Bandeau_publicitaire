package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{
    private int fontSizeMax = 60;

    public void executer(Bandeau b){
        for(int i=b.getFont().getSize(); i<fontSizeMax; i+=5){
            b.setFont(new Font("Dialog", Font.BOLD, b.getFont().getSize()+5));
            b.sleep(50);
        }
        b.sleep(1000);
    }


}
