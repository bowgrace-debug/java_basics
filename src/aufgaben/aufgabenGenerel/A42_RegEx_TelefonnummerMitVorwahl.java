package aufgaben.aufgabenGenerel;

/**
 * A42_RegEx_TelefonnummerMitVorwahl
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A42_RegEx_TelefonnummerMitVorwahl {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

        s = "030 123456";
//        s = "0421/123456";
        s = "0421 123";
        String patternVorwahl = "0[0-9]{2,5}";
        String patternTrennzeichen = "(\s|/|-)";
        String patternNummer = "[0-9]{6,}";
        pattern = patternVorwahl + patternTrennzeichen + patternNummer;
//        pattern = String.format("%s(?:%s)?%s", patternVorwahl, patternTrennzeichen, patternNummer);
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);

        System.out.println("======================================");

        pattern = "0[0-9]{2,5}(\\s|/|-)[0-9]{6,}";
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n",s,pattern,matched);
    }
}
