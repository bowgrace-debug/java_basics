package aufgaben.aufgabenAlle.aufgaben0_45.aufgaben32_36.a32_Versandkostenberechnung;

/**
 * Paket
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Paket {
    double gewicht;

    double berechnePreis() {
        double preis = 7.0;
        if (gewicht > 5.0 && gewicht <= 10) {
            preis = 10.5;
        }
        else {
            if (gewicht > 10.0) {
                preis = 14.0;
            }
        }
        return preis;
    }
}
