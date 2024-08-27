package methoden;

/**
 * Methoden
 * <p>
 * Clean Code:
 * - Bezeichner (Identifier)
 * - lowerCamelCase
 *
 * @author Maximilian Stolle
 * @version 27.08.2024
 */
public class Methoden {

    // ohne Parameter und ohne Rückgabewert
    static void schreibWas() {
        System.out.println("etwas schreiben");
    }

    static void schreibZahl(int zahl) {
        System.out.println(zahl);
    }

    static void schreibPreis(double preis, String waehrung) {
        System.out.printf("%,.2f %s\n", preis, waehrung);
    }

    static void schreibArray(int[] array) { // array = werte
        for (int x : array) {
            System.out.printf("%2d", x);
        }
        System.out.println();
    }

    static int hoch2(int x) {
        int ergebnis = x * x;
        return ergebnis;
    }

    static int summeArray(int[] zahlen) {
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        return summe;
    }

    // Hauptprogramm, Entry point
    public static void main(String[] args) {
        schreibWas();
        schreibZahl(42);
        schreibZahl(789);

        double preis = 123456.789456;
        schreibPreis(preis, "€");
        schreibPreis(7.99, "$");
        schreibPreis(74.99, "DM");

        int[] werte = {1, 9, 4, 3, 6, 2, 5, 4, 6, 4};
        schreibArray(werte);

        int y = hoch2(12);
        System.out.println(y);

        int summe = summeArray(werte);
        System.out.println(summe);
    }
}
