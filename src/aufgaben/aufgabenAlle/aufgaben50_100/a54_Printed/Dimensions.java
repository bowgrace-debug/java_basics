package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;

/**
 * Dimensions
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public class Dimensions {

    private double height;
    private double width;

    public Dimensions(double height, double width){
        setHeight(height);
        setWidth(width);
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

    public String asString(){
        return String.format("\nDimensions:\nHeight: %.1f cm\nWidth: %.1f cm", getHeight(), getWidth());
    }
}
