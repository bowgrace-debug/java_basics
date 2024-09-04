package aufgaben.aufgabenGenerel;

/**
 * A04_Speicherbedarf_02
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.08.2024
 */
public class A05_Speicherbedarf_02 {
    public static void main(String[] args) {

        // Eingabe
        double scannerDPI = 600 * 600; // dpi
        double farbTiefe = 2; // 2 Byte = 16 Bit
        double height = 29.7; // cm
        double width = 21;  // cm
        double inch = 2.54; // cm
        double dokumente = 100; // Din-A-4 Seiten

        // Verarbeitung
        double nenner = (((((height /inch) * (width / inch)) * scannerDPI) * farbTiefe) * 100);

        double umrechnungGB = nenner / 1000 / 1000 / 1000; // KB - MB - GB
        double umrechnungGiB = nenner / 1024 / 1024 / 1000; // KiB - MiB - GiB

        String ausgabe = String.format(
                "Der benötigte Speicherplatz beträgt: %.2f GB. Das sind genau: %.2f GiB",
                umrechnungGB, umrechnungGiB);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
