package aufgaben.aufgabenGenerel;

/**
 * A15_Zwischenraueme
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class A15_Zwischenraueme {
    public static void main(String[] args) {

        // while Schleife

        String txt = "Ein Text ist ein String ist eine Zeichenkette";
        int laenge = txt.length();
        int i = 0;
        int counter = 0;

        while (i < laenge) {
            switch (txt.charAt(i)) {
                case (' '):
                    counter++;
                    break;
            }
            i++;
        }
        System.out.printf("Es kommen insgesamt %d Leerzeichen im String vor.\n", counter);

        System.out.println();
        System.out.println("================");
        System.out.println();

        // for Schleife

        counter = 0;

        for (i = 0; i < laenge; i++) {
            switch (txt.charAt(i)) {
                case (' '):
                    counter++;
                    break;
            }
        }
        System.out.printf("Es kommen insgesamt %d Leerzeichen im String vor.\n", counter);
    }
}