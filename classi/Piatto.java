package classi;

public class Piatto {

    protected String nome;
    protected double prezzo = 0;
    protected String descrizione;
    protected int tempoPreparazione;

    public Piatto(String nome, double prezzo, String descrizione, int tempoPreparazione) {

        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.tempoPreparazione = tempoPreparazione;

    }

    public String getNome() {

        return nome;

    }

    public double getPrezzo() {

        return prezzo;

    }

    public String getDescrizione() {

        return descrizione;
    }

    public int getTempoPreparazione() {

        return tempoPreparazione;
    }

    public void setNome(String nuovoNome) {

        this.nome = nuovoNome;

    }

    public void setPrezzo(double nuovoPrezzo) {

        this.prezzo = nuovoPrezzo;

    }

    public void setDescrizione(String nuovaDescrizione) {

        this.descrizione = nuovaDescrizione;

    }

    public void setTempoPreparazione(int nuovoTempoPreparazione) {

        this.tempoPreparazione = nuovoTempoPreparazione;

    }

}