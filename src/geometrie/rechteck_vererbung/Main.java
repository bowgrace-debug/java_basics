package geometrie.rechteck_vererbung;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 13.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Rechteck r = new Rechteck();
        r.setSeitenlaengeA(123);
        r.setSeitenlaengeB(56);

        Quadrat q = new Quadrat();
        q.setSeitenlaengeA(78);

        Raute raute = new Raute();
        raute.setSeitenlaengeA(32);
        raute.setWinkel(45);

    }
}
