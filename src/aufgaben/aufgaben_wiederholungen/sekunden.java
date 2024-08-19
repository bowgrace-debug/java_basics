package aufgaben.aufgaben_wiederholungen;

/**
 * sekunden
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class sekunden {
    public static void main(String[] args) {

        // Eingabe
        double sekunden = 210;

        // Verarbeitung
        double minuten = sekunden / 60;

        // Ausgabe
        String ausgabe = String.format("%.0f Sekunden sind gleich: %.2f Minuten.", sekunden, minuten);
        System.out.println(ausgabe);
    }
}
