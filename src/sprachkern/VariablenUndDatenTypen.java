package sprachkern;

/**
 * Variablen Und Datentypen
 *      -Syntax:
 *              Datentypen bezeichner;
 *              Type Identifier;
 *     -Bezeichner (Identifier);
 *
 *          - Konventionen
 *              - nur A-Z, a-z, _, 0-9
 *              - sprechende Namen
 *              - lowerCamelCase
 *
 * @author Maximilian Stolle
 * @version 06.08.2024
 */
public class VariablenUndDatenTypen {
    public static void main(String[] args) {

        // Deklaration (Variablendeklaration)
        int a;

        // Zuweisung eines Wertes über den Zuweisungsoperator
        a = 24;

        //Deklaration mit Initialisierung
        int b = 25;
        int d = 1, e = 2, z = 6; // Code smell!


        // Ausgabe des Inhalts der Variablen
        System.out.println(a); // = 24
        System.out.println(b); // = 25
        System.out.println("Hello, World!"); // = Hello, World! (Ausgabe der Zeichenkette)

        // Bezeichner (Identifier)
        int an = 123456; // Code smell!
        int artikelNummer = 123456;

        int bädSmell; // Code smell!

        /*****************************************************
         Einfache/ primitive/ Standard-/ elementare Datentypen
         *****************************************************/

        /*
            Ganzzahlen (Integer) mit Vorzeichen
            - int ist der Standarddatentyp
        */

        byte beit; // -128 bis +127 (8 Bit)
        short kurz; // -32768 bis +32767 (16 Bit)
        int ganzzahl; // -2147483648 bis +214748647 (32 Bit)
        long lang; // -9223372036854775800 bis +9223372036854775007 (64 Bit)

        // literale
        ganzzahl = 24;
        ganzzahl = -24;
        ganzzahl = 0421; // 0 = Präfix für oktal
        ganzzahl = 0xaffe; // 0x = Präfix für hexadezimalzahl
        ganzzahl = 0b11111111; // 0b = Präfix für binär
        ganzzahl = 123_456_789; // "Kosmetik", z.B. als Tausendertrennzeichen
        System.out.println(ganzzahl);

    }
}
