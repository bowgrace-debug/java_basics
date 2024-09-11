package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A45_RegEx_BetragTausender
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A44_RegEx_BetragTausender {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

//        s = "0,12"; // true
        s = "12.345"; // true
//        s = "12345.67"; // false
//        s = "12345,678"; // false
        pattern = "[0-9]{1,3}(.[0-9]{3})*(,[0-9]{2})?";
//        String patternEuro = "[0-9]{1,3}(.[0-9]{3})*";
//        String patternCent = "(,[0-9]{2})?";
//        pattern = patternEuro + patternCent;

        matched = s.matches(pattern);
        System.out.printf("%-5s %-25s %b\n", s,pattern,matched);
    }
}
