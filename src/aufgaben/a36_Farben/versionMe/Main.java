package aufgaben.a36_Farben.versionMe;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Farben rgb = new Farben();

        rgb.setFarben(255,50,75);

        System.out.printf("Blue = %d\n", rgb.getBlue());
        System.out.printf("Green = %d\n", rgb.getGreen());
        System.out.printf("Red = %d\n", rgb.getRed());
    }
}
