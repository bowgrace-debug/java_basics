package aufgaben.aufgabenAlle.aufgaben50_100.a53_Kunde;

/**
 * Customer
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.09.2024
 */
public abstract class Customer {

    private String customerNumber;
    private Address address;
    private BankAccount bankAccount;

    public Customer(String customerNumber, Address address, BankAccount bankAccount) {
        setCustomerNumber(customerNumber);
        setAddress(address);
        setBankAccount(bankAccount);
    }

    public Customer(){}

    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString(){
        return String.format("\nCustomer number: %s\n", getCustomerNumber() + address + bankAccount);
    }
}
