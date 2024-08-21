package Arrays;

/**
 * Test
 * <p>
 *
 * @author Maximilian Stolle
 * @version 20.08.2024
 */
public class Arrays2_0 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int result = 0;

        //Ausgabe des Arrays mit einer normalen for-schleife
        System.out.println("\nAusgabe des Arrays mit einer normalen for-schleife");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Der Zahlenwert ist: " + numbers[i]);
        }

        //Ausgabe der Arrays mit der erweiterten for-schleife
        System.out.println("\nAusgabe der Arrays mit der erweiterten for-schleife");
        for (int item : numbers) {
            System.out.println("Der Zahlenwert ist: " + item);
        }

        //Summe Array-Elemente mit erweiterter for-schleife
        System.out.println("\n Summe Array-Elemente mit erweiterter for-schleife");
        for (int i : numbers) {
            result += i;
        }
        System.out.println("Die Summe ist: " + result);
    }
}
