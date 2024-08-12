package aufgaben;

/**
 * A08_Provisionsabrechnungen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.08.2024
 */
public class A08_Provisionsberechnungen {
    public static void main(String[] args) {

        // Eingabe
        double umsatz = 2000000.0;

        double provisionInProzent = 0.00; // %
        double provision3 = 0.03; // %
        double provision6 = 0.06; // %
        double provision10 = 0.10; // %

        // Verarbeitung
        if (umsatz > 0.0 && umsatz <= 5000000.0) {
            double provision = 0.0;
            if (umsatz <= 300000.0) {
                provisionInProzent = 3;
                provision = umsatz * provision3;
            }
            else {
                if (umsatz < 350000.0) {
                    provisionInProzent = 6;
                    provision = umsatz * provision6;
                }
                else {
                    if (umsatz >= 350000.0) {
                        provisionInProzent = 10;
                        provision = umsatz * provision10;
                    }
                }
            }
            String ausgabe = String.format(
                    "Bei einem Umsatz von %,.2f € werden %.0f Prozent als Provision angerechnet.\n" +
                            "Das sind %,.2f €",
                    umsatz, provisionInProzent, provision);
            System.out.println(ausgabe);
        }
    }
}
