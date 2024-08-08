package aufgaben.sequenzen;

/**
 * Monitor
 * <p>
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class monitor {
    public static void main(String[] args) {

        // Eingabe
        int pixel = 1280 * 1024; // = 1.310.720 Pixel
        int farbe = 16; // 16 Bit pro Pixel

        // Verarbeitung
        double ergebnisPixelFarbe = pixel * farbe; //  = 20.971.520 Byte

        // Ausgabe
        System.out.printf("Benötigter Speicherplatz: %.1f MB", ergebnisPixelFarbe / 1024 / 1024 / 8);
    }
}
