package aufgaben.aufgaben_wiederholungen;

/**
 * provision
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class provision {
    public static void main(String[] args) {

        // Eingabe
        double umsatz = 100000;

        // Verarbeitung
        if (umsatz > 0) {
            double provison = 0;
            double provisionprozent = 0;

            if (umsatz >= 300000) {
                provison = ((umsatz / 100) * 3);
                provisionprozent = 3;
            }
            if (umsatz >= 350000) {
                provison = (umsatz / 100) * 6;
                provisionprozent = 6;
            }
            if (umsatz > 350000) {
                provison = (umsatz / 100) * 10;
                provisionprozent = 10;
            }
            // Ausgabe, wenn ein Umsatz vorhanden ist
            System.out.printf(
                    "Bei einem Umsatz von %,.2f €,\nliegt die Provision bei %.0f Prozent.\n" +
                    "Das ergibt einen Auszahlungsbetrag\nvon: %,.2f €",
                    umsatz, provisionprozent, provison);
        } else {
            // Ausgabe, wenn kein Umsatz vorhanden ist.
            System.err.println("Es liegt keine Provision vor!");
        }
    }
}
