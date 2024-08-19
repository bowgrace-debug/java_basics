package aufgaben.aufgaben_wiederholungen;

/**
 * anrede
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.08.2024
 */
public class anrede {
    public static void main(String[] args) {

        // Eingabe

        String nachname = "Stolle";
        String vorname = "Maximilian";
        String titel = "Dr.";
        int alter = 24;
        boolean geschlecht = false; // true für weiblich, false für männlich

        String anrede = " ";

        // Verarbeitung

        if (alter < 18) {
            anrede = "Hallo " + vorname;
            System.out.println(anrede);
        }
        else {
            if (geschlecht == true) {
                anrede = "Sehr geehrte Frau ";
            }
            else {
                anrede = "Sehr geehrter Herr ";
            }
            if (titel != "" && titel != "/") {
                anrede = anrede + titel;
            }
            System.out.println(anrede + " " + nachname);
        }
    }
}

