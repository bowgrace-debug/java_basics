package methoden;

/**
 * Scope
 * <p>
 *
 * @author Maximilian Stolle
 * @version 28.08.2024
 */
public class Scope {
    static int b  = 1; // "globale" Variable
    static int c = 42;
    static final int k = 4711;

    static void test(int c) { // lokale Variable
        int a = 5;
        b = 8; // Seiteneffekt BÖSE!
        c = 3;
        b = a + c + k;
    }

    public static void main(String[] args) {

        int a  = 7; // lokale Variable
        b = 2;
        c = 9;
        test(6);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
