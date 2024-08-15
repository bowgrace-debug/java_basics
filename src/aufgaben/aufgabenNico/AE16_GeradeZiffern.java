package aufgaben.aufgabenNico;

/**
 * AE16_GeradeZiffern
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class AE16_GeradeZiffern {
    public static void main(String[] args) {

        String text = "1235429380879569653493438623046546546544396412603464";

        int laenge = text.length();
        int i = 0;
        int output = 0;

        while (i < laenge) {
            if (text.charAt(i) % 2 == 0) {
                output++;
            }
            i++;
        }
        System.out.printf("Es sind %d gerade Zahlen im String", output);
    }
}
