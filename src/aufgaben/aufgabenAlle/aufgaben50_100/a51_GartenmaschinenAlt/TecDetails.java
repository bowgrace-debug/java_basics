package aufgaben.aufgabenAlle.aufgaben50_100.a51_GartenmaschinenAlt;

/**
 * TecDetails
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class TecDetails {

    private double displacement;
    private String fuel;
    private String typ;
    private double enginePerformance;
    private String name;

    public TecDetails(double displacement, String fuel, String typ, double enginePerformance, String name){
        setDisplacement(displacement);
        setFuel(fuel);
        setTyp(typ);
        setEnginePerformance(enginePerformance);
        setName(name);
    }

    public double getDisplacement() {
        return displacement;
    }
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getEnginePerformance() {
        return enginePerformance;
    }
    public void setEnginePerformance(double enginePerformance) {
        this.enginePerformance = enginePerformance;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String outputTecDetails(){
        return String.format("\nTecDetails:\nName: %s\nDisplacement: %.1f ccm\nFuel: %s\nTyp: %s\nEngine performance: %.1f hp\n",getName(), getDisplacement(), getFuel(), getTyp(), getEnginePerformance());
    }

    public String outputline(){
        return "\n=========================================\n";
    }
}
