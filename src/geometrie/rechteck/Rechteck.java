package geometrie.rechteck;

/**
 * Rechteck
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Rechteck {

    // Instanzvariablen
    private int seitenLaengeA;
    private int seitenLaengeB;

    public int umfang() {
        return 2 * seitenLaengeA + 2 * seitenLaengeB;
    }
    public int flaeche() {
        return seitenLaengeA * seitenLaengeB;
    }
    /*
        Getter und Setter
    */
    public void setSeitenLaengeA(int seitenLaengeA) {
        if (seitenLaengeA > 0) {
            this.seitenLaengeA = seitenLaengeA;
        }
        else {
            throw new IllegalArgumentException("Die Seitenlänge muss größer als 0 sein du HONK!");
        }
    }
    public int getSeitenLaengeA() {
        return seitenLaengeA;
    }
    public void setSeitenLaengeB(int seitenLaengeB) {
        if (seitenLaengeB > 0) {
            this.seitenLaengeB = seitenLaengeB;
        }
    }
    public int getSeitenLaengeB() {
        return seitenLaengeB;
    }
}