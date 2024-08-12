package sprachkern;

/**
 * Verzweigungen
 * <p>
 *
 *     pseudocode:
 *       WENN bedingung
 *       DANN anweisung
 *       SONST anweisung
 * <p>
 *     Java Syntax:
 *        if (bedingung)
 *              Eine Anweisung oder ein Anweisungsblock {}
 *       [else
 *              Eine Anweisung oder ein Anweisungsblock {}]
 * <p>
 *       Wahrheitswerte
 *          true (wahr)
 *          false (false)
 * <p>
 *       Vergleichsoperatoren
 *          < kleiner als
 *          <= kleiner oder gleich
 *          > größer als
 *          >= größer oder gleich
 *          == gleich
 *          != nicht gleich
 * <p>
 *       Logische Operatoren (Short Circuit)
 *           &&  und (and)
 *              true  = true  && true
 *              false = false && true
 *              false = true  && false
 *              false = false && false
 * <p>
 *           ||  oder (or)
 *              true  = true  || true
 *              true  = false || true
 *              true  = true  || false
 *              false = false || false
 * <p>
 *           !   nicht (not)
 *             false = !true
 *             true  = !false
 *
 *          ^  exclusives oder (xor)
 *               false = true ^ true
 *               ture = false ^ true
 *               true = true ^ false
 *               flase = flase ^ flase
 *
 *
 * @author Maximilian Stolle
 * @version 09.08.2024
 */
public class Verzweigungen {
    public static void main(String[] args) {
        int x = 75;

        if (x > 50) {
            System.out.println("Wahr");
            System.out.println("===");
        }
        else {
            System.out.println("Unwahr");
        }
        System.out.println("danach");
    }
}
