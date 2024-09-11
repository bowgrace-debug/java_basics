package aufgaben.aufgabenAlle.aufgaben46_50.a50_horse;


/**
 * Horse
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Horse {

    private String name;
    private String pferderasse;
    private String farbe;
    private String geschlecht;
    private double stockmass;
    private Sattel sattel;
    private int alter;

    public Horse(String name, String pferderasse, String farbe, String geschlecht, double stockmass,int alter, Sattel sattel){
        setName(name);
        setPferderasse(pferderasse);
        setFarbe(farbe);
        setGeschlecht(geschlecht);
        setStockmass(stockmass);
        setSattel(sattel);
        setAlter(alter);
    }

    // Getter & Setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getPferderasse() {
        return pferderasse;
    }
    public void setPferderasse(String pferderasse) {
        this.pferderasse = pferderasse;
    }

    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getGeschlecht() {
        return geschlecht;
    }
    public void setGeschlecht(String geschlecht ) {
            this.geschlecht = geschlecht;
    }

    public double getStockmass() {
        return stockmass;
    }
    public void setStockmass(double stockmass) {
        this.stockmass = stockmass;
    }

    public Sattel getSattel() {
        return sattel;
    }
    public void setSattel(Sattel sattel) {
        this.sattel = sattel;
    }

    public int getAlter(){
        return alter;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }

    public String ausgabeHorse(){
        return String.format("Name: %s\nPferderasse: %s\nFarbe: %s\nGeschlecht: %b\nStockmaß: %.1f\nAlter: %d", getName(), getPferderasse(), getFarbe(), getGeschlecht(), getStockmass(), getAlter());
    }

    public String ausgabeTrennlinie(){
            return "\n=========================================\n";
        }
}
