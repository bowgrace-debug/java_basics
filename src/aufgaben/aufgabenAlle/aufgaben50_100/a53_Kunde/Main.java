package aufgaben.aufgabenAlle.aufgaben50_100.a53_Kunde;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Address address = new Address("Musterstreet 1a", 12345, "Mustercity");
        BankAccount bankAccount = new BankAccount("DE51290501010081994675", "SBREDE22XXX");
        PrivatCustomer privatCustomer = new PrivatCustomer("HJ437894",address, bankAccount, "Hans","Jürgen");

        System.out.println(privatCustomer.asString());

        System.out.print("\n=========================================\n");

        Address address1 = new Address("Kingsstreet 12", 12345, "Kingshausen");
        BankAccount bankAccount1 = new BankAccount("DE51290502020092994667", "SBREDE22XXX");
        BusinessCustomer businessCustomer = new BusinessCustomer("KCHJ3456",address,bankAccount,"KingsCompany","HJ432671");

        System.out.println(businessCustomer.asString());

    }
}
