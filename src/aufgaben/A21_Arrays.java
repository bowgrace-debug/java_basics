package aufgaben;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

/**
 * A21_Arrays
 * <p>
 *
 * @author Maximilian Stolle
 * @version 20.08.2024
 */
public class A21_Arrays {
    public static void main(String[] args) {

        // Aufgabe 1

        int[] liste = {11, 22, 33, 44, 55, 66, 77, 88, 99, 0};
        int zaehler = 0;

        for (int i = 0; i < liste.length; i++) {
            zaehler += liste[i];
        }
        System.out.print(zaehler);

        System.out.println();
        System.out.println("====================");

        zaehler = 0;
        for (int i : liste) {
            zaehler += i;
        }
        System.out.println(zaehler);

        System.out.println();
        System.out.println("====================");

        // Aufgabe 2

        int min = liste[0];
        int max = 0;
        int i = 0;

        for (i = 0; i < liste.length; i++) {
            if (liste[i] <= min) {
                min = liste[i];
            }
            if (liste[i] >= max) {
                max = liste[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

        System.out.println();
        System.out.println("====================");

        // Aufgabe 3
        String suche = "Sonntag";

        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};

        for (String finder : wochentage) {
            if (finder == suche) {
                System.out.println(finder);
            }
        }
    }
}
