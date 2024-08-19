package aufgaben.aufgaben_wiederholungen;

/**
 * rechteck
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class rechteck {
    public static void main(String[] args) {

        // Eingabe
        int a = 3; // Meter
        int b = 4; // Meter

        // Verarbeitung
        int flaeche = a * b;
        int umfang = (2 * a) + (2 * b);


        String ausgabe = String.format(
                "Die Fläche beträgt: %d Quadratmeter.\nDer Umfang beträgt: %d Meter.",
                flaeche, umfang);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
