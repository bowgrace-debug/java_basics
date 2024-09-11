package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A41_RegEx_EInGroßUndEN
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A40_RegEx_EInGroßUndEN {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

//        s = "Tannen";
        s = "Hansen";
        pattern = "[A-Z]{1}[a-z]*[en]";

        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);
    }
}
