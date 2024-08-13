package sprachkern;

/**
 * Fallauswahl
 * <p>
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class Fallauswahl {
    public static void main(String[] args) {

        /*
            Beispiel 1
        */

        int x = 5;

        switch (x) {
            case 3:
                System.out.println("drei");
                break;
            case 5:
            case 8:
                System.out.println("fünf oder acht");
                break;
            case 4711:
                System.out.println("Viertausendsiebenhunderelf");
                break;
            default:
                System.err.println("unbekannte Zahl!");
                break;
        }

        /*
               Beispiel: Noten
        */

        int note = 1;
        switch (note) {
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("ausreichend");
                break;
            case 5:
                System.out.println("mangelhaft");
                break;
            case 6:
                System.out.println("ungenügend");
                break;
            default:
                System.err.println("Die Note konnte nicht berechnet werden");
                break;
        }

    }
}
