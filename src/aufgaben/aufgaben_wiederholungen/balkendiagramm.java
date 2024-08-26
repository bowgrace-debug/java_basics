package aufgaben.aufgaben_wiederholungen;

/**
 * balkendiagramm
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class balkendiagramm {
    public static void main(String[] args) {

        int[] balkendiagramm = {23, 4, 20, 45, 100, 68, 123};
        char[] hexcode  = {0x2588, 0x2591, 0x2593, 0x2592};

        int[] ausgabe = new int[balkendiagramm.length];

        //int cntBalken = 0;
        int cntHex = 0;
        int cntDia = 0;

        for (int prozent : balkendiagramm) {
            String balken = "";
            if (cntHex == hexcode.length){
                cntHex = 0;
            }
            for (int i = 0; i < balkendiagramm[cntDia]; i++ ) {
                balken += hexcode[cntHex];
            }
            cntHex++;
            System.out.println(balken + balkendiagramm[cntDia] + "%");
            cntDia++;
        }
    }
}
