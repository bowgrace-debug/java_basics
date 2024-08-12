package aufgaben;

/**
 * A03_Speicherbedarf_01
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.08.2024
 */
public class A04_Speicherbedarf_01 {
    public static void main(String[] args) {

        // Eingabe
        double height = 1280;
        double width = 1024;
        int farbTiefe = 2; // 2 Byte = 16 Bit

        // Verarbeitung
        double layout = height * width;
        double bytes = layout * farbTiefe;

        double aufSpeichergroesseMiB = bytes / 1024 / 1024; // Kib - MiB
        double aufSpeichergroesseMB = bytes / 1000 / 1000; // KB - MB

        String ausgabe = String.format(
                "Der mindestens benötigte Speicherplatz sind %.2f MB\n" +
                        "Das sind genau %.2f MiB",
                aufSpeichergroesseMB, aufSpeichergroesseMiB);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
