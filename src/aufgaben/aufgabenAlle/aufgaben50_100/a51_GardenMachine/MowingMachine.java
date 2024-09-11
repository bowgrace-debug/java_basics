package aufgaben.aufgabenAlle.aufgaben50_100.a51_GardenMachine;

/**
 * MowingMachine
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class MowingMachine {

    private double cuttingWidth;
    private double collectBag;
    private Motor engine;
    private NoiseLevel noiseLevel;
    private String name;

    public MowingMachine(double cuttingWidth, double collectBag, Motor engine, double noiseLevel, String name){
        setCuttingWidth(cuttingWidth);
        setCollectBag(collectBag);
        setEngine(engine);
        setNoiseLevel(noiseLevel);
        setName(name);
    }

    public double getCuttingWidth() {
        return cuttingWidth;
    }
    public void setCuttingWidth(double cuttingWidth) {
        this.cuttingWidth = cuttingWidth;
    }

    public double getCollectBag() {
        return collectBag;
    }
    public void setCollectBag(double collectBag) {
        this.collectBag = collectBag;
    }

    public Motor getEngine() {
        return engine;
    }
    public void setEngine(Motor engine) {
        this.engine = engine;
    }

    public double getNoiseLevel() {
        return noiseLevel.getNoiseLevel();
    }
    public void setNoiseLevel(double noiseLevel) {
        this.noiseLevel = new NoiseLevel(96.0);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String outputMowing(){
        return String.format("\nName: %s\nCuttingwidth: %.1f cm\nCollectbag: %.1f L\nNoise level: %.1f db(A)\n",getName(), getCuttingWidth(), getCollectBag(),getNoiseLevel());
    }
}
