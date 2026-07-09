import java.util.Scanner;
import classi.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Piatto P = new Piatto();
        System.out.print("Inserisci il nome del piatto: ");
        String nuovoNome = scanner.nextLine();
        P.setNome(nuovoNome);
        String nome = P.getNome();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Inserisci il prezzo del piatto: ");
        int nuovoPrezzo = scanner1.nextInt();
        P.setPrezzo(nuovoPrezzo);
        int prezzo = P.getPrezzo();

        System.out.println("Nome del piatto: " + nome);
        System.out.println(" Ecco il prezzo del piatto: " + prezzo);

        scanner1.close();

    }
}
