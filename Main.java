import java.util.Scanner;
import classi.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ordine ordine = new Ordine();

        Pizza margherita = new Pizza("Margherita", 8.50, "Pomodoro, mozzarella e basilico", 32, 12);
        Pizza diavola =  new Pizza("Diavola", 9.50, "Pomodoro, mozzarella e salame piccante", 33, 15);
        Pizza quattroFormaggi = new Pizza("Quattro Formaggi", 10.50, "Mozzarella, gorgonzola, fontina e parmigiano", 32, 14);
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
        Dolce gelato = new Dolce("Gelato", 4.50, "Gelato artigianale", 300, 2);

        int scelta;

        do {

            System.out.println("\n===== MENU RISTORANTE =====");
            System.out.println("1 - Pizze");
            System.out.println("2 - Primi");
            System.out.println("3 - Secondi");
            System.out.println("4 - Dolci");
            System.out.println("0 - Concludi ordine");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();

            switch (scelta) {

                case 1:

                    System.out.println("\n--- PIZZE ---");
                    System.out.println("1 - " + margherita.getNome() + " | " + margherita.getPrezzo() + "€ | "
                            + margherita.tempoPreparazione() + " min");
                    System.out.println("2 - " + diavola.getNome() + " | " + diavola.getPrezzo() + "€ | "
                            + diavola.tempoPreparazione() + " min");
                    System.out.println("3 - " + quattroFormaggi.getNome() + " | " + quattroFormaggi.getPrezzo() + "€ | "
                            + quattroFormaggi.tempoPreparazione() + " min");
                    System.out.println("4 - " + capricciosa.getNome() + " | " + capricciosa.getPrezzo() + "€ | "
                            + capricciosa.tempoPreparazione() + " min");

                    System.out.print("Scegli una pizza: ");
                    int pizza = scanner.nextInt();

                    switch (pizza) {
                        case 1 -> ordine.aggiungiPiatto(margherita);
                        case 2 -> ordine.aggiungiPiatto(diavola);
                        case 3 -> ordine.aggiungiPiatto(quattroFormaggi);
                        case 4 -> ordine.aggiungiPiatto(capricciosa);
                    }

                    break;

                case 2:

                    System.out.println("\n--- PRIMI ---");
                    System.out.println("1 - " + carbonara.getNome() + " | " + carbonara.getPrezzo() + "€ | "
                            + carbonara.tempoPreparazione() + " min");
                    System.out.println("2 - " + lasagne.getNome() + " | " + lasagne.getPrezzo() + "€ | "
                            + lasagne.tempoPreparazione() + " min");
                    System.out.println("3 - " + amatriciana.getNome() + " | " + amatriciana.getPrezzo() + "€ | "
                            + amatriciana.tempoPreparazione() + " min");
                    System.out.println("4 - " + pesto.getNome() + " | " + pesto.getPrezzo() + "€ | "
                            + pesto.tempoPreparazione() + " min");

                    System.out.print("Scegli un primo: ");
                    int primo = scanner.nextInt();

                    switch (primo) {
                        case 1 -> ordine.aggiungiPiatto(carbonara);
                        case 2 -> ordine.aggiungiPiatto(lasagne);
                        case 3 -> ordine.aggiungiPiatto(amatriciana);
                        case 4 -> ordine.aggiungiPiatto(pesto);
                    }

                    break;

                case 3:

                    System.out.println("\n--- SECONDI ---");
                    System.out.println("1 - " + tagliata.getNome() + " | " + tagliata.getPrezzo() + "€");
                    System.out.println("2 - " + cotoletta.getNome() + " | " + cotoletta.getPrezzo() + "€");
                    System.out.println("3 - " + hamburger.getNome() + " | " + hamburger.getPrezzo() + "€");
                    System.out.println("4 - " + pollo.getNome() + " | " + pollo.getPrezzo() + "€");

                    System.out.print("Scegli un secondo: ");
                    int secondo = scanner.nextInt();

                    switch (secondo) {
                        case 1 -> ordine.aggiungiPiatto(tagliata);
                        case 2 -> ordine.aggiungiPiatto(cotoletta);
                        case 3 -> ordine.aggiungiPiatto(hamburger);
                        case 4 -> ordine.aggiungiPiatto(pollo);
                    }

                    break;

                case 4:

                    System.out.println("\n--- DOLCI ---");
                    System.out.println("1 - " + tiramisu.getNome() + " | " + tiramisu.getPrezzo() + "€ | "
                            + tiramisu.tempoPreparazione() + " min");
                    System.out.println("2 - " + cheesecake.getNome() + " | " + cheesecake.getPrezzo() + "€ | "
                            + cheesecake.tempoPreparazione() + " min");
                    System.out.println("3 - " + profiteroles.getNome() + " | " + profiteroles.getPrezzo() + "€ | "
                            + profiteroles.tempoPreparazione() + " min");
                    System.out.println("4 - " + gelato.getNome() + " | " + gelato.getPrezzo() + "€ | "
                            + gelato.tempoPreparazione() + " min");

                    System.out.print("Scegli un dolce: ");
                    int dolce = scanner.nextInt();

                    switch (dolce) {
                        case 1 -> ordine.aggiungiPiatto(tiramisu);
                        case 2 -> ordine.aggiungiPiatto(cheesecake);
                        case 3 -> ordine.aggiungiPiatto(profiteroles);
                        case 4 -> ordine.aggiungiPiatto(gelato);
                    }

                    break;

                case 0:
                    System.out.println("\nOrdine completato.");
                    break;

                default:
                    System.out.println("Scelta non valida.");

            }

        } while (scelta != 0);

        System.out.println("\n===== SCONTRINO =====");

        ordine.mostraOrdine();

        System.out.println("----------------------");
        System.out.println("Totale ordine: " + ordine.calcolaTotale() + "€");

        scanner.close();
    }
}