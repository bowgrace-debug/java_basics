package privatkunde;

import java.time.DateTimeException;

/**
 * KundenKontoInformation
 * <p>
 *
 * @author Maximilian Stolle
 * @version 10.09.2024
 */
public class KundenKontoInformation {

    private String iban;
    private String bic;

    public KundenKontoInformation(String iban, String bic){
        setIban(iban);
        setBic(bic);
    }

    // Getter & Setter
    public void setIban(String iban){
        if (isIban(iban)) {
            this.iban = iban;
        }
    }
    public String getIban(){
        return iban;
    }

    public void setBic(String bic){
        if (isBic(bic)) {
            this.bic = bic;
        }
    }
    public String getBic(){
        return bic;
    }

    public boolean isIban(String iban) {
        if (iban.matches("[A-Z]{2}[0-9]{20}")){
            return true;
        }
        else {
            throw new NumberFormatException("FEHLER: Falsches IBAN Format");
        }
    }
    public boolean isBic(String bic) {
        if (bic.matches("[A-Z]{4}[A-Z]{2}([0-9]|[A-Z]){2}([X]|[0-9]){3}")){
            return true;
        }
        else {
            throw new NumberFormatException("FEHLER: Falsches BIC Format");
        }
    }
}
