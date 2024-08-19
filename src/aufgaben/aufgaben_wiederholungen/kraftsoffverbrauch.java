package aufgaben.aufgaben_wiederholungen;

/**
 * kraftsoffverbrauch
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class kraftsoffverbrauch {
    public static void main(String[] args) {

        // Eingabe
        double gefahrendeKilometer = 528;
        double gesamtVerbrauch = 36.74; // Liter

        // Verarbeitung
        double durchschnittsverbrauch = gesamtVerbrauch / gefahrendeKilometer * 100;

        String ausgabe = String.format(
                "Der durchschnittliche Verbrauch bei gefahrenden %.0f Km und einen gesamten Verbrauch von %.2f Litern, sind gleich: %.2f Liter auf 100 Kilometern. ",
                gefahrendeKilometer, gesamtVerbrauch, durchschnittsverbrauch);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
