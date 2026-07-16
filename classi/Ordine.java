package classi;

import java.util.ArrayList;

public class Ordine {

    private ArrayList<Piatto> piatti;

    public Ordine() {
        piatti = new ArrayList<>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }

    public void mostraOrdine() {

        for (Piatto piatto : piatti) {

            System.out.println(
                        piatto.getNome() +
                                " | " + piatto.getPrezzo() + " euro" +
                                " | " + piatto.getTempoPreparazione() + " min");

            /*if (p instanceof Pizza) {

                Pizza pizza = (Pizza) p;

                System.out.println(
                        pizza.getNome() +
                                " | " + pizza.getPrezzo() + " euro" +
                                " | " + pizza.getDiametro() + " cm" +
                                " | " + pizza.getTempoPreparazione() + " min");

            } else if (p instanceof Primo) {

                Primo primo = (Primo) p;

                System.out.println(
                        primo.getNome() +
                                " | " + primo.getPrezzo() + " euro" +
                                " | " + primo.getGrammi() + " g" +
                                " | " + primo.getTempoPreparazione() + " min");

            } else if (p instanceof Secondo) {

                Secondo secondo = (Secondo) p;

                System.out.println(
                        secondo.getNome() +
                                " | " + secondo.getPrezzo() + " euro" +
                                " | " + secondo.getTipoCottura() +
                                " | " + secondo.getTempoPreparazione() + " min");

            } else if (p instanceof Dolce) {

                Dolce dolce = (Dolce) p;

                System.out.println(
                        dolce.getNome() +
                                " | " + dolce.getPrezzo() + " euro" +
                                " | " + dolce.getCalorie() + " kcal" +
                                " | " + dolce.getTempoPreparazione() + " min");
            }*/
        }
    }

    public double calcolaTotale() {

        double totale = 0;

        for (Piatto p : piatti) {
            totale += p.getPrezzo();
        }

        return totale;
    }

}
