package aufgaben.aufgabenAlle.aufgaben50_100.a53_Kunde;

/**
 * BusinessCustomer
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.09.2024
 */
public class BusinessCustomer extends Customer {

    private String companyName;
    private String ustID;

    public BusinessCustomer( String companyName, String ustID) {
        setCompanyName(companyName);
        setUstID(ustID);
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUstID() {
        return ustID;
    }
    public void setUstID(String ustID) {
        this.ustID = ustID;
    }

    @Override
    public String toString(){
        return String.format("\nCompany name: %s\nUst-ID: %s\n", getCompanyName(), getUstID());
    }
}
