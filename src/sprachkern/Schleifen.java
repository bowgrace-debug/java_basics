package sprachkern;

/**
 * Schleifen / Wiederholungen / Iterationen /Loops
 * <p>
 *
 *     Eine Schleife ist eine Kontrollstruktur in Programmiersprachen,
 *     Sie wiederholt eine Anweisung oder einen Anweisungs-Block
 *     (den sogenannten Schleifenrumpf oder Schleifenkörper),
 *     solange die Schleifenbedingungen als Laufbedingung gültig bleibt.
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class Schleifen {
    public static void main(String[] args) {

        int x = -1;
        while (x < 5) {
            x++;
            System.out.print(x + " ");
        }

        System.out.println();

        /*
            Beispiel: 2 6 10 14 18
        */
        int y = 2;
        while (y <= 18) {
            System.out.print(y+ " ");
            y+= 4;
        }
    }
}
