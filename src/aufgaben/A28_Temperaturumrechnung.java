package aufgaben;

import java.util.Scanner;

/**
 * A28_Temperaturumrechnung
 * <p>
 *
 * @author Maximilian Stolle
 * @version 27.08.2024
 */
public class A28_Temperaturumrechnung {

    // Eingabe -- Eingabe über die Konsole
    static double eingabe () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fahrenheit: ");
        return scanner.nextDouble();
    }

    // Verarbeitung -- Umrechnung von Fahrenheit in Celsius
    static double fahrenheitInCelsius(double fahrenheit) {
        return (((fahrenheit - 32.0) * 5.0) / 9.0);
    }

    // Ausgabe -- Ausgabe über die Konsole
    static void ausgabe(double fahrenheit, double celsius) {
        System.out.printf("sind gleich:  %,.0f Celsius.",celsius);
    }

    public static void main(String[] args) {

        double fahrenheit = eingabe();
        double celsius = fahrenheitInCelsius(fahrenheit);
        ausgabe(fahrenheit, celsius);
    }
}
