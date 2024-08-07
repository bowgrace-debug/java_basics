package aufgaben.sequenzen;

/**
 * kraftstoffverbrauch
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class kraftstoffverbrauch {
    public static void main(String[] args) {

        // Eingabe
        double kilometer = 528.0;

        // Verarbeitung
         final double liter = 36.74;

        // Ausgabe
        System.out.printf("%.2f  Liter auf 100 Kilometer \n",(liter / kilometer * 100));
    }
}
