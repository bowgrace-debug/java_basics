package aufgaben.aufgabenAlle.aufgaben0_45;

/**
 * A14_UmlauteZaehlen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 14.08.2024
 */
public class A14_UmlauteZaehlen {
    public static void main(String[] args) {

        // Lösung 1

        String text = "Übel wütet der kahlköpfige Gürtelwürger";
        text = text.toLowerCase();
        int laenge = text.length();
        int i = 0;
        int counterAe = 0;
        int counterOe = 0;
        int counterUe = 0;

        while (i < laenge) {
            if (text.charAt(i) == 'ä') {
                counterAe += 1;
            }
            else {
                if (text.charAt(i) == 'ö') {
                    counterOe += 1;
                }
                else {
                    if (text.charAt(i) == 'ü') {
                        counterUe += 1;
                    }
                }
            }
            i++;
        }
        System.out.println("Das 'ä' kommt " + counterAe + " mal vor");
        System.out.println("Das 'ö' kommt " + counterOe + " mal vor");
        System.out.println("Das 'ü' kommt " + counterUe + " mal vor");


        System.out.println();
        System.out.println("========================");
        System.out.println();


        // Lösung 2

        String text1 = "Übel wütet der kahlköpfige Gürtelwürger".toLowerCase();
        laenge = text1.length();
         i = 0;
         counterAe = 0;
         counterOe = 0;
         counterUe = 0;

         while (i < laenge) {
             switch (text.charAt(i)) {
                 case ('ä'):
                     counterAe++;
                     break;
                 case ('ö'):
                     counterOe++;
                     break;
                 case ('ü'):
                     counterUe++;
                     break;
             }
             i++;
         }
        System.out.println("Das 'ä' kommt " + counterAe + " mal vor");
        System.out.println("Das 'ö' kommt " + counterOe + " mal vor");
        System.out.println("Das 'ü' kommt " + counterUe + " mal vor");
    }
}
