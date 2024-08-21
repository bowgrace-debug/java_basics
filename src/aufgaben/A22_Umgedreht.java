package aufgaben;

import java.util.Arrays;

/**
 * A22_Umgedreht
 * <p>
 *
 * @author Maximilian Stolle
 * @version 21.08.2024
 */
public class A22_Umgedreht {
    public static void main(String[] args) {

        int[] zahlen = {4,7,1,3,5};
        int[] array = new int[zahlen.length];
        int cnt = 0;

        for (int i = zahlen.length -1; i >= 0; i--){
            array[i] = zahlen[cnt];
            cnt++;
        }
        System.out.println(Arrays.toString(array));
    }
}
