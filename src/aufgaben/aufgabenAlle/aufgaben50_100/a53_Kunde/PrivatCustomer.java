package aufgaben.aufgabenAlle.aufgaben50_100.a53_Kunde;

/**
 * PrivatCustomer
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.09.2024
 */
public class PrivatCustomer extends Customer {

    private String firstname;
    private String lastname;

    public PrivatCustomer(String customerNumber, Address address, BankAccount bankAccount, String firstname, String lastname) {
        super(customerNumber, address, bankAccount);
        setFirstname(firstname);
        setLastname(lastname);
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString(){
        return String.format("\nFirstname: %s\nLastname: %s\n", getFirstname(), getLastname());
    }

}
