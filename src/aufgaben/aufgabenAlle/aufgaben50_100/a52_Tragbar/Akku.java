package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * Akku
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class Akku {

    // local variable
    private double akkuRuntime;
    private int capacity;

    // Constructor
    public Akku(double akkuRuntime, int capacity) {
        this.akkuRuntime = akkuRuntime;
        this.capacity = capacity;
    }

    // Getter & Setter
    public double getAkkuRuntime() {
        return akkuRuntime;
    }
    public void setAkkuRuntime(double akkuRuntime) {
        this.akkuRuntime = akkuRuntime;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Output
    public String outputAkku(){
        return String.format("\nAkku runtime: %.1f hours\nCapacity: %d Wh\n", getAkkuRuntime(), getCapacity());
    }
}
