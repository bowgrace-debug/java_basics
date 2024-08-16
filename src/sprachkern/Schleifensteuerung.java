package sprachkern;

/**
 * Schleifensteuerung
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.08.2024
 */
public class Schleifensteuerung {
    public static void main(String[] args) {

        /*
            Beispiel: Jeden Zweiten ausgeben
        */

        // mit continue

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; // abbrechen der aktuellen Durchlaufs
            }
            if (i > 15) { // abbrechen der gesamten Schleife
                break;
            }
            System.out.println(i);
        }

        System.out.println("========================");

        // ohne continue

        for (int i = 1; i <= 15; i += 2) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
