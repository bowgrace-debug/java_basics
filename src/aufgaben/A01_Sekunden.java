package aufgaben;

import java.util.Scanner;

/**
 * A00_Sekunden
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.08.2024
 */
public class A01_Sekunden {

    static double eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sekunden ");
        return scanner.nextDouble();
    }

    static double sekundenInMinuten(double sekunden) {
        return sekunden / 60;
    }

    static void ausgabe(double sekunden, double minuten) {
        System.out.printf(" %.0f Sekunden sind gleich %.1f Minuten", sekunden, minuten);
    }


    public static void main(String[] args) {

        // Eingabe
        double sekunde = 210;

        // Verarbeitung
        double minute = sekunde / 60;
        String ausgaben = String.format(
                " %.0f Sekunden sind gleich %.1f Minuten",
                sekunde, minute);

        // Ausgabe
        System.out.println(ausgaben);


        // Ausgabe Methode

        double sekunden = eingabe();
        double minuten = sekundenInMinuten(sekunden);

        ausgabe(sekunden, minuten);

    }
}