package aufgaben.aufgaben_wiederholungen;

/**
 * MinMax
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class MinMax {
    public static void main(String[] args) {

        int[] liste = {-11, 22, -33, -44, 55, -66, 77, -88, -99, 0};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int zahl : liste) {
            if (zahl > max) {
                max = zahl;
            }
            if (zahl < min) {
                min = zahl;
            }
        }
        System.out.println("Die kleinste zahl ist: " + min);
        System.out.println("Die größte Zahl ist: " + max);
    }
}
