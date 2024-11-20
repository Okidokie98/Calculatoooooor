import java.util.Scanner;

public class SimpeleRekenmachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Code Smell 1: Magic Number
        System.out.println("Welkom bij de rekenmachine!");
        System.out.println("Kies een bewerking:");
        System.out.println("1. Optellen");
        System.out.println("2. Aftrekken");
        System.out.println("3. Vermenigvuldigen");
        System.out.println("4. Delen");
        int keuze = scanner.nextInt();

        // Code Smell 2: Grote methode
        if (keuze == 1) {
            System.out.println("Voer het eerste getal in:");
            double a = scanner.nextDouble();
            System.out.println("Voer het tweede getal in:");
            double b = scanner.nextDouble();
            System.out.println("Resultaat: " + (a + b));
        } else if (keuze == 2) {
            System.out.println("Voer het eerste getal in:");
            double a = scanner.nextDouble();
            System.out.println("Voer het tweede getal in:");
            double b = scanner.nextDouble();
            System.out.println("Resultaat: " + (a - b));
        } else if (keuze == 3) {
            System.out.println("Voer het eerste getal in:");
            double a = scanner.nextDouble();
            System.out.println("Voer het tweede getal in:");
            double b = scanner.nextDouble();
            System.out.println("Resultaat: " + (a * b));
        } else if (keuze == 4) {
            System.out.println("Voer het eerste getal in:");
            double a = scanner.nextDouble();
            System.out.println("Voer het tweede getal in:");
            double b = scanner.nextDouble();
            if (b != 0) {
                System.out.println("Resultaat: " + (a / b));
            } else {
                System.out.println("Delen door nul is niet toegestaan!");
            }
        } else {
            System.out.println("Ongeldige keuze!");
        }

        scanner.close();
    }
}
