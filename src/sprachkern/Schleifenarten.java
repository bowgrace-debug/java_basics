package sprachkern;

/**
 * Schleifenarten
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class Schleifenarten {
    public static void main(String[] args) {

        /*
            while
        */

        int i = 1;
        while(i <= 5) {
            System.out.printf("%d ",i);
            i++;
        }
        System.out.println();


        /*
               do while

               - fußgesteuerte oder annehmende Schleife
               - wird mindestens einmal ausgeführt
               - eine einzelne Anweisung oder ein Anwendungsblock
        */

        int b = 1;
        do {
            System.out.printf("%d ", b);
            b++;
        } while (b <= 5);

        System.out.println();


        /*
            for

            Syntax:
                for ( Initialisierung ; Abbruchbedienung ; Veränderung)
        */

        for (i = 1; i<= 5; i++) {
            System.out.printf("%d ",i);
        }
    }
}
