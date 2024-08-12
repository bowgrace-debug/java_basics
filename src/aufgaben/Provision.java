package aufgaben;

/**
 * Provision
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.08.2024
 */
public class Provision {
    public static void main(String[] args) {

        // Eingabe
        double umsatz = 300000;

        // Verarbeitung
        if (umsatz > 0 && umsatz <= 600000) {
            double provision = 0.0;
            if (umsatz <= 300000) {
                provision = umsatz * 0.03;
            }
            else {
                if (umsatz < 350000) {
                    provision = umsatz * 0.06;
                }
                else if (umsatz >= 350000) {
                    provision = umsatz * 0.10;
                }
            }
            System.out.println("Die Provision beträgt: " + provision);
        }
    }
}
