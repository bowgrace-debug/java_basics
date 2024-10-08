package sprachkern;

/**
 * Variablen und Datentypen
 *      - Syntax:
 *              Datentypen bezeichner;
 *              Type Identifier;
 *     - Bezeichner (Identifier);
 *          -Syntax
 *              - UTF-16
 *              - kann beliebig lang sein
 *              - beginnt mit Buchstabe, $ oder _
 *              - darf nicht mit einer Ziffer beginnen
 *              - case-sensitive
 *              - muss eindeutig sein
 *              - kein reserviertes Wort
 *              - und nicht true, false und null
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
        ganzzahl = 0421; // 0 = Präfix für octal
        ganzzahl = 0xaffe; // 0x = Präfix für hexadezimalzahl
        ganzzahl = 0b11111111; // 0b = Präfix für binär
        ganzzahl = 123_456_789; // "Kosmetik", z.B. als Tausendertrennzeichen
        System.out.println(ganzzahl);

        lang = 1888845548649876548L; // L oder l als Suffix für long;

        beit = 126;
        beit++;
        beit++;
        System.out.println(beit);

        kurz = 30000;
        kurz += 5000;
        System.out.println(kurz);

        /*
            Gleit-/Fließkommazahlen
        */

        // einfache Genauigkeit (single-precision, etwa 7 Stellen)
        // +-3.4E38, 32 Bit
        float flies;

        // doppelte Genauigkeit (double-precision, etwa 15 Stellen)
        // +-1.7E308, 64 Bit
        double doppelt;

        // literale
        doppelt = 123.456;
        doppelt = -123.456;
        doppelt = 0; //int-literal! wird automatischen konvertiert!
        doppelt = 0.0;
        doppelt = .0; // Code smell!
        doppelt =  1e3; // 1*10³ = 1000
        doppelt = 1e-3; // 1*10³ = 0.001
        doppelt = 123.456789123456789;
        doppelt = 12345678912345.6789123456789123456789;
        System.out.println(doppelt);

//        flies = 12.456; // Fehler: Required type: float, Provided: double
        flies = 12.456F; // F oder f als Suffix für float

        /*
        Zeichen (Character)
        speichert genau ein Zeichen!
        16 Bit, Unicode UTF-16
        */

        // Literale
        char zeichen;
        zeichen = 'A'; // = 65
        zeichen = 66; // = 'B'
        zeichen = 0x2741; // = ❁
        zeichen = '\''; // maskieren (Escape Sequence)
        zeichen = '\\'; // maskieren (Escape Sequence)
        zeichen = '\n'; // Steuerzeichen (Zeilenumbruch)
        zeichen = '\t'; // Steuerzeichen (Tab/Tabulator)
        zeichen = '\u2628';
        System.out.println(zeichen);

        /*
            Boolean (Wahrheitswerte)
        */
        boolean boo;

        // Literale
        boo = true;
        boo = false;

        /*
            Konstante
        */

        final double pi = 3.14159;
        final int EINE_KONSTANTE = 5;

        /*
                Das Präfix wird immer vor dem Wortstamm eines Wortes platziert.
                Du nennst es deshalb auch Vorsilbe.
                Das Suffix dagegen wird immer nach dem Wortstamm eines Wortes platziert.
        */
    }
}
