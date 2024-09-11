package aufgaben.aufgabenAlle.aufgaben46_50.a48_preis;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 05.09.2024
 */
public class Main {
    public static void main(String[] args) {
        Preis p1 = new Preis();
        p1.setBetrag(123.45);
        p1.setWaehrung("€");
        p1.println();

        // überladen von Methoden
        Preis p2 = new Preis();
        p2.setBetrag("123.45");
        p2.setWaehrung("€");
        p1.println(5);

        // Konstruktoren
        Preis p3 = new Preis(45.789798);
        p3.println();
        Preis p4 = new Preis(89.7, "Yen");
        p4.println();

        Preis p5 = new Preis();
        p5.println();


    }
}
