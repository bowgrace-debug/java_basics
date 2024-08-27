package aufgaben;

/**
 * A26_Tabellenkalkulation
 * <p>
 *
 * @author Maximilian Stolle
 * @version 26.08.2024
 */
public class A27_Tabellenkalkulation {
    public static void main(String[] args) {

        double[][] tabelle = {
                {12.50, 7.30, 5.20},
                {10.80, 6.70, 19.40},
                {120.00, 0.90, 2.15}
        };

        // for Schleife: gibt alles auf einmal aus
        for (int i = 0; i < tabelle.length; i++) {
            for (int x = 0; x < tabelle.length; x++) {
                System.out.printf("%6.2f ", tabelle[i][x]);
            }
        }
        System.out.println();
        System.out.println("==========================================");

        // erweiterte for Schleife: gibt alles einzeln aus
        for (double[] zeile : tabelle) {
            for (double wert : zeile) {
                System.out.printf("%6.2f ", wert);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==========================================");

        // erweiterte for Schleife: gibt alles einzeln aus
        for (double[] zeile : tabelle) {
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

        for (double[] zeile : tabelle) {
            double summe = 0;
            for (double wert : zeile) {
                summe += wert;
                System.out.printf(" %6.2f ", wert);
            }
            System.out.printf(" = %6.2f ", summe);
            System.out.println();
        }
        double [] spalten = {
                tabelle[0][2] + tabelle[1][0] + tabelle[2][0],
                tabelle[0][1] + tabelle[1][1] + tabelle[2][1],
                tabelle[0][2] + tabelle[1][2] + tabelle[2][2]
        };
        System.out.printf(" %6.2f %7.2f %7.2f", spalten[0], spalten[1], spalten[2]);

        System.out.println();
        System.out.println("==========================================");

    }
}