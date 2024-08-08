package konsole;

/**
 * Ausgabe
 *
 * @author Maximilian Stolle
 * @version 06.08.2024
 */
public class Ausgabe {
    public static void main(String[] args) {
        //Ausgabe mit Zeilenumbruch
        System.out.println("Text 1");
        System.out.println("Text 2");
        System.out.println("Text 3");
        System.out.println("Hello, World!");

        // Ausgabe ohne Zeilenumbruch
        System.out.print("Text 4");
        System.out.print("Text 5");

        // Escape Sequence
        System.out.print("Text \6\nText7\n");
        System.out.print("Text 8\tText9\n");
        System.out.print("");

        //Zeilenumbruch
        System.out.println();
    }
}
