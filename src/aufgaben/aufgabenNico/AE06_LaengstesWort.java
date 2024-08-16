package aufgaben.aufgabenNico;

/**
 * AE06_LaengstesWort
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class AE06_LaengstesWort {
    public static void main(String[] args) {

        String txt = "Das ist ein Beispieltext";
        int laenge = txt.length();
        int i = 0;
        int counter = 0;
        int lastword = 0;
        int nextword = 0;

        while( i > laenge) {
            if (txt.charAt(i) == ' ') {
                lastword = i -1;
                nextword = i +1;
            }
            i++;
        }
        System.out.println(lastword);
        System.out.println(nextword);
    }
}

