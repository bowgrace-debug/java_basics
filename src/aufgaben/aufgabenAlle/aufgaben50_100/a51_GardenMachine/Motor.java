package aufgaben.aufgabenAlle.aufgaben50_100.a51_GardenMachine;

/**
 * Motor
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Motor {

    private double displacement;
    private String typ;
    private String fuel;
    private double enginePerformance;

    public Motor(double displacement, String typ, String fuel, double enginePerformance){
        setDisplacement(displacement);
        setTyp(typ);
        setFuel(fuel);
        setEnginePerformance(enginePerformance);
    }

    public double getDisplacement() {
        return displacement;
    }
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getEnginePerformance() {
        return enginePerformance;
    }
    public void setEnginePerformance(double enginePerformance) {
        this.enginePerformance = enginePerformance;
    }

    public String outputMotor(){
        return String.format("\nDisplacement: %.1f ccm\nTyp: %s\nFuel: %s\nEngine performance: %.1f PS\n", getDisplacement(), getTyp(), getFuel(), getEnginePerformance());
    }

    public String outputLine(){
        return "\n=================================================\n";
    }
}
