package aufgaben;

/**
 * A29_Rechteck
 * <p>
 *
 * @author Maximilian Stolle
 * @version 27.08.2024
 */
public class A29_Rechteck {

    static double flaeche (double a, double b) {
        double ergebnisflaeche = a * b;
        return ergebnisflaeche;
    }
    static double umfang (double a, double b) {
        double ergebnisumfang = (a + b) + (a + b);
        return ergebnisumfang;
    }
    static void ausgbe (double flaeche, double umfang) {
        System.out.printf("Die Fläche beträgt: %.1f Quadratmeter.\nDer Umfang beträgt: %.1f Meter.", flaeche, umfang);
    }

    public static void main(String[] args) {

        double flaeche = flaeche(3,4);
        double umfang = umfang(3,4);
        ausgbe(flaeche, umfang);
    }
}
