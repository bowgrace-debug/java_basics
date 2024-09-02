package aufgaben.a34_Banking.banking.versionMe;


/**
 * Banking
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Banking {

    // Instanzvariablen
    private String vorname;
    private String nachname;
    private String iBAN;
    private double kontostand;
    private double einzahlung;
    private double auszahlung;

    // Vorname
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }

    // Nachname
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }

    // IBAN
    public void setiBAN(String iBAN) {
        this.iBAN = iBAN;
    }
    public String getiBAN() {
        return iBAN;
    }

    // Kontostand
    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
    public double getKontostand() {
        return kontostand;
    }

    // Einzahlung
    public void setEinzahlung(double einzahlung) {
        this.kontostand += einzahlung;
    }
    public double getEinzahlung() {
        return kontostand;
    }

    // Auszahlung
    public void setAuszahlung(double auszahlung) {
        if (kontostand >= auszahlung && kontostand - auszahlung < -500) {
            this.kontostand = auszahlung;
        }
    }
    public double getAuszahlung() {
        return kontostand;
    }
}
