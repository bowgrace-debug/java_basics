package zeichenketten.regex;

/**
 * RegEx
 *
 * Reguläre Ausdrücke (Regular Expressions, Regex)
 *
 * Ein regulärer Ausdruck ist eine Folge von Buchstaben und Symbolen,
 * die ein Suchmuster (Pattern) bilden.
 * Reguläre Ausdrücke können verwendet werden, um Zeichenketten (Strings)
 * zu bearbeiten, zu prüfen oder in ihnen etwas zu suchen.
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class RegEx {
    public static void main(String[] args) {
        String s; // die zu prüfende Zeichenkette
        String pattern; // das Pattern = der reguläre Ausdruck = RegEx
        boolean matched; // passt das Pattern?

        // einfache Gleichheit
        s = "Moin";
        pattern = "Moin";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // genau ein beliebiges Zeichen
        s = "Moin";
        pattern = "M.in";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // Wiederholungen (Quantoren)
        s = "MMMMoin";
        pattern = "M.in";
        pattern = ".oin"; // 1
        pattern = ".+oin"; // 1..n
        pattern = ".*oin"; // 0..n
        pattern = ".?oin"; // 0..1
        pattern = ".{3,5}oin"; // min .. max
        pattern = ".{3,}oin"; // min
        pattern = "M+.oin"; // 1..n

        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // Gruppen bilden durch runde Klammern
        s = "Moin";
        pattern = "M(oi)+n";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        s = "Meier";
        s = "Maier";
        s = "Mayer";
        s = "Meyer";
        pattern = "M(ei|ai|ay|ey)er";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        s = "Fau Meier";
        s = "Herr Müller";
        pattern = "(Herr|Frau) .+";
        pattern = "((Herr|Frau) )?.+";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // Zeichenklassen
        s = "Maier";
        s = "Meyer";

        pattern = "M[ae]yer";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // Beispiel: PLZ
        s = "28219";
        s = "D-28310";

//        pattern = "[0123456789]{5}";
//        pattern = "[0-9]{5}";
        pattern = "(D-)?[0-9]{5}";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // Beispiel: Vorname
        s  = "Bilbo";
        pattern = "[A-Z][a-z]+";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        s = "sdgAfaKjk";
//        pattern = "[A-z]+"; // inkl. dazwischenliegende Zeichen!
        pattern = "[A-Za-z]+";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        // Beispiel: Datum
        s = "09.09.2024";
//        pattern = "[0-9]{2}[.][0-9]{2}[.][0-9]{4}"; // lange version
//        pattern = "([0-3]{2}[.]){2}[0-9]{4}"; // kurze version
//        pattern = "(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.][12][0-9]{3}"; // neueste Version
        String patterntag = "(0[1-9]|[12][0-9]|3[01])";
        String patternmonat = "(0[1-9]|1[012])";
        String patternjahr = "[12][0-9]{3}";
        pattern = patterntag +"[.]" + patternmonat + "[.]" + patternjahr;
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

    }
}
