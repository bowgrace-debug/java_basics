package aufgaben.aufgaben_wiederholungen;

/**
 * monitor
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class monitor {
    public static void main(String[] args) {

        // Eingabe
        double x = 1280;
        double y = 1024;
        double color = 2; // 2 Byte = 16 Bit

        // Verarbeitung
        double aufloesung = (x * y) * color;
        double aufSpeichergroesseMB = aufloesung / 1000 / 1000 / 1000; // KB - MB
        double aufSpeichergroesseMiB = aufloesung / 1024 /1024; // KiB - MiB

        String ausgabe = String.format(
                "Der benötigte Speicherplatz beträgt: %.1f MB.\nDas sind genau: %.1f MiB.",
                aufSpeichergroesseMB, aufSpeichergroesseMiB);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
