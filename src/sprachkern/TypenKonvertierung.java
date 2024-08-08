package sprachkern;

/**
 * TypenKonvertierung
 * <p>
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class TypenKonvertierung {
    public static void main(String[] args) {
        int ganz; // Ganzzahl 32 Bit
        long lang; // Ganzzahl 64 Bit

        ganz = 4711;
        lang = 4711; // implizite Typenkonvertierung von int nach long

        /*
                explizite Typenkonvertierung
                type casting (cast, "gecastet", "casten")

                zwischen allen primitiven Datentypen, außer boolean

                Operator-Syntax: (Typ)
        */

        ganz = (int)lang * 5; // erst casten, dann multiplizieren
        ganz = (int)(lang * 5); // erst multiplizieren, dann das Ergebnis casten

        double doppelt = 123.789456123;
//            ganz = doppelt; Fehler: Required type: int Provided: double
        System.out.println(ganz);

        doppelt = 65.89546647;
        char c = (char)doppelt;
        System.out.println(c);
        System.out.println((char)doppelt);
        System.out.println((char)65.89546647);

        doppelt = 3.0;
        short kurz = 2;

        ganz = (int)(doppelt / kurz);
        System.out.println(ganz);
    }
}
