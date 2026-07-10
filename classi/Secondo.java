package classi;

public class Secondo extends Piatto implements Asporto {

    String tipoCottura;

    public Secondo(String nome, double prezzo, String descrizione, String tipoCottura, int tempoPreparazione) {

        super(nome, prezzo, descrizione, tempoPreparazione);
        this.tipoCottura = tipoCottura;

    }

    @Override
    public double costoConfezione() {
        return 0.80;
    }

    public String getTipoCottura() {

        return tipoCottura;

    }

    public void setTipoCottura(String nuovoTipoCottura) {

        this.tipoCottura = nuovoTipoCottura;

    }

}
