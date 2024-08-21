package sprachkern;

/**
 * Erweiterte_forschleife
 * <p>
 *
 * @author Maximilian Stolle
 * @version 20.08.2024
 */
public class Erweiterte_forschleife {
    public static void main(String[] args) {

        String[] names = {"Cora", "Chris"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        int cnt = 1; // counter
        for (String name : new String[]{"Cora", "Chris", null, "Tom"}) {
            if (name == null)
                continue; // überspringt gewünschte Elemente
//              break; // bricht die Schleife bei einem gewünschten Element ab
            System.out.println(cnt + ". " + name); // Listet den Counter mit der Namens Liste auf
            cnt++; //zählt die Namesliste hoch
        }

        System.out.println("====================");

        String[] contacts = {"Tom", "Marie", "Paul", "Jeff", "Paula"};
        int counter = 1;
        for (String prename : contacts) {
            System.out.println(counter + ". " + prename);
            counter++;
        }
    }
}
