package classi;

public class Bevanda extends Piatto implements Asporto {

    int ml;

    public Bevanda(String nome, double prezzo, String descrizione, int ml, int tempoPreparazione) {

        super(nome, prezzo, descrizione, tempoPreparazione);
        this.ml = ml;

    }

    @Override
    public double costoConfezione() {
        return 0.50;
    }

    public int getMl() {

        return ml;

    }

    public void setMl(int nuoviMl) {

        this.ml = nuoviMl;

    }

}
