package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A16_JedenZweiten
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class A16_JedenZweiten {
    public static void main(String[] args) {

        String txt = "mgajyk rtth eu isoopu racyev nbzet twqi tfhc eyaowue";
        // Ergebnis m a y ' ' t h e ' ' s o u r c e ' ' b e ' ' w i t h ' ' y o u
        int laenge = txt.length();

        for (int i = 0; i < laenge; i+=2) {
            System.out.println(txt.charAt(i));
        }

        System.out.println();
        System.out.println("================");
        System.out.println();

        int i = 0;

        while (i < laenge) {
            System.out.println(txt.charAt(i));
            i += 2;
        }
    }
}
