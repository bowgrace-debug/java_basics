package aufgaben;/**
*A00_Sekunden
*<p>
*@author Maximilian Stolle
*@version 11.08.2024
*/
public class A01_Sekunden {
    public static void main(String[] args) {

        // Eingabe
        double sekunden = 210;

        // Verarbeitung
        double minuten = sekunden / 60;
        String ausgabe = String.format(
                " %.0f Sekunden sind gleich %.1f Minuten",
                sekunden, minuten);

        // Ausgabe
        System.out.println(ausgabe);
    }
}
