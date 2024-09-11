package aufgaben.aufgabenAlle.aufgaben46_50.a47_paket;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 06.09.2024
 */
public class Main {

    public static void main(String[] args) {
        Paket paket = new Paket(3.4);
        double preis = paket.berechnePreis();

        Paket p2 = new Paket();
        p2.setGewicht(18);

        Paket[] pakete = new Paket[10];
        pakete[0] = new Paket();
        pakete[0].setGewicht(4);
        pakete[2] = new Paket();
        pakete[2].setGewicht("siebzehn");

        for(Paket p : pakete) {
            if(p != null) {
                System.out.println(p.asString());
            }
        }
    }
}

