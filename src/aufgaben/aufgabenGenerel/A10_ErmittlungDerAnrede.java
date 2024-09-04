package aufgaben.aufgabenGenerel;

/**
 * A10_ErmittlungDerAnrede
 * <p>
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class A10_ErmittlungDerAnrede {
    public static void main(String[] args) {

        // Eingabe
        String nachname = "Stolle";
        String vorname = "Maximilian";
        String titel = "Dr";
        int alterInJahren = 24;
        boolean geschlecht = false; // true für weiblich, false für männlich

        String begruessung = " ";

        // Verarbeitung
        if (alterInJahren < 18) {
            begruessung = "Hallo " + vorname;
            System.out.println(begruessung);
        }
        else {
            if (geschlecht == true) {
                begruessung = "Sehr geehrte Frau ";
            }
            else {
                begruessung = "Sehr geehrter Herr " ;
            }
            if (titel != "" && titel != "/") {
                begruessung = begruessung +  titel;
            }
        }
        System.out.println(begruessung + " " + nachname);
    }
}