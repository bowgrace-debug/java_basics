package aufgaben.sequenzen;

/**
 * rechteck
 * <p>
 * Schreibe ein Programm, welches anhand der Seitenlänge a und b
 * den Umfang und die Fläche eines Rechtecks berechnet und ausgibt.
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class Rechteck {
    public static void main(String[] args) {

        // Eingabe
        double a = 5;
        double b = 7;

        // Vorbereitung
        double umrechnungInUmfang = ((2 * a) + (2 * b));
        double umrechnungInFlaeche = a * b;

        // Ausgabe
        System.out.println(umrechnungInUmfang + " Umfang");
        System.out.println(umrechnungInFlaeche + " Fläche");


    }
}
