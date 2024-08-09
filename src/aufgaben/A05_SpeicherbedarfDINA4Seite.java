package aufgaben;

/**
 * dina4seite
 * <p>
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class A05_SpeicherbedarfDINA4Seite {
    public static void main(String[] args) {

        // Eingabe
        int dinA4Seiten = 100; // Anzahl an Dokumenten
        double dinA4BreiteInInch = 21 / 2.54; // Höhe y
        double dinA4LaengeInInch = 29.7 / 2.54; // Länge x
        int bytes = 2; // 16 Bit
        int scannerDPI = 600 * 600; // DIP

        // Verarbeitung
        double layoutDinA4ToInch = dinA4BreiteInInch * dinA4LaengeInInch;
        double inchMalDIP = layoutDinA4ToInch * scannerDPI;
        double dpiMalBytes = inchMalDIP * bytes;
        double bytesMalDokumente = dpiMalBytes * dinA4Seiten;

        // Ausgabe
        System.out.printf("Der Speicherbedarf beträgt: %.2f GiB\n", bytesMalDokumente / 1024 / 1024 / 1024);
        System.out.printf("Der Speicherbedarf beträgt: %.2f GB\n", bytesMalDokumente / 1000 / 1000 / 1000);

    }
}
