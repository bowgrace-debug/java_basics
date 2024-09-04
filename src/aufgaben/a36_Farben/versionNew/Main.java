package aufgaben.a36_Farben.versionNew;

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
        pink.setRgb(250,50,147);

        Color grey = new Color();
        grey.setGrey(50);

        System.out.println(grey.getRed());

    }
}