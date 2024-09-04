package aufgaben.aufgaben_wiederholungen.kontakte;

/**
 * Kontakte
 * <p>
 *
 * @author Maximilian Stolle
 * @version 03.09.2024
 */
public class Kontakte {

    private String vorname;
    private String nachname;
    private String geburtstag;
    private String adresse;

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

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }
    public String getGeburtstag() {
        return geburtstag;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
}
