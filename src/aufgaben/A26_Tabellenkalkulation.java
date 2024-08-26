package aufgaben;

/**
 * A26_Tabellenkalkulation
 * <p>
 *
 * @author Maximilian Stolle
 * @version 26.08.2024
 */
public class A26_Tabellenkalkulation {
    public static void main(String[] args) {

        double[][] doubleFeld = {
                {12.50, 7.30, 5.20},
                {10.80, 6.70, 19.40},
                {120.00, 0.90, 2.15}
        };

        // for Schleife: gibt alles auf einmal aus
        for (int i = 0; i < doubleFeld.length; i++) {
            for (int x = 0; x < doubleFeld.length; x++) {
                System.out.printf("%6.2f ", doubleFeld[i][x]);
            }
        }
        System.out.println();
        System.out.println("==========================================");

        // erweiterte for Schleife: gibt alles einzeln aus
        for (double[] zeile : doubleFeld) {
            for (double wert : zeile) {
                System.out.printf("%6.2f ", wert);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==========================================");

        // erweiterte for Schleife: gibt alles einzeln aus
        for (double[] zeile : doubleFeld) {
            double summe = 0;
            for (double wert : zeile) {
                summe += wert;
                System.out.printf(" %6.2f ", wert);
            }
            System.out.printf(" = %6.2f ", summe);
            System.out.println();
        }

        System.out.println();
        System.out.println("==========================================");

        for (double[] zeile : doubleFeld) {
            double summe = 0;
            for (double wert : zeile) {
                summe += wert;
                System.out.printf(" %6.2f ", wert);
            }
            System.out.printf(" = %6.2f ", summe);
            System.out.println();
        }
        double spalte0 = doubleFeld[0][0] + doubleFeld[1][0] + doubleFeld[2][0];
        double spalte1 = doubleFeld[0][1] + doubleFeld[1][1] + doubleFeld[2][1];
        double spalte2 = doubleFeld[0][2] + doubleFeld[1][2] + doubleFeld[2][2];
        System.out.printf(" %6.2f  %6.2f  %6.2f ", spalte0, spalte1, spalte2);

        System.out.println();
        System.out.println("==========================================");

        for (int i = 0; i < doubleFeld.length; i++) {
            // Spalte 0-2 in eine normal for Schleife packen und ausgeben
        }

    }
}
