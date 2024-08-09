package aufgaben;

/**
 * olivenoeltank
 * <p>g,jmfhdgnhf.kzh.k,jfhdgfsanjzrujkjred
 *
 * @author Maximilian Stolle
 * @version 08.08.2024
 */
public class A06_OlivenoelTank {
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
        System.out.printf("Füllmenge vom Olivenöl in\nLiter beträgt: %,.3f l \n ", literMenge);
        System.out.println(); // Absatz
        System.out.printf("Füllmenge vom Olivenöl in\nKilogramm beträgt: %,.3f kg \n", dichteMenge);

    }
}
