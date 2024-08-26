package aufgaben.aufgaben_wiederholungen;

/**
 * umlaute
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class umlaute {
    public static void main(String[] args) {

        String txt = "Übel wütet der kahlköpfige Gürtelwürger";

        txt = txt.toLowerCase();
        int laenge = txt.length(); // 39
        int i = 0;
        int cntAe = 0;
        int cntOe = 0;
        int cntUe = 0;

        while (i < laenge) {
            if (txt.charAt(i) == 'ä') {
                cntAe += 1;
            }
            else {
                if (txt.charAt(i) == 'ö') {
                    cntOe += 1;
                }
                else {
                    if (txt.charAt(i) == 'ü') {
                        cntUe += 1;
                    }
                }
            }
            i++;
        }
        System.out.println(cntAe + " x Ä");
        System.out.println(cntOe + " x Ö");
        System.out.println(cntUe + " x Ü");
    }
}

