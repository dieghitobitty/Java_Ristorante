package classi;

public class Pizza extends Piatto implements Asporto {

    int diametro;

    public Pizza(String nome, double prezzo, String descrizione, int diametro, int tempoPreparazione) {

        super(nome, prezzo, descrizione, tempoPreparazione);
        this.diametro = diametro;

    }

    @Override
    public double costoConfezione() {
        return 0.50;
    }

    public int getDiametro() {

        return diametro;

    }

    public void setDiametro(int nuovoDiametro) {

        this.diametro = nuovoDiametro;

    }

}
