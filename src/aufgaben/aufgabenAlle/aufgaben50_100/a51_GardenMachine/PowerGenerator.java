package aufgaben.aufgabenAlle.aufgaben50_100.a51_GardenMachine;

/**
 * PowerGenerator
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class PowerGenerator {

    private double weight;
    private double maxPower;
    private String name;

    public PowerGenerator(double weight, double maxPower, String name) {
        setWeight(weight);
        setMaxPower(maxPower);
        setName(name);
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxPower() {
        return maxPower;
    }
    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String outputPower(){
        return String.format("\nName: %s\nWeight: %.1f kg\nMax power: %.1f Watt\n",getName(), getWeight(), getMaxPower());
    }
}
