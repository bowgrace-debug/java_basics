package aufgaben.a34_Banking.banking.versionNew;

/**
 * Bankkonto (Model,)
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Bankkonto {
    private String nachname;
    private String vorname;
    private String iban;
    private double limit;
    private double kontostand = 0.0;

    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public boolean auszahlen(double betrag) {
        if (kontostand + limit >= betrag) {
            kontostand -= betrag;
            return true;
        }
        else {
            return false;
        }
    }

    public double kontostandAbfragen() {
        return 0.0;
    }

    // Setter
    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    // Getter
    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public double getKontostand() {
        return kontostand;
    }

}
