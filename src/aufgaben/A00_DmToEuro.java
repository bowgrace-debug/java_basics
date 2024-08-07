package aufgaben;

/**
 * A00_DmToEuro
 *
 * Erstelle eine Konsolenanwendung mit Java,
 * welche einen gegebenen Betrag in DM in Euro
 * umrechnet und ausgibt.
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class A00_DmToEuro {
    public static void main(String[] args) {

        /*
                Variante 1
        */

        // Eingabe
        double betragInDM = 100.0;

        // Verarbeitung
        double umrechnungInEuro = 1.95583;
        double ergbenisInEuro = betragInDM / umrechnungInEuro;

        // Ausgabe
        System.out.println(ergbenisInEuro);
//        System.out.printf("%.2f",ergbenisInEuro);

        /*
                Variante 2
        */

        final double WECHSELKURS_DM_EURO = 1.95583;
        double ergbenisInEuroTwo = betragInDM / WECHSELKURS_DM_EURO;

        System.out.println(ergbenisInEuroTwo);

        /*
                Variante 3
        */

        final double EXCHANGE_RATIO = 1.95583;

        // Eingabe
        double amountDMark = 10.0;
        double amountEuro = 0.0;

        // Vorbereitung
        amountEuro = amountDMark / EXCHANGE_RATIO;

        // Ausgabe
        System.out.println(amountEuro);

         /*
                Variante 4 (Bad Edition)
        */

        System.out.println(100/1.95583); // Code smell!

    }
}
