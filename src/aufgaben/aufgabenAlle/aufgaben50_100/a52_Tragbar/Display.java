package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * Display
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class Display {

    // local variable
    private double size;
    private String resolution;

    // Constructor
    public Display(double size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    // Getter & Setter
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Output
    public String outputDisplay(){
        return String.format("\nSize: %.1f cm\nResolution: %s px\n", getSize(), getResolution());
    }
}
