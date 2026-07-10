package classi;

public class Pizza extends Piatto {


    int  diametro;

    public Pizza(String nome, double prezzo, String descrizione, int diametro, int tempoPreparazione){

        super(nome,prezzo,descrizione,tempoPreparazione);

    }

    public int getDiametro(){

        return diametro;

    }

    public void setDiametro(int nuovoDiametro){

        this.diametro=nuovoDiametro;

    }

    
        
}
