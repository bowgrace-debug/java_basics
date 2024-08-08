package sprachkern;

/**
 * Mathe - die Klasse Math
 * <p>
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class Mathe {
    public static void main(String[] args) {
        // Beispiel: Wurzel
        double x = 144.0;
        double wurzel = Math.sqrt(x);
        System.out.println(wurzel);

        // Beispiel: Konstanten
        System.out.println(Math.PI);

        // Beispiel: Zufallszahl
        x = Math.random(); // 0...0.7388...git
        System.out.println(x);

        // Beispiel: Würfel
//        int wuerfel = (int)Math.random()* 6 + 1; // an der richtigen stelle casten
        int wuerfel = (int)(Math.random()* 6.0 + 1.0);
        System.out.println(wuerfel);
    }
}
