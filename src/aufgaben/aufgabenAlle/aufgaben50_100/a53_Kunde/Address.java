package aufgaben.aufgabenAlle.aufgaben50_100.a53_Kunde;

/**
 * Address
 * <p>
 *
 * @author Maximilian Stolle
 * @version 16.09.2024
 */
public class Address {

    private String street;
    private int zipcode;
    private String city;

    public Address(String street, int zipcode, String city) {
        setStreet(street);
        setZipcode(zipcode);
        setCity(city);
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipcode() {
        return zipcode;
    }
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString(){
        return String.format("\nAddress:\nStreet: %s\nZipcode: %d\nCity: %s\n", getStreet(), getZipcode(), getCity());
    }
}
