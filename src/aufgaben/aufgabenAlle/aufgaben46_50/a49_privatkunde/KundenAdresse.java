package aufgaben.aufgabenAlle.aufgaben46_51.a49_privatkunde;


/**
 * KundenAdresse
 * <p>
 *
 * @author Maximilian Stolle
 * @version 10.09.2024
 */
public class KundenAdresse {

    private String strasse;
    private int plz;
    private String ort;

    public KundenAdresse(String strasse, int plz, String ort){
        setStrasse(strasse);
        setPlz(plz);
        setOrt(ort);
    }

    // Getter & Setter
    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }
    public String getStrasse(){
        return strasse;
    }

    public void setPlz(int plz){
        this.plz = plz;
    }
    public int getPlz(){
        return plz;
    }

    public void setOrt(String ort){
        this.ort = ort;
    }
    public String getOrt(){
        return ort;
    }

    public String ausgabeAdresse(){
        return String.format("Adresse:\n%s\n%d %s\n", getStrasse(), getPlz(), getOrt());
    }
}
