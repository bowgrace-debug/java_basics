package aufgaben.aufgabenGenerel;

/**
 * A02_Kraftstoffverbrauch
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.08.2024
 */
public class A03_Kraftstoffverbrauch {
    public static void main(String[] args) {

        // Eingabe
        double gefahrendeKilometer = 528;
        double gesamtVerbrauch = 36.74; // Liter

        // Verarbeitung
        double verbrauchProHundertKilometer = gesamtVerbrauch / gefahrendeKilometer * 100;
        String ausgabe = String.format(
                "Bei %.2f gefahrenden Kilometern und der gesamte Kraftstoffverbrauch von %.2f Liter," +
                        " ergibt sich ein Durchschnittswert von %.2f Liter auf 100 Kilometern.\n ",
                gefahrendeKilometer, gesamtVerbrauch, verbrauchProHundertKilometer);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
