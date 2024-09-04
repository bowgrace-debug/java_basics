package aufgaben.aufgaben_wiederholungen.kontakte;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Kontakte[] kontakt = new Kontakte[5];

        kontakt[0] = new Kontakte();
        kontakt[0].setVorname("Hans");
        kontakt[0].setNachname("Jürgen");
        kontakt[0].setGeburtstag("18.09.2000");
        kontakt[0].setAdresse("Musterstraße 1a\n12345 Musterhausen");
        System.out.printf(
                "Vorname: %s\nNachname: %s\nGeburtstag: %s\nAdresse: %s",
                kontakt[0].getVorname(), kontakt[0].getNachname(), kontakt[0].getGeburtstag(), kontakt[0].getAdresse());
    }
}
