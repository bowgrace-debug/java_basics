package privatkunde;

import java.time.DateTimeException;
import java.util.zip.DataFormatException;

/**
 * KundenInformationen
 * <p>
 *
 * @author Maximilian Stolle
 * @version 10.09.2024
 */
public class KundenInformationen {

    private String vorname;
    private String nachname;
    private String geburtstag;
    private KundenAdresse adresse;
    private KundenKontoInformation konto;

    public KundenInformationen(String vorname, String nachname, String geburtstag, KundenAdresse adresse, KundenKontoInformation konto){
        setVorname(vorname);
        setNachname(nachname);
        setGeburtstag(geburtstag);
        setAdresse(adresse);
        setKonto(konto);
    }

    public void setKonto(KundenKontoInformation konto){
        this.konto = konto;
    }
    public KundenKontoInformation getKonto(){
        return konto;
    }

    public void setAdresse(KundenAdresse adresse){
        this.adresse = adresse;
    }
    public KundenAdresse getAdresse(){
        return adresse;
    }

    // Getter & Setter
    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public String getVorname(){
        return vorname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }
    public String getNachname(){
        return nachname;
    }

    public void setGeburtstag(String geburtstag){
        if (isDate(geburtstag)) {
            this.geburtstag = geburtstag;
        }
    }
    public String getGeburtstag(){
        return geburtstag;
    }

    public boolean isDate(String geburtstag) {
        if (geburtstag.matches("([0-2][0-9]|3[0-1])[.](0[1-9]|1[1-2])[.]([0-9]{4})")){
            return true;
        }
        else {
            throw new IllegalArgumentException("FEHLER: Falsches Datum Format");
        }
    }
}
