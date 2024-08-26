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

        int cntbalken = 0;
        int cntHex = 0;

        for (int prozent : balkendiagramm) {
            String balken  = "";
            if (cntHex == hexcode.length) {
                cntHex = 0;
            }
            for (int i = 0; i < balkendiagramm[cntbalken]; i++) {
               balken += hexcode[cntHex];
            }
            cntHex++;
            System.out.println(balken + balkendiagramm[cntbalken] + "%");
            cntbalken++;
        }
    }
}


// länge das balkens berechnen
//int barLenght = values[BarIndex] / BAR_LENGHT_DIVISOR;