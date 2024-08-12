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
        double eingabe = 4.0; // kg

        // Verarbeitung
        if (eingabe > 0 && eingabe <= 20) {
            double preis = 0.0;
            if (eingabe <= 5) {
                preis = 7.0;
            } else {
                if (eingabe <= 10) {
                    preis = 10.5;
                } else {
                    preis = 14.0;
                }
            }
            String ausgabe = String.format(
                    "Die Versandgebühr für Pakete mit %.1f Kg werden für %.2f Euro berechnet",
                    eingabe, preis);
            System.out.println(ausgabe);
        } else {
            System.err.printf(
                    "Pakete über %.1f Kg können nicht versand werden!",
                    eingabe);
        }
    }
}

