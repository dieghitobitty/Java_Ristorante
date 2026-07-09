package classi;

public class Piatto {

    protected String nome;
    protected int prezzo = 0;

    public Piatto() {

       

    }

    public String getNome() {

        return nome;

    }

    public int getPrezzo() {

        return prezzo;

    }

    public void setNome(String nuovoNome) {

        this.nome = nuovoNome;

    }

    public void setPrezzo(int nuovoPrezzo) {

        this.prezzo = nuovoPrezzo;

    }

}