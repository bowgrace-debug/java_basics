package aufgaben.aufgabenAlle.aufgaben46_51.a48_preis;

/**
 * Preis
 * <p>
 *
 * @author Maximilian Stolle
 * @version 05.09.2024
 */
public class Preis {
    // Instanzvariablen
    private double betrag;
    private String waehrung;

    public Preis() {
        setWaehrung("€");
    }

    public Preis(double betrag){
        this();
        setBetrag(betrag);
    }

    public Preis(double betrag, String waehrung){
        this(betrag);
        setWaehrung(waehrung);
    }

    /*
        Getter und Setter
     */
    public double getBetrag() {

        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    // überladen der Methode setBetrag
    public void setBetrag(String betrag) {
        this.betrag = Double.parseDouble(betrag);
    }

    public void println() {
//        System.out.printf("%.2f %s%n", betrag, waehrung);
        println(2);
    }

    public void println(int nachkommastellen) {
        System.out.printf("%." + nachkommastellen + "f %s%n", betrag, waehrung);
    }

    public String getWaehrung() {
        return waehrung;
    }

    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }
}
