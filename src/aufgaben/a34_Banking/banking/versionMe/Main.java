package aufgaben.a34_Banking.banking.versionMe;

import java.util.Scanner;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Main {

    /*static String eingabe () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie etwas einzahlen? (y / n) ".toLowerCase());
        if (.charAt('y')) {

        }
        return scanner.next();
    }*/

    public static void main(String[] args) {

        // Instanziierung (Objekt erzeugen über new)
        Scanner scanner = new Scanner(System.in);
        Banking banking = new Banking();

        // Objektreferent variable
        banking.setVorname("Maximilian ");
        banking.setNachname("Stolle");
        banking.setiBAN("DE51 2905 0101 0081 9946 75");
        banking.setKontostand(1149.74);
        final int PIN = 0000;


        System.out.println("Bitte geben Sie Ihre Geheimzahl ein:\n");
        int pin = scanner.nextInt();
        scanner.nextLine();
        if (pin == PIN) {
            System.out.printf("Der Kontostand beträgt: %,.2f €\n", banking.getKontostand());
            System.out.println("Möchten Sie Geld einzahlen? (y / n)\n");
            String antwort = scanner.nextLine();
            if (antwort.equalsIgnoreCase("y")) {
                System.out.println("Welche Summe möchten Sie einzahlen?:\n");
                double einzahlung = scanner.nextDouble();
                banking.setEinzahlung(einzahlung);
                System.out.printf("Sie haben %,.2f € eingezahlt.\nIhr Kontostand beträgt nun: %,.2f €\n", einzahlung, banking.getKontostand());
            }
            else {
                System.out.println("Möchten Sie Geld auszahlen? (y / n)\n");
                antwort = scanner.nextLine();

                if (antwort.equalsIgnoreCase("y")) {
                    System.out.println("Welche Summe möchten Sie auszahlen?\n");
                    double auszahlung = scanner.nextDouble();
                    scanner.nextLine();
                    banking.setAuszahlung(auszahlung);
                    System.out.printf("Sie haben %,.2f € ausgezahlt.\nIhr Kontostand beträgt nun: %,.2f €\n", auszahlung, banking.getKontostand());
                }
                else {
                    System.out.println("Derzeit sind keine Verfügungen von Ihrem Konto Möglich!\nBitte wenden Sie sich an Ihren Bankberater.");
                }
            }
        }
        else {
            System.out.println("Der PIN ist ungültig!\nBitte versuchen Sie es erneut.");
        }
    }
}
