package aufgaben;

/**
 * A17_TuerenVonDurin
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class A17_TuerenVonDurin {
    public static void main(String[] args) {

        // While Schleife

        String durin = "sprich freund und tritt ein";
        // Ergebnis: Sprich Freund Und Tritt Ein
        int laenge = durin.length();
        int i = 1;
        String output = "";

        output += durin.toUpperCase().charAt(0);
        while (i < laenge) {
            if (durin.charAt(i) == ' ') {
                output += " " + durin.toUpperCase().charAt(i + 1);
                i++;
            } else {
                output += durin.charAt(i);
            }
            i++;
        }
        System.out.println(output);

        System.out.println();
        System.out.println("============================");
        System.out.println();

        // While Schleife (-32)

        String txt = "sprich freund und tritt ein";
        // Ergebnis: Sprich Freund Und Tritt Ein
        laenge = txt.length();
        i = 1;
        output = "";

        int charAsInt = durin.charAt(0) - 32;
        char toUpperCase = (char) charAsInt;

        output += toUpperCase;
        while (i < laenge) {
            if (txt.charAt(i) == ' ') {
                charAsInt = durin.charAt(i + 1) - 32;
                toUpperCase = (char) charAsInt;
                output += " " +  toUpperCase;
                i++;
            } else {
                output += txt.charAt(i);
            }
            i++;
        }
        System.out.println(output);

        System.out.println();
        System.out.println("============================");
        System.out.println();

        //  for Schleife

        durin = "sprich freund und tritt ein";
        // Ergebnis: Sprich Freund Und Tritt Ein
        laenge = durin.length();
        output = "";

        output += durin.toUpperCase().charAt(0);
        for (i = 1; i < laenge; i++) {
            if (durin.charAt(i) == ' ') {
                output += " " + durin.toUpperCase().charAt(i + 1);
                i++;
            } else {
                output += durin.charAt(i);
            }
        }
        System.out.println(output);
    }
}
