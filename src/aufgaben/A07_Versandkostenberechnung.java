package aufgaben;

/**
 * A07_Versandkostenberechnung
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.08.2024
 */
public class A07_Versandkostenberechnung {
    public static void main(String[] args) {

        // Eingabe
        double eingabe = 15.0; // kg
        double preis = 0.0;

        // Verarbeitung
        if (eingabe <= 20.0 && eingabe > 0.0) {
            preis = 14.00;
        }
        if (eingabe <= 10.0 && eingabe > 5.0) {
            preis = 10.50;
        }
        if (eingabe <= 5.0 && eingabe > 0.0) {
            preis = 7.00;
        }
        if (eingabe > 20.0 || eingabe <= 0.0) {
            System.out.printf(
                    "Pakete über %.1f kg können nicht versand werden.",
                    eingabe);
        } else {
            String ausgabe = String.format(
                    "Die Versandkosten für %.1f kg betragen: %.2f Euro",
                    eingabe, preis);

            // Ausgabe
            System.out.println(ausgabe);
        }
    }
}
