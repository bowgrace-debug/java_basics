package geometrie.rechteck;

/**
 * Rechteck
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
class Rechteck {

    // Instanzvariablen
    int seitenLaengeA;
    int seitenLaengeB;

    int umfang() {
        return 2 * seitenLaengeA + 2 * seitenLaengeB;
    }
    int flaeche() {
        return seitenLaengeA * seitenLaengeB;
    }
}