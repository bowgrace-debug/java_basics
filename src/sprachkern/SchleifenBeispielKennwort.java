package sprachkern;

import java.util.Scanner;

/**
 * SchleifenBeispielKennwort
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.08.2024
 */
public class SchleifenBeispielKennwort {
    public static void main(String[] args) {

        final String KENNWORT = "r2d2";
        final int MAX_VERSUCHE = 3;
        String eingabe;
        int versuche = 0;
        boolean kennwortrichtig = false;

        Scanner scanner = new Scanner (System.in);

        do {
            versuche++;
            System.out.print(versuche + ". Kennwort: ");
            eingabe = scanner.nextLine();
            kennwortrichtig = eingabe.equals(KENNWORT);
            if (!kennwortrichtig) {
                System.out.println("falsch!");
            }
        }while (!kennwortrichtig && versuche < MAX_VERSUCHE);

        if (kennwortrichtig) {
            System.out.println("Willkommen!");
        }
        else {
            System.out.println("3 mal falsch eingegeben du DEPP!");
        }
    }
}
