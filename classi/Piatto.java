package classi;

public abstract class Piatto {

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

}