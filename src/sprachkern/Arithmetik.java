package sprachkern;

/**
 * Arithmetik
 *
 * @author Maximilian Stolle
 * @version 07.08.2024
 */
public class Arithmetik {
    public static void main(String[] args) {
        double a;
        double b;

        // Zuweisungsoperator
        b = 3.0;
        a = b = 3.0; // Code smell!

        /*
            Arithmetische Operatoren + - * /

            Ausdruck (Expression)
                - Literale
                - Operatoren
                - Variablen
                - Konstanten
        */

        b = 3.0 + 2.0;
        a = b / 2.0;
        b = ((a + 0.5) * (2.0));
        b = a + (0.5 * 2.0);

        System.out.println(a);
        System.out.println(b);

        /*
            Modulo %
            ganzzahlige Restwertdivision
        */

        int x;
        x = 7 % 2; // = 1
        x = 8 % 2; // = 0
        x = 2 % 8; // = 2

        /*
            Zusammengesetzte Operatoren / Verbundoperatoren
        */

        x = 0;
        x += 5; // entspricht x = x + 5;
        x -= 5; // entspricht x = x - 5;
        x *= 5; // entspricht x = x * 5;
        x /= 5; // entspricht x = x / 5;

        x = 28;
        x %= 5; // entspricht x = x % 5;
        System.out.println(x);

        /*
            Inkrementoperator / Dekrementoperator
        */

        x = 5;
        x++; // entspricht x += 1; oder x = x + 1;
        x--; // entspricht x -= 1; oder x = x - 1;
        System.out.println(x);

        int y;
        x = 5;
        y = ++x; // pre
        y = x++; // post
        System.out.println(y);
        System.out.println(x);

        // Innerhalb von Ausdrücken (Code smell!)
        //      Post-Inkrement x++
        //      Pre-Inkrement ++x
        //      Post-Dekrement x--
        //      Pre-inkrement --x

        x = 5;
//        = 6 + 6;
        x = ++x + x++;
        System.out.println(x);

    }
}
