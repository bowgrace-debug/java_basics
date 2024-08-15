package aufgaben.aufgabenNico;

/**
 * AE05_Einwohnerzahlen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class AE05_Einwohnerzahlen {
    public static void main(String[] args) {

        int einwohner = 1000;
        int jahr = 0;
        double zuwachs = 1.02;

        while(einwohner < 10_000) {
            einwohner *= zuwachs;
            jahr++;
        }
        System.out.printf(
                "Es braucht %d Jahre bis die Einwohnerzahl 10.000 erreicht.\n" +
                "Genau sind es: %,d Einwohner.",
                jahr, einwohner);
    }
}
