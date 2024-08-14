package aufgaben;

/**
 * A09_Schaltjahr
 * <p>
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class A09_Schaltjahr {
    public static void main(String[] args) {

        // Eingabe
        double eingabeJahr = 2024;

        // Verarbeitung
        if ((eingabeJahr % 4 == 0 && eingabeJahr % 100 != 0) || (eingabeJahr % 400 == 0)) {
            String ausgabe = String.format(
                    "%.0f ist ein Schaltjahr.",
                    eingabeJahr);
            System.out.println(ausgabe);
        }
        else {
            String ausgabe = String.format(
                    "%.0f ist kein Schaltjahr",
                    eingabeJahr);
            System.out.println(ausgabe);
        }
    }
}
