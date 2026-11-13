package classi;

public class Dolce extends Piatto implements Asporto {

    int calorie;

    public Dolce(String nome, double prezzo, String descrizione, int calorie, int tempoPreparazione) {

        super(nome, prezzo, descrizione, tempoPreparazione);
        this.calorie = calorie;

    }

    @Override
    public double costoConfezione() {
        return 0.30;
    }

    public int getCalorie() {

        return calorie;

    }

    public void setCalorie(int nuoveCalorie) {

        this.calorie = nuoveCalorie;

    }

}
