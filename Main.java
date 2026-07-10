import java.util.Scanner;
import classi.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Piatto P = new Piatto();

        System.out.print("Inserisci il nome del piatto: ");
        P.setNome(scanner.nextLine());

        System.out.print("Inserisci il prezzo del piatto: ");
        P.setPrezzo(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Inserisci la descrizione del piatto: ");
        P.setDescrizione(scanner.nextLine());

        System.out.println("Nome del piatto: " + P.getNome());
        System.out.println("Prezzo del piatto: " + P.getPrezzo() + "$");
        System.out.println("Descrizione del piatto: " + P.getDescrizione());

        scanner.close();
    }
}
