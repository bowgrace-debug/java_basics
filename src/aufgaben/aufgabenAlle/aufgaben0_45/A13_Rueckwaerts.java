package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A13_Rueckwaerts
 * <p>
 *
 * @author Maximilian Stolle
 * @version 14.08.2024
 */
public class A13_Rueckwaerts {
    public static void main(String[] args) {

        String text = "Ein beliebiger Text";
        int laenge = text.length();
        int i = laenge -1;

        while(i >= 0) {
            System.out.println(text.charAt(i));
            i--;
        }

        System.out.println();
        System.out.println("========================");
        System.out.println();

        String name = "Maximilian Stolle";
        int stellenAlsZahl = name.length();
        int index = 0;
        while(index < 17) {
            System.out.println(name.charAt(index));
            index++;
        }

        System.out.println();
        System.out.println("========================");
        System.out.println();

        String fullname = "Maximilian Stolle";
        int laengeString = fullname.length();
        int stelleString = laengeString -1;

        while (stelleString >= 0) {
            System.out.println(fullname.charAt(stelleString));
            stelleString--;
        }
    }
}
