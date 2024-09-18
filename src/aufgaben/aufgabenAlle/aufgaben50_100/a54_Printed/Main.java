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

        Publisher publisher = new Publisher("Heise Medien GmbH", "Karl-Wiechert-Allee 10\n30625 Hannover");
        Magazin magazin = new Magazin("ct magazin für computer technik", 4.90, "Every 14 days", "0724-8679", publisher);

        System.out.println(magazin.asString());
        System.out.println("===========================");

        Publisher publisher1 = new Publisher("mitp Verlags GmbH & Co. KG", "Augustinusstr. 9a\n50226 Frechen");
        Books books = new Books("Clean Code", 39.95, "Robert C. Martin", "987-3826655487", publisher1);

        System.out.println(books.asString());
        System.out.println("===========================");

        Dimensions dimensions = new Dimensions(64.0,48.0);
        Publisher publisher2 = new Publisher("teNeues Calendars & Stationary GmbH & Co. KG");
        Calendar calendar = new Calendar("National Geographic 'Der Kalender 2019'", 38.52, dimensions,publisher2);

        System.out.println(calendar.asString());
        System.out.println("===========================");

        Publisher publisher3 = new Publisher("Spektrum der Wissenschaft Verlagsgesellschaft mbH", "Heidelberg");
        Magazin magazin1 = new Magazin("Die Zähmung der Raum-Zeit-Singularität", 8.50,"Every month", "0170-2971", publisher3);

        System.out.println(magazin1.asString());
        System.out.println("===========================");

        Publisher publisher4 = new Publisher("O'Reilly Verlag GmbH & Co. KG");
        Books books1 = new Books("Weniger schlecht programmieren", 24.90, "Kathirn Passig", "987-39´897215672", publisher4);

        System.out.println(books1.asString());
        System.out.println("===========================");
    }
}
