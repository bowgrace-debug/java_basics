package aufgaben.aufgabenAlle.aufgaben50_100.a53_Kunde;

/**
 * BankAccount
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.09.2024
 */
public class BankAccount {

    private String iban;
    private String bic;

    public BankAccount(String iban, String bic) {
        setIban(iban);
        setBic(bic);
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }
    public void setBic(String bic) {
        this.bic = bic;
    }

    @Override
    public String toString(){
        return String.format("\nIBAN: %s\nBIC: %s\n", getIban(), getBic());
    }
}
