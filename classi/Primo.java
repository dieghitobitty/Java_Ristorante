package classi;

public class Primo extends Piatto {

    int grammi;

    public Primo(String nome, double prezzo, String descrizione, int grammi, int tempoPreparazione) {

        super(nome, prezzo, descrizione, tempoPreparazione);
        this.grammi = grammi;

    }

    public int getGrammi() {

        return grammi;

    }

    public void setGrammi(int nuoviGrammi) {

        this.grammi = nuoviGrammi;

    }

}
