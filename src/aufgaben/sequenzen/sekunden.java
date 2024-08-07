package aufgaben.sequenzen;

/**
 * sekunden
 * <p>
 * Schreibe ein Programm, welches eine beliebige Anzahl
 * von Sekunden in minuten umrechnet und ausgibt.
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class sekunden {
    public static void main(String[] args) {

        // Eingabe
        double sekunden = 240.0;

        // Verarbeitung
        double minuten = 60.0;
        double ergebnisInMinuten = sekunden / minuten;

        // Ausgabe
        System.out.println(ergebnisInMinuten + " Minuten");
    }
}
