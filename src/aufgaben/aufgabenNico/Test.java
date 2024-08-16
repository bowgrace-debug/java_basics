package aufgaben.aufgabenNico;

/**
 * Test
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class Test {
    public static void main(String[] args) {

        // While

        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println();

        // do while

        i = 0;

        do {
            System.out.println(i);
            i++;
        }
        while (i <= 5);

        System.out.println();
        System.out.println("==============================");
        System.out.println();

//        einfache while-Schleife
//          Was könnte als Ausgabe bei folgendem Code in der Konsole stehen?

        int x = 10;
        while (x > 0) {
            System.out.println(" x=" + x);  // Anhaengen von x an den String
            x = x - 1;
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println();

//        for-Schleifen zum Zählen
//          Was könnte als Ausgabe bei folgendem Code in der Konsole stehen?

        System.out.println("erste for Schleife:");
        for (i = 1; i <= 10; i = i + 1) {
            System.out.print(" " + i);
        }
        System.out.println(); // Zeilenumbruch

        System.out.println("zweite for Schleife:");
        for (i = 1; i <= 10; i = i + 2) {
            System.out.print(" " + i);
        }
        System.out.println(); // Zeilenumbruch

        System.out.println("dritte for Schleife:");
        for (i = 1; i <= 10; i = i * 2) {
            System.out.print(" " + i);
        }
        System.out.println(); // Zeilenumbruch

        System.out.println();
        System.out.println("==============================");
        System.out.println();

//        for-Schleife und if-Bedingung
//          Was könnte als Ausgabe bei folgendem Code in der Konsole stehen?

        for (i = 1; i <= 10; i++) {
            if ((i % 2) == 0) { // % ist der Modulo-Operator
                System.out.println("Die Zahl " + i + " ist gerade.");
            }
        }
    }
}