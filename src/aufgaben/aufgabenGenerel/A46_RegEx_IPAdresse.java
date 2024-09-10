package aufgaben.aufgabenGenerel;

/**
 * A46_RegEx_IPAdresse
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A46_RegEx_IPAdresse {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

        s = "127.0.0.1"; // true
        s = "255.255.255.255"; // true
//        s = "256.0.0.0"; // false
        pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        
        matched = s.matches(pattern);
        System.out.printf("%-15s %-35s %b\n", s,pattern,matched);
    }
}
