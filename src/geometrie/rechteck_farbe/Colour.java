package geometrie.rechteck_farbe;

/**
 * Color
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        setRgb(red, green, blue);
    }

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
        else {
            throw new IllegalArgumentException("nur Rot-Werte zwischen 0 und 255 zugelassen!");
        }
    }
    public int getRed() {
        return red;
    }

    public void setGreen(int green) {
        if (isColorsChannel(green)) {
            this.green = green;
        }
        else {
            throw new IllegalArgumentException("nur Grün-Werte zwischen 0 und 255 zugelassen!");
        }
    }
    public int getGreen() {
        return green;
    }

    public void setBlue(int blue) {
        if (isColorsChannel(blue)) {
            this.blue = blue;
        }
        else {
            throw new IllegalArgumentException("nur Blau-Werte zwischen 0 und 255 zugelassen!");
        }
    }
    public int getBlue() {
        return blue;
    }
}
