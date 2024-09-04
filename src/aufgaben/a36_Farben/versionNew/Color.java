package aufgaben.a36_Farben.versionNew;

/**
 * Color
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Color {
    private int red;
    private int green;
    private int blue;

    public void setRgb(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public void setGrey(int percent) {
        int value = ((percent * 255) / 100);
        setRgb(value, value, value);
    }

    public String asHexString() {
        return String.format("%02x %02x %02x", red, green, blue);
    }

    public boolean isColorsChannel(int value) {
        return value >= 0 && value <= 255;
    }

    public void setRed(int red) {
        if (isColorsChannel(red)) {
            this.red = red;
        }
    }
    public int getRed() {
        return red;
    }

    public void setGreen(int green) {
        if (isColorsChannel(green)) {
            this.green = green;
        }
    }

    public void setBlue(int blue) {
        if (isColorsChannel(blue)) {
            this.blue = blue;
        }
    }
}
