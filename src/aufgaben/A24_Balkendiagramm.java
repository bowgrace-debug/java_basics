package aufgaben;

/**
 * A24_Balkendiagramm
 * <p>
 *
 * @author Maximilian Stolle
 * @version 21.08.2024
 */
public class A24_Balkendiagramm {
    public static void main(String[] args) {

        int[] balkendiagramm = {23, 4, 20, 45, 100, 68, 123};
        char[] hexcode  = {0x2588, 0x2591, 0x2593, 0x2592};
        int[] array = new int[balkendiagramm.length];
        int cnt = 0;
        int counter = 0;


        for (int prozent : balkendiagramm) {
            String balken  = "";
            if (counter == hexcode.length) {
                counter = 0;
            }
            for (int i = 0; i < balkendiagramm[cnt]; i++) {
               balken += hexcode[counter];
            }
            counter++;
            System.out.println(balken + balkendiagramm[cnt]);
            cnt++;
        }
    }
}
