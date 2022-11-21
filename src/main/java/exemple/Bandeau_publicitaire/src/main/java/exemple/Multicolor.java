package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Multicolor extends Effet{

    public void executer(Bandeau b){
        b.setMessage("C'est la fête !!");
        b.setFont(new Font("Monospaced",Font.BOLD,30));
        b.setForeground(Color.YELLOW);
        b.sleep(250);
        b.setForeground(Color.ORANGE);
        b.sleep(250);
        b.setForeground(Color.RED);
        b.sleep(250);
        b.setForeground(Color.PINK);
        b.sleep(250);
        b.setForeground(Color.MAGENTA);
        b.sleep(250);
        b.setForeground(Color.BLUE);
        b.sleep(250);
        b.setForeground(Color.CYAN);
        b.sleep(250);
        b.setForeground(Color.GREEN);
        b.sleep(250);
        b.setForeground(Color.LIGHT_GRAY);
        b.sleep(250);
        b.setForeground(Color.DARK_GRAY);
        b.sleep(250);
        b.setForeground(Color.BLACK);
        b.sleep(1000);
    }
}
