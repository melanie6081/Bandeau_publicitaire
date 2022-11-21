package exemple;
import bandeau.Bandeau;

public class NombreRepetitionEffet {
    private int repetition;
    private  Effet effet;

    public NombreRepetitionEffet(int repetition, Effet effet) {
        this.repetition = repetition;
        this.effet = effet;
    }

    public int getRepetition() {
        return repetition;
    }

    public Effet getEffet() {

        return effet;
    }
}
