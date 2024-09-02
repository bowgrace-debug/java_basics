package aufgaben.a32_Versandkostenberechnung;

import java.util.Arrays;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Main {
    static void ausgabe(Paket p) {
        double preis = p.berechnePreis();
        System.out.printf("%.2f\n",preis);
    }
    public static void main(String[] args) {
        Paket paket = new Paket();
        paket.gewicht = 3.4;

        double preis = paket.berechnePreis();

//        System.out.println(preis);
        ausgabe(paket);

        Paket p2 = new Paket();
        p2.gewicht = 18;
//        System.out.println(p2.berechnePreis());
        ausgabe(p2);

        Paket[] pakete = new Paket[10];

        System.out.println(Arrays.toString(pakete));

        pakete[0] = new Paket();
        pakete[0].gewicht = 4;
        pakete[2] = new Paket();
        pakete[2].gewicht = 17;
        System.out.println(Arrays.toString(pakete));

        for (Paket p : pakete) {
            if (p != null) {
                System.out.printf("%.2f €\n", p.berechnePreis());
            }
        }
    }
}
