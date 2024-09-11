package aufgaben.aufgabenAlle.aufgaben0_45.aufgaben32_36.a35_Farben.versionNew;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Main {
    public static void main(String[] args) {
        Color orange = new Color();

        orange.setRed(255);
        orange.setGreen(165);
        orange.setBlue(165);

        System.out.println(orange.asHexString());

        Color pink = new Color();
        try {
            pink.setRgb(-250, 50, 147);
        }
        catch (IllegalArgumentException e) {
            System.err.println("FEHLER: " + e.getMessage());
        }
        Color grey = new Color();
        grey.setGrey(50);

        System.out.println(grey.getRed());

    }
}
