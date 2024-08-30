package methoden;

/**
 * Rekursion
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Rekursion {


   /* static void test () {
        test();
    }*/
    /*
        Beispiel 1: Zahlenreihe 1 bis n
    */
    // iterativer Algorithmus
    static void zahlenreiheIterativ(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    // Rekursiver Algorithmus
    static void zahlenreiheRekursiv(int n) {
        if (n > 1) {
            zahlenreiheRekursiv(n - 1);
        }
        System.out.print(n + " ");
    }

    /*
        Beispiel 2: Summe der Zahlen von 1 bis n
     */
    // iterativer Algorithmus
    static int summeIterativ(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // rekursiver Algorithmus
    static int summeRekursiv(int n) {
        if (n == 1) {
            return n;
        }
        else {
            return n + summeRekursiv(n - 1);
        }
    }

    public static void main(String[] args) {
//        test();
        zahlenreiheIterativ(5);
        System.out.println();
        zahlenreiheRekursiv(5);
    }
}
