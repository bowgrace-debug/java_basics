package aufgaben.aufgaben_wiederholungen;

/**
 * schaltjahr
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class schaltjahr {
    public static void main(String[] args) {

        // Eingabe
        int jahr = 2023;

        // Verarbeitung
        if (jahr % 4 == 0 && (jahr & 100) != 0 || jahr % 400 == 0) {
            System.out.printf("%d ist ein Schaltjahr!", jahr);
        }
        else {
            System.out.printf("%d ist kein Schaltjahr!", jahr);
        }
    }
}
