package sprachkern;

/**
 * Rechnungsgenauigkeit
 * <p>
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class Rechnungsgenauigkeit {
    public static void main(String[] args) {
        /*
            float

            Beispiele:
                f1      f2     ergebnisFloat
                0.04    0.03   0.01
                0.05    0.04   0.010000002
                0.06    0.05   0.009999998
         */
        float f1 = 0.06f; // 6 x 10-²
        float f2 = 0.05f;
        float ergebnisFloat = f1 - f2;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(ergebnisFloat);
        System.out.printf("%.2f%n",ergebnisFloat);

      /*
            double

            Beispiele:
                d1      d2     ergebnisDouble
                0.02    0.01   0.01
                0.03    0.02   0.009999999999999998
                0.04    0.03   0.010000000000000002
                0.05    0.04   0.010000000000000002
                0.06    0.05   0.009999999999999995
         */
        double d1 = 0.06;
        double d2 = 0.05;
        double ergebnisDouble = d1 - d2;
        System.out.println(ergebnisDouble);
        System.out.printf("%.2f%n",ergebnisDouble);

        // Summe
        double summe = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("Summe = " + summe); // = 0.9999999999999999

        // Produkt
        double produkt = 0.1 * 10.0;
        System.out.println("Produkt = " + produkt); // = 1.0

        // Differenz zwischen Produkt und Summe
        System.out.println("Differenz: " + (produkt - summe));
        System.out.printf("Differenz: %.20f", produkt - summe);
    }
}
