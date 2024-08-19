package aufgaben;

/**
 * A20_Zahlensysteme
 * <p>
 *
 * @author Maximilian Stolle
 * @version 19.08.2024
 */
public class A20_Zahlensysteme {
    public static void main(String[] args) {

        // Dezimal zu Binär
        int x = 211;

        while (x > 0) {
            System.out.print(x % 2);
            x /= 2;
        }

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        // Binär zu Dezimal
        String zahl = "11010011"; // Eingabe als String
        int laenge = zahl.length() -1; // Zählt von hinten
        int value = 0; // Speichert den aktuellen character wert als int
        int hoch = 0; // Zählt den hoch"^" counter hoch
        int ergebnis = 0; // Speichert das Ergebnis zwischen


        for (int i = laenge; i >= 0; i -=1) {
                 value = Character.getNumericValue(zahl.charAt(i));

//                 1 = 1 * 1
//            2 = 1 * 2

            ergebnis += value *Math.pow(2,hoch);
            hoch++;
        }
        System.out.println(ergebnis);
    }
}
