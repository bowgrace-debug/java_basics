package aufgaben.aufgabenGenerel;

/**
 * A44_RegEx_PreisInEuro
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A44_RegEx_PreisInEuro {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

//        s = "1,99 €";
        s = " ,99 €";
//        s = "1234,95 €";
        String patternEuro = "[0-9]+";
        String patternTrennzeichen = "[,]";
        String patternCent = "[0-9]{2}";
        String patternWaehrung = " ?€";
        pattern = patternEuro + patternTrennzeichen + patternCent + patternWaehrung;

        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);
    }
}
