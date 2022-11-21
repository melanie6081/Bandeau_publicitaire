package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Scenario {

    private ArrayList<NombreRepetitionEffet> scenario = new ArrayList<>();


    public void ajouterEffet( NombreRepetitionEffet nbEffet) {
        scenario.add(nbEffet);
    }

    public void jouer(Bandeau b) {
        for (NombreRepetitionEffet nbEffet : scenario) {
            for (int i =0; i<nbEffet.getRepetition();i++){
                nbEffet.getEffet().executer(b);
            }
        }
    }
}


