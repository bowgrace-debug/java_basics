package Arrays;

/**
 * ArraysFelder
 * <p>
 *
 * @author Maximilian Stolle
 * @version 20.08.2024
 */
public class ArraysFelder {
    public static void main(String[] args) {
        // (Objekt) referenzvariable
        int [] feld;

        // neues Array-Objekt / Instanz erzeigen (instanziieren )
        feld = new int[5]; // Länge = 5, Index 0..4

        // Deklaration und Initialisierung in der Zeile
//        int[] feld = new int[5];

        // Zugriff auf einzelne Einträge oder Elemente
        feld[2] = 5;
        feld[3] = 10* feld[2];
        if (feld[2] <= feld[3]) {

        }
        System.out.print(feld[2] + " "); // 5
        System.out.print(feld[0] + " "); // 0 = Default wert
        System.out.println();
        System.out.println("=================");

        // Lösung mit While
        int i = 0;
        while (i < feld.length) {
            System.out.print(feld[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("=================");

        // Lösung mit for
        for (i = 0; i < feld.length;i++) {
            System.out.print(feld[i] + " ");
        }
        System.out.println();
        System.out.println("=================");

        // Lösung mit do While
        i = 0;
        do {
            System.out.print(feld[i] + " ");
            i++;
        } while (i < feld.length);

        System.out.println();
        System.out.println("=================");

        // Beispiel Wochentage:
        String[] wochentage = new String[7];
        wochentage[0] = "Mo";
        wochentage[1] = "Di";
        wochentage[2] = "Mi";
        wochentage[3] = "Do";
        wochentage[4] = "Fr";
        wochentage[5] = "Sa";
        wochentage[6] = "So";

        // Initialising über "Array Literal" / "Array Konstante"
        String[] daysAsWeek = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        System.out.println(daysAsWeek[1]);

        System.out.println("=================");

        for (i = 0; i < daysAsWeek.length; i++) {
            System.out.print(daysAsWeek[i] + " ");
        }
        System.out.println();

        // leeres Array erzeugen
        int[] zahlen = {}; // Länge = 0

        int zahl = 17;
        zahlen = new int[zahl];

        // Array "löschen"
        zahlen = null;

    }
}