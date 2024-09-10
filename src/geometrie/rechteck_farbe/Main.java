package geometrie.rechteck_farbe;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Main {
    public static void main(String[] args) {
        // Objektreferenzvariable
        Rechteck r;

        // Instanziierung (Objekt erzeugen über new)
        r = new Rechteck();

//        r.seitenlaengeA = 3; // 'seitenlaengeA' has private access
        try {
            r.setSeitenlaengeA(-3);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Shit happens!");
            System.out.println(e.getMessage());
        }

        r.setSeitenlaengeB(4);


        System.out.printf("a: %d\n", r.getSeitenlaengeA());
        System.out.printf("b: %d\n", r.getSeitenlaengeB());

        int u = r.umfang();
        System.out.printf("Umfang: %d\n", u);
        int f = r.flaeche();
        System.out.printf("Fläche: %d\n", f);


        double a = 5.0;
        double b = 3.0;
        Rechteck r2 = new Rechteck();
        r2.setSeitenlaengeA(a);

        String aString = "3";
        String bString = "5";

        Rechteck r3 = new Rechteck();
        r2.setSeitenlaengeA(aString);



        Rechteck r4 = new Rechteck(3,4);
        System.out.println(r4.flaeche());


        /*
            ... mit Farbe
        */

        Rechteck rechteck = new Rechteck(5,6);
        // Variante 1
        Colour blau = new Colour(0,0,130);
        rechteck.setFarbe(blau);

        // Variante 2
        rechteck.setFarbe(new Colour(0,130,0));


    }
}

