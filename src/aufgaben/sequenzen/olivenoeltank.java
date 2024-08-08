package aufgaben.sequenzen;

/**
 * olivenoeltank
 * <p>
 *     Aufgabe in Teams drin
 *     Nochmal durchrechnen!
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class olivenoeltank {
    public static void main(String[] args) {

        // Eingabe
        double tankSizeWidth = 2.5 * 100 ; // Meter in Centimeter
        double dichteOlivenOel = 0.91; // cm³
        double fuellMenge = 240;// cm (2400mm)

        // Verarbeitung
        double volumen = Math.PI * ((tankSizeWidth / 2) * (tankSizeWidth / 2)) * fuellMenge ; // = 2.3561944901923448E7m³
        double dichteMenge = volumen * dichteOlivenOel / 1000;
        double literMenge = volumen * 0.001;

        // Ausgabe
        System.out.printf("Füllmenge vom Olivenöl in Liter: %,.3f l \n ", literMenge);
        System.out.printf("Füllmenge vom Olivenöl in Kilogramm: %,.3f kg \n", dichteMenge);

    }
}
