package aufgaben.aufgaben_wiederholungen;

/**
 * prozente
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class prozente {
    public static void main(String[] args) {

        int[] prozentzahlen = {45, 0, -12, 75, 100, 27, 123, 89};

        int cnt = 0;

        for (int prozent : prozentzahlen) {
            if (prozent >= 0 && prozent <= 100) {
                System.out.printf("%d.  %d Gültig\n", cnt, prozent);
            }
            else {
                System.out.printf("%d. %2d Ungültig\n", cnt, prozent);
            }
            cnt++;
        }
    }
}
