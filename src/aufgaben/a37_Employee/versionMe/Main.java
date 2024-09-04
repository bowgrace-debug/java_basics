package aufgaben.a37_Employee.versionMe;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Employee[] mitarbeiter = new Employee[3];

        mitarbeiter[0] = new Employee();
        mitarbeiter[0].setVorname("Annika");
        mitarbeiter[0].setNachname("Müller");
        mitarbeiter[0].setPersonalnummer("LDV785911");
        mitarbeiter[0].setGeburtstag("03.09.1984");
        mitarbeiter[0].setUrlaubstage(30);
        mitarbeiter[0].setGenommeneUrlaubstage(5);
        mitarbeiter[0].restUrlaub();
        System.out.printf("%s %s (%s), geboren am %s\n", mitarbeiter[0].getVorname(),mitarbeiter[0].getNachname(), mitarbeiter[0].getPersonalnummer(), mitarbeiter[0].getGeburtstag());
        System.out.printf("Jahresurlaub: %d\n", mitarbeiter[0].getUrlaubstage());
        System.out.printf("genommene Tage: %d\n",mitarbeiter[0].getGenommeneUrlaubstage());
        System.out.printf("Resturlaub: %d\n", mitarbeiter[0].restUrlaub);
        System.out.println("========================================");

        mitarbeiter[1] = new Employee();
        mitarbeiter[1].setVorname("Hans");
        mitarbeiter[1].setNachname("Meyer");
        mitarbeiter[1].setPersonalnummer("KSA415679");
        mitarbeiter[1].setGeburtstag("19.02.2000");
        mitarbeiter[1].setUrlaubstage(30);
        mitarbeiter[1].setGenommeneUrlaubstage(27);
        mitarbeiter[1].restUrlaub();
        System.out.printf("%s %s (%s), geboren am %s\n", mitarbeiter[1].getVorname(),mitarbeiter[1].getNachname(), mitarbeiter[1].getPersonalnummer(), mitarbeiter[1].getGeburtstag());
        System.out.printf("Jahresurlaub: %d\n", mitarbeiter[1].getUrlaubstage());
        System.out.printf("genommene Tage: %d\n",mitarbeiter[1].getGenommeneUrlaubstage());
        System.out.printf("Resturlaub: %d\n", mitarbeiter[1].restUrlaub);
        System.out.println("========================================");

        mitarbeiter[2] = new Employee();
        mitarbeiter[2].setVorname("Sabine");
        mitarbeiter[2].setNachname("Schmidt");
        mitarbeiter[2].setPersonalnummer("BWJ456740");
        mitarbeiter[2].setGeburtstag("05.06.1995");
        mitarbeiter[2].setUrlaubstage(30);
        mitarbeiter[2].setGenommeneUrlaubstage(16);
        mitarbeiter[2].restUrlaub();
        System.out.printf("%s %s (%s), geboren am %s\n", mitarbeiter[2].getVorname(),mitarbeiter[2].getNachname(), mitarbeiter[2].getPersonalnummer(), mitarbeiter[2].getGeburtstag());
        System.out.printf("Jahresurlaub: %d\n", mitarbeiter[2].getUrlaubstage());
        System.out.printf("genommene Tage: %d\n",mitarbeiter[2].getGenommeneUrlaubstage());
        System.out.printf("Resturlaub: %d\n", mitarbeiter[2].restUrlaub);
        System.out.println("========================================");
    }
}
