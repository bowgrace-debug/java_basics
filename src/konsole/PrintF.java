package konsole;

/**
 * PrintF
 * <p>
 *
 *     Syntax (grob)
 *          printf(format, var1, var1 ...)
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class PrintF {
    public static void main(String[] args) {
        int anzahl = 42;

        /*
                Ausgabe:
                Gesamtanzahl: 42 Stück
        */
        System.out.println("Gesamtanzahl: " + anzahl + " Stück");
        System.out.printf("Gesamtanzahl: %d Stück\n", anzahl);
        System.out.printf("Gesamtanzahl: %d Stück%n", anzahl);

        System.out.printf("%d bla %d blub %d\n", 42,4711,8);
        System.out.printf("%d bla %8d blub %d\n", 42,4711,8);
        System.out.printf("%d bla %-8d blub %d\n", 42,4711,8);

        // Fließkommazahlen
        double preis = 12345.6789123456;
        System.out.printf("Preis = %f Euro\n ", preis);
        System.out.printf("Preis = %-15.2f Euro\n  ", preis);
        System.out.printf("Preis = %,.2f Euro\n ", preis);

    }
}
