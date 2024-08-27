package aufgaben;

import java.util.Arrays;

/**
 * A26_Sortieren
 * <p>
 *
 * @author Maximilian Stolle
 * @version 26.08.2024
 */
public class A26_Sortieren {
    public static void main(String[] args) {
        int[] liste = {55, 7, 78, 12, 42};
//        int[] liste = {};
//        double[] liste = {123.45, 0, -2, 4, 4.04};

        System.out.println("unsortiert:");
        System.out.println(Arrays.toString(liste));

        // Sortierung durch den Bubblesort-Algorithmus
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 0; i < liste.length -1; i++) {
                if (liste[i] > liste[i + 1]) {
                    int temp = liste[i];
                    liste[i] = liste[i + 1];
                    liste[i + 1] = temp;
                    getauscht = true;
                }
            }
        } while (getauscht);

        // Ausgabe des sortierten Arrays
        System.out.println("sortiert:");
        System.out.println(Arrays.toString(liste));
    }
}
