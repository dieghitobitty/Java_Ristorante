package classi;

public class Piatto {

    protected String nome;
    protected int prezzo = 0;
    protected String descrizione;

    public Piatto() {

       

    }

    public String getNome() {

        return nome;

    }

    public int getPrezzo() {

        return prezzo;

    }

    
    public String getDescrizione(){
        return descrizione;        
    }

    public void setNome(String nuovoNome) {

        this.nome = nuovoNome;

    }

    public void setPrezzo(int nuovoPrezzo) {

        this.prezzo = nuovoPrezzo;

    }

    public void setDescrizione(String nuovaDescrizione){
        this.descrizione = nuovaDescrizione;      
    }
}