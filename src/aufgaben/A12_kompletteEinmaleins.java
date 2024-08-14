package aufgaben;

/**
 * A12_kompletteEinmaleins
 * <p>
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class A12_kompletteEinmaleins {
    public static void main(String[] args) {

        // Aufgabe 1
        int a = 1;
        int mal5 = 5;
        while(a < 11) {
            System.out.println(a + " x 5 = " + a * mal5);
            a++;
        }

        System.out.println();

        // Aufgabe 2
        int b = 1;
        while (b <= 10) {
            int mal = 1;
            while (mal <= 10) {
                int ergebnis = b * mal;
                System.out.println(b + " x " + mal + " = " + ergebnis);
                mal++;
            }
            System.out.println();
            b++;
        }

        //Aufgabe 3
        int x = 1;
        int y = 1;

        System.out.print("\t");
        while (y <= 10) {
            int ergebnis = x * y;
            System.out.printf("%4d", ergebnis);
            y++;
        }
        System.out.println();
        while (x <= 10) {
            y = 1;
            System.out.printf("%4d",x);
            while (y <= 10) {
                int ergebnis = x * y;
                System.out.printf("%4d",ergebnis);
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
