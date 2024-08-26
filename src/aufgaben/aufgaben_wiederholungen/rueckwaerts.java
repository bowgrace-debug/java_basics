package aufgaben.aufgaben_wiederholungen;

/**
 * rueckwaerts
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class rueckwaerts {
    public static void main(String[] args) {

        String txt = "Ein Text";
        int laenge = txt.length();
        int i = laenge -1;

        while (i >= 0) {
            System.out.println(txt.charAt(i));
            i--;
        }
    }
}
