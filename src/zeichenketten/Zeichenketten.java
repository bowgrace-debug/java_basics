package zeichenketten;

/**
 * Zeichenketten/- folge (Strings)
 * <p>
 *  - besteht aus einer Folge von Zeichen (16 Bit, Unicode, UTF-16)
 *  - Klasse String
 *
 *
 * @author Maximilian Stolle
 * @version 09.08.2024
 */
public class Zeichenketten {
    public static void main(String[] args) {
        String s; // Objektreferenztyp
        double d; // primitiver Datentyp

        // Literale
        s = "abc";
        s = ""; // Leerstring

        // Maskieren
        s = "bla \"bla \"bla";
        s = "bla \\ bla";

        // Escape-Sequenzen
        s = "bla \n bla \t bla";
        s = "Pirates of the Caribbean \u2620";

        /*
            Verkettung (Konkatenation, concat)
        */

        String s1 = "Hello" + " ";
        String s2 = "World!";
        s = s1 + s2;

        int x = 3 + 5;

        s = 3 + "abc"; // "3" + "abc" = "3abc"

        s = 2 + 3 + "4"; // 5 + "4" = "54"
        s = "2" + 3 + 4; // "2" + "3" = "23" + 4 = "23" + "4" = "234"
        s = "2" + (3 + 4); // "2" + 7 = "2" + "7" = "27"

        double preis = 123456.789456;
        String waehrung = "Euro";

        String ausgabe = String.format("Preis: %,.2f %s", preis, waehrung, "\n");

        System.out.println(ausgabe);


        /*
                Methoden der Klasse String
                Eigenversuch
        */
        String txt1 = "Ein Text ist ein String";
        int leange = txt1.length();
        String vorsatz = "Die Länge des Strings beträgt";
        String schlusssatz = "Stellen";
        ausgabe = vorsatz + " " + leange + " " + schlusssatz;
        System.out.println(ausgabe);


         /*
                Methoden der Klasse String

                index: 0 bis Länge -1

                Beispiel:
                    Index:      012
                                "abc"       länge = 3
        */
        String txt = "Ein Text ist ein String";

        //Länge abfragen
        int laenge = txt.length();
        System.out.println(leange);

        // Einzelne Zeichen abfragen
        char c = txt.charAt(4);
        System.out.println(c);

        // Teilzeichenkette
        String teil = txt.substring(4,8);
        System.out.println(teil);

        // Suche contains (case-sensitive)
        boolean istDrin = txt.contains("Text");
//        boolean istDrin = txt.toLowerCase().contains("text"); // Konveniert den Inhalt von txt in klein Buchstaben
        System.out.println(istDrin);

        // Suche mit IndexOf / lastIndex0f
        int index = txt.indexOf("Textasdyf");
//        int index = txt.lastIndexOf("in");
        System.out.println(index);

        // Ist der String leer?
        boolean istLeer = txt.isEmpty();
        System.out.println(istLeer);


        // Formatierung
//      double preis = 123456.789456;
//      String waehrung = "Euro";
        String ausgabePreis = String.format("Preis: %,.2f %s", preis, waehrung);
        System.out.println(ausgabePreis);
    }
}
