package aufgaben.aufgaben_wiederholungen;

/**
 * versandkostenberechnung
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class versandkostenberechnung {
    public static void main(String[] args) {

        // Eingabe
        double gewicht = 20.0;

        if (gewicht > 0 && gewicht <= 20) {
            double preis = 0.0;
            if (gewicht <= 5) {
                preis = 7.00;
            }
            if (gewicht > 5 && gewicht < 10) {
                preis = 10.50;
            }
            if (gewicht > 10 && gewicht <= 20) {
                preis = 14.00;
            }
            System.out.printf(
                    "Das Paket hat ein Gewicht von %.1f Kg. Der Versand dafür beträgt: %.2f €",
                    gewicht, preis);
        } else {
            System.err.println("Das Paket kann nicht versand werden!");
        }
    }
}
