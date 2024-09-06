package methoden;

/**
 *  Überladen von Methoden (overload)
 *
 *  Signatur:
 *      = Bezeichner + Anzahl und Typ der Parameter
 *
 *      Der Typ des Rückgabewertes sowie die Bezeichner der Parameter
 *      sind NICHT Bestandteil der Signatur!
 *
 *      Polymorphie (Vielgestaltigkeit) von Methoden
 *
 *
 * @author Maximilian Stolle
 * @version 05.09.2024
 */
public class MethodenUeberladen {

    static void test() {
        System.out.println("test()");
    }

    static void test(int x) { // Signatur: test(int)
        System.out.println("test(int)");
    }

    static void test(double x) { // Signatur: test(double)
        System.out.println("test(double)");
    }

    static void test(int x, String s) { // Signatur: test(int, String)
        System.out.println("test(int, String)");
    }

    static void test(double x, String s) {
        System.out.println("test(double, String)");
    }

    public static void main(String[] args) {

        // Die Methode println ist mehrfach überladen
        System.out.println(123);
        System.out.println(123.456);
        System.out.println("abc");

        test();
        test(5);
        test(12.0);
        test(7, "Max");
        test(12.5, "Max");
    }
}
