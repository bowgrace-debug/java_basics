package aufgaben.aufgaben_wiederholungen;

/**
 * zwischenraeume
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class zwischenraeume {
    public static void main(String[] args) {

        String txt = "Ein Text ist ein String und dieser ist eine Zeichenkette";

        int laenge = txt.length();
        int i = 0;
        int counter = 0;

        while (i < laenge) {
            switch (txt.charAt(i)) {
                case (' '):
                    counter++;
            }
            i++;
        }
        System.out.println(counter);
    }
}
