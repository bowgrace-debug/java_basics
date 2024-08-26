package aufgaben.aufgaben_wiederholungen;

/**
 * suche
 * <p>
 *
 * @author Maximilian Stolle
 * @version 25.08.2024
 */
public class suche {
    public static void main(String[] args) {

        String suche = "Mittwoch";

        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        boolean gefunden = false;
        int i = 0;

        while(i < wochentage.length && !gefunden) {
         gefunden = wochentage[i].equalsIgnoreCase(suche);
         i++;
        }
        System.out.println(gefunden);
    }
}
