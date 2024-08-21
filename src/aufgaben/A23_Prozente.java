package aufgaben;

/**
 * A23_Prozente
 * <p>
 *
 * @author Maximilian Stolle
 * @version 21.08.2024
 */
public class A23_Prozente {
    public static void main(String[] args) {

        int[] prozentzahlen = {45, 0, -12, 75, 100, 27, 123, 89};
        int cnt = 0;

        for(int prozent : prozentzahlen) {
            if (prozent >= 0 && prozent <= 100) {
                System.out.println(cnt + ". " + prozent + " Gültig");
            }
            else {
                System.out.println(cnt + ". " + prozent + " Ungültig");
            }
            cnt++;
        }
    }
}
