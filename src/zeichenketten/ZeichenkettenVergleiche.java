package zeichenketten;

/**
 * ZeichenkettenVergleiche
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.08.2024
 */
public class ZeichenkettenVergleiche {
    public static void main(String[] args) {

        /*
            Vergleich der Inhalte über die
                equals-Methoden (case-sensitive)
            oder
                equalsIgnoreCase (case-insensitive)
            boolean = s1.equals(s2)
            boolean = s1.equalsIgnoreCase(s2)
        */

        String txt1;
        String txt2;

        txt1  ="Moin";
        txt2 = "Mo";

        if (txt1 == txt2 + "in") {
            System.out.println("gleich");
        }
        else {
            System.out.println("ungleich");
        }

        System.out.println("==================");

        txt1  ="Moin";
        txt2 = "Moin";

        if (txt1 == txt2) { // vergleicht nicht txt1 mit txt2 sondern verweist bei txt2 auf txt1
            System.out.println("gleich");
        }
        else {
            System.out.println("ungleich");
        }

        System.out.println("==================");

        txt1  ="Moin";
        txt2 = "Mo";

        if (txt1.equals(txt2 + "in")) { // vergleicht nicht txt1 mit txt2 sondern verweist bei txt2 auf txt1
            System.out.println("gleich");
        }
        else {
            System.out.println("ungleich");
        }
    }
}
