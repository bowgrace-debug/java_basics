package aufgaben.aufgabenAlle.aufgaben50_100.a51_GartenmaschinenAlt;

/**
 * GardenMachine
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class GardenMachine {

    private double cuttingWidth;
    private double collectionBag;
    private double noiseLevel;

    public GardenMachine(double cuttingWidth, double collectionBag, double noiseLevel){
        setCuttingWidth(cuttingWidth);
        setCollectionBag(collectionBag);
        setNoiseLevel(noiseLevel);
    }

    public double getCuttingWidth() {
        return cuttingWidth;
    }
    public void setCuttingWidth(double cuttingWidth) {
        this.cuttingWidth = cuttingWidth;
    }

    public double getCollectionBag() {
        return collectionBag;
    }
    public void setCollectionBag(double collectionBag) {
        this.collectionBag = collectionBag;
    }

    public double getNoiseLevel() {
        return noiseLevel;
    }
    public void setNoiseLevel(double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public String outputGardenMachine(){
        return String.format("\nGardenmachine:\nCutting width: %.1f cm\nCollectionbag: %.1f L\nNoiselevel: %.1f db(A)\n", getCuttingWidth(), getCollectionBag(), getNoiseLevel());
    }
}
