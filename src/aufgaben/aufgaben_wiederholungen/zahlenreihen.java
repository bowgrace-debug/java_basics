package aufgaben.aufgaben_wiederholungen;

/**
 * zahlenreihen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class zahlenreihen {
    public static void main(String[] args) {

        for (int i = 3; i <= 19; i += 4) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 8; i <= 256; i *= 2) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 243; i >= 3; i /= 3) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 3; i >= -3; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
        int i = 1;
        while(i <= 7) {
            System.out.print( " " + i % 2);
            i++;
        }
    }
}
