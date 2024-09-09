package aufgaben.aufgabenGenerel;

/**
 * A43_RegEx_Uhrzeit
 * <p>
 *
 * @author Maximilian Stolle
 * @version 09.09.2024
 */
public class A43_RegEx_Uhrzeit {
    public static void main(String[] args) {
        String s;
        String pattern;
        boolean matched;

        s = "00:00:00"; // true
//        s= "23:60:59"; //false
//        s = "23:59:59";
//        pattern = "([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        String patternStunde = "([01][0-9]|2[0-3])";
        String patternMinute = "[0-5][0-9]";
        String patternSekunde = "[0-5][0-9]";
        pattern = patternStunde + ":" + patternMinute + ":" + patternSekunde;
        matched = s.matches(pattern);
        System.out.printf("%-15s%-35s %b\n", s,pattern,matched);
    }
}
