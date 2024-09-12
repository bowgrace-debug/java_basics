package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * HardDrive
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class HardDrive {

    // local variable
    private String typ;
    private int capacity;

    // Constructor
    public HardDrive(String typ, int capacity){
        setTyp(typ);
        setCapacity(capacity);
    }

    // Getter & Setter
    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Output
    public String outputHardDrive(){
        return String.format("\nHarddrive:\nType: %s\nCapacity: %d GB\n", getTyp(), getCapacity());
    }
}
