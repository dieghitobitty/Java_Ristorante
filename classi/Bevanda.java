package classi;

public class Bevanda extends Piatto implements Scontabile, Ordine {

    int ml;

    public Bevanda(String nome, double prezzo, String descrizione, int ml, int tempoPreparazione) {

        super(nome, prezzo, descrizione, tempoPreparazione);
        this.ml = ml;

    }

    public int getMl() {

        return ml;

    }

    public void setMl(int nuoviMl) {

        this.ml = nuoviMl;

    }

}
