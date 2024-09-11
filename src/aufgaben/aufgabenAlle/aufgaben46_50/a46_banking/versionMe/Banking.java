package aufgaben.aufgabenAlle.aufgaben46_51.a46_banking.versionMe;


/**
 * Banking
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Banking {

    public static final String IBAN_PATTERN = "[A-Z]{2}[0-9]{20}";

    // Instanzvariablen
    private String vorname;
    private String nachname;
    private String iBAN;
    private double kontostand;

    // Vorname
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }

    public boolean isIban(String iban) {
        return iban.matches(IBAN_PATTERN);
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
        if (isIban(iBAN)) {
            this.iBAN = iBAN;
        }
        else {
            throw new NumberFormatException("ungültige IBAN");
        }
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
            this.kontostand -= auszahlung;
    }
    public double getAuszahlung() {
        return kontostand;
    }
}
