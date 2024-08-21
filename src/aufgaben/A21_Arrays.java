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

        // Aufgabe 1 Summe berechnen mit "for"

        int[] liste = {11, 22, 33, 44, 55, 66, 77, 88, 99, 0};
        int zaehler = 0;

        for (int i = 0; i < liste.length; i++) {
            zaehler += liste[i];
        }
        System.out.print(zaehler);

        System.out.println();
        System.out.println("====================");

        // Lösung 2 mit "for each"
        zaehler = 0;
        for (int i : liste) {
            zaehler += i;
        }
        System.out.println(zaehler);

        System.out.println();
        System.out.println("====================");

        // Aufgabe 2 Maximum und Minimum mit einer for schleife

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

        // Aufgabe 2 mit einer erweiterten for schleife

        int[] listeminus = {-11, 22, -33, -44, 55, -66, 77, -88, -99, 0};

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE ;
        for (int zahl : listeminus) {
            if (zahl > maxi) {
                maxi = zahl;
            }
            if (zahl < mini) {
                mini = zahl;
            }
        }
        System.out.println(maxi + " ist die größte Zahl");
        System.out.println(mini + " ist die kleinste Zahl");

        System.out.println();
        System.out.println("====================");

        // Aufgabe 3 Suche Lösung 1
        String suche = "montag";

        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};

        for (String finder : wochentage) {
            if (finder.equalsIgnoreCase(suche)) {
                System.out.println(finder);
            }
        }

        System.out.println();
        System.out.println("====================");

        // Aufgabe 3 Suche Lösung 2

        boolean gefunden = false;
        i = 0;
        String gesucht = "Montag";
        while( i < wochentage.length && !gefunden) {
            gefunden = wochentage[i].equalsIgnoreCase(gesucht);
            i++;
        }
        System.out.println(gefunden);
    }
}
