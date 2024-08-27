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

    static double eingabe () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fahrenheit: ");
        return scanner.nextDouble();
    }
    static double fahrenheitInCelsius(double fahrenheit) {
        return (((fahrenheit - 32) * 5) / 9);
    }
    static void ausgabe(double fahrenheit, double celsius) {
        System.out.printf("sind gleich:  %,.0f Celsius.",celsius);
    }

    public static void main(String[] args) {

        double fahrenheit = eingabe();
        double celsius = fahrenheitInCelsius(fahrenheit);
        ausgabe(fahrenheit, celsius);
    }
}
