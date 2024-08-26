package sprachkern;

import java.util.Arrays;

/**
 * MehrdimensionaleArrays
 * <p>
 *
 * @author Maximilian Stolle
 * @version 26.08.2024
 */
public class MehrdimensionaleArrays {
    public static void main(String[] args) {

        // Deklaration der Objektreferenzvariable
        // und Erzeugen einer neuen Instanz / eines neuen Objektes

        int[] feld = new int[5]; // Eindimensional
        int[][] zweiFelder = new int[5][3]; // Zweidimensional
        int[][][] dreiFelder = new int[5][3][0]; // Dreidimensional

        // Zugriff auf einzelne Elemente
        zweiFelder[2][1] = 12;
        zweiFelder[3][2] = 5;
        zweiFelder[0][1] = zweiFelder[2][1] + zweiFelder[3][2];

        // Erzeugen über eine "Array-Literal" / "Array-Konstante"
//        int[][] doubleFeld = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] doubleFeld = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Zeile ersetzten
        int[] newLine = {42,73,11};
        doubleFeld[2] = newLine;

        System.out.println(doubleFeld[0][2]);
        System.out.println(Arrays.toString(doubleFeld[0]));
        System.out.println("===================================");

        // for Schleife: gibt alles auf einmal aus
        for (int i = 0; i < doubleFeld.length; i++) {
            System.out.println(Arrays.toString(doubleFeld[i]));
        }
        System.out.println("===================================");

        // for Schleife: jeden Wert einzeln ausgeben
        for (int i = 0; i < doubleFeld.length; i++) {
            for (int k = 0; k < doubleFeld.length; k++) {
                System.out.printf("%3d", doubleFeld[i][k]);
            }
        }
        System.out.println();
        System.out.println("===================================");

        // Erweiterte for Schleife: jeden Wert einzeln ausgeben
        for (int[] zeile : doubleFeld) {
            for (int wert : zeile) {
                System.out.printf("%3d", wert);
            }
            System.out.println();
        }
        System.out.println("===================================");
    }
}
