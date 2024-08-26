package aufgaben.aufgaben_wiederholungen;

/**
 * jedenzweiten
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class jedenzweiten {
    public static void main(String[] args) {

        String txt = "mgajyk rtth eu isoopu racyev nbzet twqi tfhc eyaowue";
        int laenge = txt.length();
        int i = 0;

        while (i < laenge) {
            System.out.print(txt.charAt(i));
            i +=2;
        }

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        for (i = 0; i < laenge; i +=2) {
            System.out.print(txt.charAt(i));
        }
    }
}
