package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A38_RegEx_Binär
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A37_RegEx_Binär {
    public static void main(String[] args) {

        boolean matched;

        String s = "10101";

        String pattern = "[01]{5}";

        matched = s.matches(pattern);
        System.out.printf("%-15s%-15s %b\n", s,pattern,matched);

    }
}
