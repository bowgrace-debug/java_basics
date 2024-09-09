package aufgaben.aufgaben_wiederholungen.FinanceBanking;

/**
 * Banking
 * <p>
 *
 * @author Maximilian Stolle
 * @version 06.09.2024
 */
public class FinanceBanking {

    // Instanzvariablen
    private String vorname;
    private String nachname;
    private String iBAN;
    private double kontostand;

//   public FinanceBanking(String, String, String, double){}

    public FinanceBanking(String vorname, String nachname, String iBAN, double kontostand) {
       this.vorname = vorname;
       this.nachname = nachname;
       this.iBAN = iBAN;
       this.kontostand = kontostand;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getiBAN() {
        return iBAN;
    }

    public double getKontostand() {
        return kontostand;
    }
}
