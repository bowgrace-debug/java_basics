package aufgaben.aufgabenGenerel;

/**
 * A39_RegEx_Hex
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A39_RegEx_Hex {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

        s = "Ff7bc8";
        pattern = "[A-Z|a-z|1-9]{6}";

        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);
    }
}
