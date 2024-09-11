package aufgaben.aufgabenAlle.aufgaben0_45.aufgaben32_36.a36_Employee.versionMe;

/**
 * Employee
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Employee {

    private String vorname;
    private String nachname;
    private String personalnummer;
    private String geburtstag;
    private int urlaubstage;
    private int genommeneUrlaubstage;
    public int restUrlaub;

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }

    public void setPersonalnummer(String personalnummer) {
        this.personalnummer = personalnummer;
    }
    public String getPersonalnummer() {
        return personalnummer;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }
    public String getGeburtstag() {
        return geburtstag;
    }

    public void setUrlaubstage(int urlaubstage) {
        this.urlaubstage = urlaubstage;
    }
    public int getUrlaubstage() {
        return urlaubstage;
    }

    public void setGenommeneUrlaubstage(int genommeneUrlaubstage) {
        this.genommeneUrlaubstage = genommeneUrlaubstage;
    }
    public int getGenommeneUrlaubstage() {
        return genommeneUrlaubstage;
    }

    public int restUrlaub() {
        restUrlaub = getUrlaubstage() - getGenommeneUrlaubstage();
        return restUrlaub;
    }

    public String ausgabe() {
        String formartAusgabe ="";
        formartAusgabe += String.format("%s %s (%s), geboren am %s\nJahresurlaub: %d\nGenommene Tage: %d\nResturlaub: %d\n", getVorname(), getNachname(), getPersonalnummer(),getGeburtstag(),getUrlaubstage(), getGenommeneUrlaubstage(),restUrlaub());
        formartAusgabe += String.format("=================================================");
        return formartAusgabe;
    }
}
