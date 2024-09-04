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

         try {
             r.setSeitenLaengeA(-3);
         }
         catch (IllegalArgumentException e) {
             System.out.println("Shit happens!");
             System.out.println(e.getMessage());
         }
        r.setSeitenLaengeB(4);

        System.out.printf("a: %d\n", r.getSeitenLaengeA());
        System.out.printf("b: %d\n", r.getSeitenLaengeB());

        int u = r.umfang();
        System.out.printf("Umfang: %d\n", u);

        int f = r.flaeche();
        System.out.printf("Fläche: %d\n", f);

    }
}