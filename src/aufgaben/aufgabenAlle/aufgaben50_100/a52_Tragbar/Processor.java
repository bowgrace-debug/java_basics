package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * Processor
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class Processor {

    // local variable
    private String name;
    private String clockSpeed;

    // Constructor
    public Processor(String name, String clockSpeed){
        setName(name);
        setClockSpeed(clockSpeed);
    }

    // Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getClockSpeed() {
        return clockSpeed;
    }
    public void setClockSpeed(String clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    // Output
    public String outputProcessor(){
        return String.format("\nProcessor:\nName: %s\nClock speed: %s GHz\n", getName(), getClockSpeed());
    }
}
