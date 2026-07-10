package classi;

public class Dolce extends Piatto {


    int  calorie;

    public Dolce(String nome, double prezzo, String descrizione, int calorie, int tempoPreparazione){

        super(nome,prezzo,descrizione,tempoPreparazione);

    }

    public int getCalorie(){

        return calorie;

    }

    public void setCalorie(int nuoveCalorie){

        this.calorie=nuoveCalorie;

    }

    
        
}
