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
    private double akkuRunTime;
    private int capacity;

    // Constructor
    public Akku(double akkuRunTime, int capacity){
        setAkkuRunTime(akkuRunTime);
        setCapacity(capacity);
    }

    // Getter & Setter
    public double getAkkuRunTime() {
        return akkuRunTime;
    }
    public void setAkkuRunTime(double akkuRunTime) {
        this.akkuRunTime = akkuRunTime;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Output
    public String outputAkku(){
        return String.format("\nAkku:\nAkku runtime %.1f hours\nCapacity: %d Wh\n", getAkkuRunTime(), getCapacity());
    }
}
