package sprachkern;

/**
 * Ausnahmen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 04.09.2024
 */
public class Ausnahmen {
    public static void main(String[] args) {

        String s = "4711";
        int x = 0;
        int[] feld = {8, 9 , 47};

        try {
            x = Integer.parseInt(s);
            feld[3] = 70;
            System.out.println(x);
        }
        catch (NumberFormatException e) {
            System.err.println("FEHLER: Das ist keine Zahl!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("FEHLER: ungültiger Index!");
        }
        finally { // wird immer ausgeführt
            System.out.println(x);
        }
    }
}
