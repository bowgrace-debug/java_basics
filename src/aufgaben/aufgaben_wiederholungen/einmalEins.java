package aufgaben.aufgaben_wiederholungen;

/**
 * einmalEins
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class einmalEins {
    public static void main(String[] args) {


        // Einmalfünf
        int zahl = 5;
        for (int i = 1; i <= 10; i++) {
            int ergebnis = i * zahl;
            System.out.printf("%d x %d = %d\n", i, zahl, ergebnis);
        }

        System.out.println();

        // Das komplette Einmaleins
        int i = 1;
        while (i <= 10) {
            zahl = 1;
            while (zahl <= 10) {
                int ergebnis = i * zahl;
                System.out.println(zahl + " x " + i + " = " + ergebnis);
                zahl++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // Matrix
        i = 0;
        while (i <= 10) {
            zahl = 0;
            while (zahl <= 10) {
                int ergebnis = i * zahl;
                System.out.printf("%4d",ergebnis);
                zahl++;
            }
            i++;
        }
    }
}
