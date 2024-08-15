package aufgaben.aufgabenNico;

/**
 * AE15_learn
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class AE15_learn {
    public static void main(String[] args) {
        String zeichenkette = "AaaAaaAabAbaaBbaBabbBabBaaAbAaAAA";
        int laenge = zeichenkette.length();
        int i = 0;
        int counterAA = 0;
        int counterAb = 0;
        int counterAa = 0;

        while (i < laenge) {
            if (i + 1 < laenge) {
                if (zeichenkette.charAt(i) == 'A' && zeichenkette.charAt(i + 1) == 'A') {
                    counterAA++;
                }
                if (zeichenkette.charAt(i) == 'A' && zeichenkette.charAt(i + 1) == 'b') {
                    counterAb++;
                }
                if (zeichenkette.charAt(i) == 'A' && zeichenkette.charAt(i + 1) == 'a') {
                    counterAa++;
                }
            }
            i++;
        }
        System.out.println("Die Buchstaben 'AA' kommen " + counterAA + " mal vor.");
        System.out.println("Die Buchstaben 'Ab' kommen " + counterAb + " mal vor.");
        System.out.println("Die Buchstaben 'Aa' kommen " + counterAa + " mal vor.");
    }
}