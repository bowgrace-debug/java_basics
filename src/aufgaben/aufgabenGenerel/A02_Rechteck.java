package aufgaben.aufgabenGenerel;

/**
 * A01_Rechteck
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.08.2024
 */
public class A02_Rechteck {
    public static void main(String[] args) {

        // Eingabe
        double a = 3; // m
        double b = 4; // m

        // Verarbeitung
        double umfang = (a + b) + (a + b);
        double flaeche = a * b;

        String ausgabe = String.format(
                "Der Umfang entspricht %.0f Meter\n" +
                "Die Fläche entspricht %.0f Quadratmeter\n",
                umfang, flaeche);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
