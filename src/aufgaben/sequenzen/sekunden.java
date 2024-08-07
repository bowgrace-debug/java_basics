package aufgaben.sequenzen;

/**
 * sekunden
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class sekunden {
    public static void main(String[] args) {

        // Eingabe
        double sekunden = 120.0;

        // Verarbeitung
        double minuten = 60.0;
        double ergebnisInMinuten = sekunden / minuten;

        // Ausgabe
        System.out.println(ergebnisInMinuten + " Minuten");
    }
}
