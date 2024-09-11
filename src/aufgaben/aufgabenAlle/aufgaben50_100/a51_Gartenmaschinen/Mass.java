package aufgaben.aufgabenAlle.aufgaben50_100.a51_Gartenmaschinen;

/**
 * Mass
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Mass {

    private double height;
    private double width;
    private double length;

    public Mass(double height, double width, double length){
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String outputMass(){
        return String.format("\nMass:\nHeight: %.1f\nWidth: %.1f\nLength: %.1f\n", getHeight(), getWidth(), getLength());
    }
}
