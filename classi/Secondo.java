package classi;

public class Secondo extends Piatto {


    String  tipoCottura;

    public Secondo(String nome, double prezzo, String descrizione, String tipoCottura, int tempoPreparazione){

        super(nome,prezzo,descrizione,tempoPreparazione);

    }

    public String getTipoCottura(){

        return tipoCottura;

    }

    public void setTipoCottura(String nuovoTipoCottura ){

        this.tipoCottura=nuovoTipoCottura;

    }

    
        
}
