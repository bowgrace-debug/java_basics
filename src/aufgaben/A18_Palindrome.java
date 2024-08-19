package aufgaben;

import java.util.Scanner;

/**
 * A18_Palindrome
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.08.2024
 */

public class A18_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen String ein: ");
        String eingabe = scanner.nextLine().toLowerCase();

        int anfang = 0;
        int ende = eingabe.length() - 1;

        boolean istPalindrom = true;
        while (anfang < ende && istPalindrom == true) {
            if (eingabe.charAt(anfang) != eingabe.charAt(ende)) {
                istPalindrom = false;
            }
            anfang++;
            ende--;
        }

        if (istPalindrom) {
            System.out.println(eingabe + " ist ein Palindrom!");
        } else {
            System.out.println(eingabe + " ist kein Palindrom!");
        }
    }
}
