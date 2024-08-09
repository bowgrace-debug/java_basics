package aufgaben;

/**
 * kraftstoffverbrauch
 * <p>
 * Erstelle ein Programm, welches anhand der gefahrenen Kilometer und des dafür
 * verbrauchten Kraftstoffs, den durchschnittlichen Verbrauch pro 100 Km rechnet
 * und ausgibt
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class A03_Kraftstoffverbrauch {
    public static void main(String[] args) {

        // Eingabe
        double kilometer = 528.0;

        // Verarbeitung
         final double liter = 36.74;

        // Ausgabe
        System.out.printf("%.2f  Liter auf 100 Kilometer verbraucht: \n",(liter / kilometer * 100));
    }
}
