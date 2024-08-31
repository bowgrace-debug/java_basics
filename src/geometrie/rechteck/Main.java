package geometrie.rechteck;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Main {
    public static void main(String[] args) {

        // Objektreferent variable
        Rechteck r;

        // Instanziierung (Objekt erzeugen über new)
         r = new Rechteck();
        r.seitenLaengeA = 3;
        r.seitenLaengeB = 4;

        int u = r.umfang();
        System.out.printf("Umfang: %d\n", u);

        int f = r.flaeche();
        System.out.printf("Fläche: %d\n", f);

    }
}