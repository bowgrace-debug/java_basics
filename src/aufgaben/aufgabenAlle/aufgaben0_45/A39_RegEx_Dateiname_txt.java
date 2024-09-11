package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A40_RegEx_Dateiname_txt
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A39_RegEx_Dateiname_txt {
    public static void main(String[] args) {

        String s;
        String pattern;
        boolean matched;

        s = "datei.txt";
        pattern = ".*[.]txt";
        pattern = ".*[.]txt$"; // $ String ist zu Ende

        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);
    }
}
