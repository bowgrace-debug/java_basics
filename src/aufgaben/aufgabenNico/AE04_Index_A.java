package aufgaben.aufgabenNico;

/**
 * AE04_Index_A
 * <p>
 *
 * @author Maximilian Stolle
 * @version 15.08.2024
 */
public class AE04_Index_A {
    public static void main(String[] args) {

        String txt = "was für ein schöner Tag heute ist";
        int laenge = txt.length();
        int i = 0;
        String iToA= "";

        while(i < laenge) {
            if (txt.charAt(i) == 'a') {
                iToA += i + ", ";
            }
            i++;
        }
        System.out.println(iToA);
    }
}
