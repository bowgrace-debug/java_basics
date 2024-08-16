package aufgaben.aufgabenNico;

/**
 * AE06_LaengstesWort
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class AE06_LaengstesWort {
    public static void main(String[] args) {


        // Gebe das längste Wort aus dem Satz aus
        /*
            - Ich schaue zuerst nach dem Leerzeichen
            - Zählen von Leerzeichen zu beginn des ersten Wortes
            - brauche einen counter, welchen meinen höchsten Wert speichert
            - Dann schauen wo das Leerzeichen ist und nehme den index -1 und -1 var lastword
            - Dann überprüfen ob der tempCounter größer als der counter (Highscore)
            - Dann setzte ich das lastword zu index vom letzten zu wissenden space (lastword = i)
            - Dann gebe counter in der Konsole aus
        */

        String txt = "Das ist ein Beispieltext";


        int laenge = txt.length();
        int i = 0;
        int counter = 0;
        int tempCounter = 0;
        int lastword = 0;
        int nextword = 0;

        while( i > laenge) {
            if (txt.charAt(i) == ' ') {
                lastword = i -1;
                nextword = i +1;
            }
            i++;
        }
        System.out.println(lastword);
        System.out.println(nextword);
    }
}

