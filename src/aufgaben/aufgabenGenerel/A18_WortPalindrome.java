package aufgaben.aufgabenGenerel;

import java.util.Scanner;

/**
 * A18_Palindrome
 * <p>
 *     Schritt-für-Schritt-Erklärung des Codes
 *
 *          1. Import und Klassendeklaration:
 *              import java.util.Scanner;: Hier wird das Scanner-Objekt importiert, welches für die Eingabe von Benutzereingaben verwendet wird.
 *               public class A18_WortPalindrome: Es wird eine öffentliche Klasse namens A18_WortPalindrome erstellt. Dies ist der Einstiegspunkt für das Programm.
 *
 *          2. Main-Methode:
 *              public static void main(String[] args): Dies ist die Hauptmethode, von der die Ausführung des Programms beginnt.
 *              Scanner scanner = new Scanner(System.in);: Ein neues Scanner-Objekt wird erstellt, um Benutzereingaben von der Konsole zu lesen.
 *              String eingabe = scanner.nextLine().toLowerCase();: Die vom Benutzer eingegebene Zeichenkette wird in einer Variable eingabe gespeichert und anschließend in Kleinbuchstaben umgewandelt, um die Überprüfung unabhängig von Groß- und Kleinschreibung zu machen.
 *              System.out.print("Bitte geben Sie einen String ein: ");: Es wird eine Eingabeaufforderung an den Benutzer ausgegeben.
 *
 *          3. Palindrome-Prüfung:
 *              int anfang = 0;: Ein Index anfang wird auf 0 initialisiert, um das erste Zeichen der Eingabe zu markieren.
 *              int ende = eingabe.length() - 1;: Ein Index ende wird auf den letzten Index der Eingabe gesetzt.
 *              boolean istPalindrom = true;: Eine boolesche Variable istPalindrom wird mit true initialisiert, um anzunehmen, dass die Eingabe zunächst ein Palindrom ist.
 *              while (anfang < ende && istPalindrom == true): Eine while-Schleife wird ausgeführt, solange der Anfangsindex kleiner als der Endindex ist und istPalindrom noch true ist.
 *               if (eingabe.charAt(anfang) != eingabe.charAt(ende)): In jeder Iteration wird überprüft, ob das Zeichen am Anfang und am Ende unterschiedlich ist. Wenn ja, ist es kein Palindrom und istPalindrom wird auf false gesetzt.
 *              anfang++; ende--;: Die Indizes anfang und ende werden jeweils um 1 erhöht bzw. verringert, um das nächste Paar von Zeichen zu vergleichen.
 *
 *         4. Ausgabe:
 *              if (istPalindrom): Nach der Schleife wird überprüft, ob istPalindrom noch immer true ist.
 *              System.out.println(eingabe + " ist ein Palindrom!");: Wenn ja, wird eine entsprechende Meldung ausgegeben.
 *              else: Ansonsten wird eine Meldung ausgegeben, dass es kein Palindrom ist.
 *
 *          Zusammengefasst:
 *              Der Code liest eine Zeichenkette vom Benutzer ein und überprüft, ob diese ein Palindrom ist, indem er die Zeichen von vorne und hinten paarweise vergleicht. Ist ein Paar ungleich, ist es kein Palindrom. Am Ende wird das Ergebnis ausgegeben.
 *
 *           Wichtige Punkte:
 *              Effizienz: Die Verwendung von zwei Indizes und einer while-Schleife ermöglicht eine effiziente Überprüfung.
 *              Klarheit: Der Code ist gut strukturiert und die Variablennamen sind aussagekräftig.
 *              Robustheit: Durch die Umwandlung in Kleinbuchstaben wird die Überprüfung unabhängig von der Groß- und Kleinschreibung.
 *
 *          Verbesserungen:
 *              Fehlerbehandlung: Man könnte eine Ausnahmebehandlung einbauen, um ungültige Eingaben abzufangen.
 *              Erweiterung: Man könnte den Code erweitern, um auch Palindrome zu erkennen, die Leerzeichen oder Sonderzeichen enthalten.
 *
 *          Beispiel:
 *              Wenn der Benutzer "otto" eingibt, wird der Code feststellen, dass das erste und letzte Zeichen ('o'), das zweite und zweitletzte Zeichen ('t') usw. jeweils gleich sind. Daher ist "otto" ein Palindrom.
 *
 *
 *
 *
 *
 *
 * @author Maximilian Stolle
 * @version 18.08.2024
 */

public class A18_WortPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen String ein: ");
        String eingabe = scanner.nextLine().toLowerCase();

        int anfang = 0;
        int ende = eingabe.length() - 1;

        boolean istPalindrom = true;
        while (anfang < ende && istPalindrom == true) {
            if (eingabe.charAt(anfang) != eingabe.charAt(ende)) {
                istPalindrom = false;
            }
            anfang++;
            ende--;
        }

        if (istPalindrom) {
            System.out.println(eingabe + " ist ein Palindrom!");
        } else {
            System.out.println(eingabe + " ist kein Palindrom!");
        }
    }
}
