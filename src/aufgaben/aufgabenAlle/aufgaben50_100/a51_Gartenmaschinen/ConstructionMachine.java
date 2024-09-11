package aufgaben.aufgabenAlle.aufgaben50_100.a51_Gartenmaschinen;

/**
 * ConstructionMachine
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class ConstructionMachine {

    private double maxPerfomance;
    private double weight;

    public ConstructionMachine(double maxPerfomance, double weight){
        setMaxPerfomance(maxPerfomance);
        setWeight(weight);
    }

    public double getMaxPerfomance() {
        return maxPerfomance;
    }
    public void setMaxPerfomance(double maxPerfomance) {
        this.maxPerfomance = maxPerfomance;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String outputConstructionMachine(){
        return String.format("\nConstructionMachine:\nMax. perfomance: %.1f Watt\nWeight: %.1f kg\n", getMaxPerfomance(), getWeight());
    }
}
