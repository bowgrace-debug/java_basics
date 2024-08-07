package aufgaben.sequenzen;

/**
 * rechteck
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class rechteck {
    public static void main(String[] args) {

        // Eingabe
        double a = 5;
        double b = 5;

        // Vorbereitung
        double umrechnungInUmfang = ((2 * a) + (2 * b));
        double umrechnungInFlaeche = a * b;

        // Ausgabe
        System.out.println(umrechnungInUmfang + " Umfang");
        System.out.println(umrechnungInFlaeche + " Fläche");


    }
}
