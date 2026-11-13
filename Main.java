import java.util.Scanner;
import classi.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ordine ordine = new Ordine();
        double costoAsporto = 0;

        Pizza margherita = new Pizza("Margherita", 8.50, "Pomodoro, mozzarella e basilico", 32, 12);
        Pizza diavola = new Pizza("Diavola", 9.50, "Pomodoro, mozzarella e salame piccante", 33, 15);
        Pizza quattroFormaggi = new Pizza("Quattro Formaggi", 10.50, "Mozzarella, gorgonzola, fontina e parmigiano", 32,
                14);
        Pizza capricciosa = new Pizza("Capricciosa", 11.00, "Pomodoro, mozzarella, prosciutto e funghi", 33, 16);

        Primo carbonara = new Primo("Carbonara", 10.00, "Pasta con uova, guanciale e pecorino", 250, 15);
        Primo lasagne = new Primo("Lasagne", 11.00, "Lasagne al ragù", 300, 20);
        Primo amatriciana = new Primo("Amatriciana", 9.50, "Pasta con pomodoro e guanciale", 250, 14);
        Primo pesto = new Primo("Pasta al Pesto", 8.50, "Pasta con pesto alla genovese", 220, 10);

        Secondo tagliata = new Secondo("Tagliata", 18.00, "Manzo di prima scelta", "Alla griglia", 25);
        Secondo cotoletta = new Secondo("Cotoletta", 14.00, "Cotoletta impanata", "Fritta", 18);
        Secondo hamburger = new Secondo("Hamburger", 13.00, "Hamburger di manzo", "Alla piastra", 15);
        Secondo pollo = new Secondo("Pollo Arrosto", 12.00, "Pollo speziato", "Al forno", 20);

        Dolce tiramisu = new Dolce("Tiramisu", 5.00, "Dolce al caffè e mascarpone", 450, 3);
        Dolce cheesecake = new Dolce("Cheesecake", 6.00, "Torta al formaggio", 500, 4);
        Dolce profiteroles = new Dolce("Profiteroles", 5.50, "Bignè con crema e cioccolato", 550, 5);
        Dolce gelato = new Dolce("Gelato artigianale", 4.50, "Gelato artigianale", 300, 2);

        Bevanda cocaCola = new Bevanda("Coca cola", 2.50, "Analcolica", 330, 1);
        Bevanda fanta = new Bevanda("Fanta", 2.50, "Analcolica", 330, 1);
        Bevanda birra = new Bevanda("Birra", 3.5, "Alcolica", 330, 2);
        Bevanda sprite = new Bevanda("Sprite", 2.50, "Analcolica", 330, 1);

        int asporto;

        do {
            System.out.print("Ordine da asporto? (1 = Si, 0 = No): ");
            asporto = scanner.nextInt();

            if (asporto != 0 && asporto != 1) {
                System.out.println("Errore: inserisci solo 0 oppure 1.");
            }
        } while (asporto != 0 && asporto != 1);

        boolean ordineDaAsporto = asporto == 1;
        int scelta;

        do {

            System.out.println("\n===== MENU RISTORANTE =====");
            System.out.println("1 - Pizze");
            System.out.println("2 - Primi");
            System.out.println("3 - Secondi");
            System.out.println("4 - Dolci");
            System.out.println("5 - Bevande");
            System.out.println("0 - Concludi ordine");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();

            switch (scelta) {

                case 1:

                    System.out.println("\n--- PIZZE ---");
                    System.out.println("1 - " + margherita.getNome() + " | " + margherita.getPrezzo() + " euro | "
                            + margherita.getDiametro() + " cm | " + margherita.getTempoPreparazione() + " min");
                    System.out.println("2 - " + diavola.getNome() + " | " + diavola.getPrezzo() + " euro | "
                            + diavola.getDiametro() + " cm | " + diavola.getTempoPreparazione() + " min");
                    System.out.println("3 - " + quattroFormaggi.getNome() + " | " + quattroFormaggi.getPrezzo()
                            + " euro | " + quattroFormaggi.getDiametro() + " cm | "
                            + quattroFormaggi.getTempoPreparazione() + " min");
                    System.out.println("4 - " + capricciosa.getNome() + " | " + capricciosa.getPrezzo() + " euro | "
                            + capricciosa.getDiametro() + " cm | " + capricciosa.getTempoPreparazione() + " min");

                    System.out.print("Scegli una pizza: ");
                    int pizza = scanner.nextInt();

                    Pizza pizzaScelta = null;

                    switch (pizza) {
                        case 1 -> pizzaScelta = margherita;
                        case 2 -> pizzaScelta = diavola;
                        case 3 -> pizzaScelta = quattroFormaggi;
                        case 4 -> pizzaScelta = capricciosa;
                    }

                    if (pizzaScelta != null) {
                        ordine.aggiungiPiatto(pizzaScelta);
                        if (ordineDaAsporto) {
                            costoAsporto += pizzaScelta.costoConfezione();
                        }
                    }

                    break;

                case 2:

                    System.out.println("\n--- PRIMI ---");
                    System.out.println("1 - " + carbonara.getNome() + " | " + carbonara.getPrezzo() + " euro | "
                            + carbonara.getGrammi() + " g | " + carbonara.getTempoPreparazione() + " min");
                    System.out.println("2 - " + lasagne.getNome() + " | " + lasagne.getPrezzo() + " euro | "
                            + lasagne.getGrammi() + " g | " + lasagne.getTempoPreparazione() + " min");
                    System.out.println("3 - " + amatriciana.getNome() + " | " + amatriciana.getPrezzo() + " euro | "
                            + amatriciana.getGrammi() + " g | " + amatriciana.getTempoPreparazione() + " min");
                    System.out.println("4 - " + pesto.getNome() + " | " + pesto.getPrezzo() + " euro | "
                            + pesto.getGrammi() + " g | " + pesto.getTempoPreparazione() + " min");

                    System.out.print("Scegli un primo: ");
                    int primo = scanner.nextInt();

                    switch (primo) {
                        case 1 -> ordine.aggiungiPiatto(carbonara);
                        case 2 -> ordine.aggiungiPiatto(lasagne);
                        case 3 -> ordine.aggiungiPiatto(amatriciana);
                        case 4 -> ordine.aggiungiPiatto(pesto);
                    }

                    System.out.println("I primi non possono essere ordinati da asporto.");

                    break;

                case 3:

                    System.out.println("\n--- SECONDI ---");
                    System.out.println("1 - " + tagliata.getNome() + " | " + tagliata.getPrezzo() + " euro | "
                            + tagliata.getTipoCottura() + " | " + tagliata.getTempoPreparazione() + " min");
                    System.out.println("2 - " + cotoletta.getNome() + " | " + cotoletta.getPrezzo() + " euro | "
                            + cotoletta.getTipoCottura() + " | " + cotoletta.getTempoPreparazione() + " min");
                    System.out.println("3 - " + hamburger.getNome() + " | " + hamburger.getPrezzo() + " euro | "
                            + hamburger.getTipoCottura() + " | " + hamburger.getTempoPreparazione() + " min");
                    System.out.println("4 - " + pollo.getNome() + " | " + pollo.getPrezzo() + " euro | "
                            + pollo.getTipoCottura() + " | " + pollo.getTempoPreparazione() + " min");

                    System.out.print("Scegli un secondo: ");
                    int secondo = scanner.nextInt();

                    Secondo secondoScelto = null;

                    switch (secondo) {
                        case 1 -> secondoScelto = tagliata;
                        case 2 -> secondoScelto = cotoletta;
                        case 3 -> secondoScelto = hamburger;
                        case 4 -> secondoScelto = pollo;
                    }

                    if (secondoScelto != null) {
                        ordine.aggiungiPiatto(secondoScelto);
                        if (ordineDaAsporto) {
                            costoAsporto += secondoScelto.costoConfezione();
                        }
                    }

                    break;

                case 4:

                    System.out.println("\n--- DOLCI ---");
                    System.out.println("1 - " + tiramisu.getNome() + " | " + tiramisu.getPrezzo() + " euro | "
                            + tiramisu.getCalorie() + " kcal | " + tiramisu.getTempoPreparazione() + " min");
                    System.out.println("2 - " + cheesecake.getNome() + " | " + cheesecake.getPrezzo() + " euro | "
                            + cheesecake.getCalorie() + " kcal | " + cheesecake.getTempoPreparazione() + " min");
                    System.out.println("3 - " + profiteroles.getNome() + " | " + profiteroles.getPrezzo() + " euro | "
                            + profiteroles.getCalorie() + " kcal | " + profiteroles.getTempoPreparazione() + " min");
                    System.out.println("4 - " + gelato.getNome() + " | " + gelato.getPrezzo() + " euro | "
                            + gelato.getCalorie() + " kcal | " + gelato.getTempoPreparazione() + " min");

                    System.out.print("Scegli un dolce: ");
                    int dolce = scanner.nextInt();

                    Dolce dolceScelto = null;

                    switch (dolce) {
                        case 1 -> dolceScelto = tiramisu;
                        case 2 -> dolceScelto = cheesecake;
                        case 3 -> dolceScelto = profiteroles;
                        case 4 -> dolceScelto = gelato;
                    }

                    if (dolceScelto != null) {
                        ordine.aggiungiPiatto(dolceScelto);
                        if (ordineDaAsporto) {
                            costoAsporto += dolceScelto.costoConfezione();
                        }
                    }

                    break;

                case 5:

                    System.out.println("\n--- BEVANDE ---");

                    System.out.println("1 - " + cocaCola.getNome() + " | " + cocaCola.getPrezzo() + " euro | "
                            + cocaCola.getMl() + " ml | " + cocaCola.getTempoPreparazione() + " min");

                    System.out.println("2 - " + fanta.getNome() + " | " + fanta.getPrezzo() + " euro | "
                            + fanta.getMl() + " ml | " + fanta.getTempoPreparazione() + " min");

                    System.out.println("3 - " + birra.getNome() + " | " + birra.getPrezzo() + " euro | "
                            + birra.getMl() + " ml | " + birra.getTempoPreparazione() + " min");

                    System.out.println("4 - " + sprite.getNome() + " | " + sprite.getPrezzo() + " euro | "
                            + sprite.getMl() + " ml | " + sprite.getTempoPreparazione() + " min");

                    System.out.print("Scegli una bevanda: ");
                    int bevanda = scanner.nextInt();

                    Bevanda bevandaScelta = null;

                    switch (bevanda) {
                        case 1 -> bevandaScelta = cocaCola;
                        case 2 -> bevandaScelta = fanta;
                        case 3 -> bevandaScelta = birra;
                        case 4 -> bevandaScelta = sprite;
                        default -> System.out.println("Scelta non valida.");
                    }

                    if (bevandaScelta != null) {

                        ordine.aggiungiPiatto(bevandaScelta);
                        if (ordineDaAsporto) {
                            costoAsporto += bevandaScelta.costoConfezione();
                        }

                    }

                    break;

                case 0:
                    System.out.println("\nOrdine completato.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        if (ordine.isVuoto()) {
            System.out.println("Errore: non hai aggiunto nessun piatto all'ordine.");
        } else {
            System.out.println("\n===== SCONTRINO =====");

            ordine.mostraOrdine();

            System.out.println("----------------------");
            System.out.println("Totale piatti: " + ordine.calcolaTotale() + " euro");
            System.out.println("Costo confezioni: " + costoAsporto + " euro");
            System.out.println("Totale finale: " + (ordine.calcolaTotale() + costoAsporto) + " euro");
        }

        scanner.close();
    }
}