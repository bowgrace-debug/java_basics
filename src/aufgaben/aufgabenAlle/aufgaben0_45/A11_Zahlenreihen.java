package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A11_Zahlenreihen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class A11_Zahlenreihen {
    public static void main(String[] args) {

        int x = 3;
        while (x <= 19) {
            System.out.print(x +" ");
            x += 4;
        }

        System.out.println();

        int y = 8;
        while (y <= 256) {
            System.out.print(y +" ");
            y *= 2;
        }

        System.out.println();

        int z = 243;
        while (z >= 3) {
            System.out.print(z +" ");
            z /= 3;
        }

        System.out.println();

        int a = 3;
        while (a != -4) {
            System.out.print(a + " ");
            a -= 1;
        }

        System.out.println();

        int b = 1;
        while (b <= 7 ) {
                System.out.print(b % 2);
            b++;
        }
    }
}
