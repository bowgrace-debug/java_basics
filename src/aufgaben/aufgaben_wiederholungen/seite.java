package aufgaben.aufgaben_wiederholungen;

/**
 * seite
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class seite {
    public static void main(String[] args) {

        // Eingabe

        double scannerDPI = 600 * 600;
        double farbtiefe = 2; // 2 Bytes = 16 Bit
        double dinA4x = 21.0; // cm
        double dinA4y = 29.7; // cm
        double inch = 2.54; // cm
        double dokumente = 100;

        // Verarbeitung

        /*double layoutInInch = (dinA4x / inch) * (dinA4y / inch);
        double inchMalScanner = layoutInInch * scannerDPI;
        double malFarbtiefe = inchMalScanner * farbtiefe;
        double malDokumente = malFarbtiefe * dokumente;*/

        double nenner = (((((dinA4y / inch) * (dinA4x / inch)) * scannerDPI) * farbtiefe) * 100);

        double aufSpeichergroesseGB = nenner / 1000 / 1000 / 1000; // KB - MB - GB
        double aufSpeichergroesseGiB = nenner / 1024 / 1024 / 1024; // KiB - MiB - GiB

        String ausgabe = String.format(
                "Der Speicherbedarf liegt bei %.1f GB\nUnd genau sind es %.1f GiB",
                aufSpeichergroesseGB, aufSpeichergroesseGiB);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
