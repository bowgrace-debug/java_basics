package aufgaben.sequenzen;

/**
 * dina4seite
 * <p>
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class Din_a4seite {
    public static void main(String[] args) {

        // Eingabe
        int dinA4Seiten = 100;
        double dinA4BreiteInInch = 21 / 2.54;
        double dinA4LaengeInInch = 29.7 / 2.54;
        int bytes = 2; // 16 Bit
        int scannerDPI = 600 * 600;

        // Verarbeitung
        double layoutDinA4ToInch = dinA4BreiteInInch * dinA4LaengeInInch;
        double inchMalDIP = layoutDinA4ToInch * scannerDPI;
        double dpiMalBytes = inchMalDIP * bytes;
        double bytesMalDokumente = dpiMalBytes * dinA4Seiten;

        // Ausgabe
        System.out.printf("Speicherbedarf: %.2f GiB", bytesMalDokumente / 1024 / 1024 / 1024);

    }
}
