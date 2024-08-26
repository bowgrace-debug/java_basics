package aufgaben.aufgaben_wiederholungen;

import java.util.Arrays;

/**
 * umgedreht
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class umgedreht {
    public static void main(String[] args) {

        int[] zahlen = {4, 7, 1, 3, 5};
        int cnt = 0;
        int[] umgedreht = new int[zahlen.length];

        for (int i = zahlen.length -1; i >= 0; i--) {
            umgedreht[i] = zahlen[cnt];
            cnt++;
        }
        System.out.println(Arrays.toString(umgedreht));
    }
}
