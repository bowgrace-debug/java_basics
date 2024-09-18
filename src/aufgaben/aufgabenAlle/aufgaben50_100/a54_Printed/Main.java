package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;


/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Printed[] printed = new Printed[5];

        Publisher publisher = new Publisher("Heise Medien GmbH", "Karl-Wiechert-Allee 10\n30625 Hannover");
        printed[0] = new Magazin("ct magazin für computer technik", 4.90, "Every 14 days", "0724-8679", publisher);

        Publisher publisher1 = new Publisher("mitp Verlags GmbH & Co. KG", "Augustinusstr. 9a\n50226 Frechen");
        printed[1] = new Books("Clean Code", 39.95, "Robert C. Martin", "987-3826655487", publisher1);

        Dimensions dimensions = new Dimensions(64.0,48.0);
        Publisher publisher2 = new Publisher("teNeues Calendars & Stationary GmbH & Co. KG");
        printed[2] = new Calendar("National Geographic 'Der Kalender 2019'", 38.52, dimensions,publisher2);

        Publisher publisher3 = new Publisher("Spektrum der Wissenschaft Verlagsgesellschaft mbH", "Heidelberg");
        printed[3] = new Magazin("Die Zähmung der Raum-Zeit-Singularität", 8.50,"Every month", "0170-2971", publisher3);

        Publisher publisher4 = new Publisher("O'Reilly Verlag GmbH & Co. KG");
        printed[4] = new Books("Weniger schlecht programmieren", 24.90, "Kathirn Passig", "987-39´897215672", publisher4);

        for (Printed print : printed) {
            System.out.println(print.asString());
            System.out.println("===========================");
        }
    }
}
