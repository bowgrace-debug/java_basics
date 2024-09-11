package aufgaben.aufgabenAlle.aufgaben46_50.a50_horse;

/**
 * Sattel
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Sattel {

    private String material;
    private double gewicht;

    public Sattel(String material, double gewicht, String groesse){
        setMaterial(material);
        setGewicht(gewicht);
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String ausgabeSattel(){
        return String.format("Dazu gibt es einen Sattel, welcher folgende Eigenschaften hat:\nMaterial: %s\nGewicht: %.1f\n", getMaterial(), getGewicht());
    }
}
