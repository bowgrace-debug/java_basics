package aufgaben.a36_Farben.versionMe;

/**
 * Farben
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Farben {
    private int red;
    private int green;
    private int blue;

    public void setFarben(int red, int green, int blue) {
        setBlue(blue);
        setRed(red);
        setGreen(green);
    }

    public void setRed(int red) {
        if (red <= 255 && red >= 0) {
            this.red = red;
        }
    }

    public int getRed() {
        return red;
    }


    public void setGreen(int green) {
        if (green <= 255 && green >= 0) {
            this.green = green;
        }
    }

    public int getGreen() {
        return green;
    }


    public void setBlue(int blue) {
        if (blue <= 255 && blue >= 0) {
            this.blue = blue;
        }
    }

    public int getBlue() {
        return blue;
    }

}
