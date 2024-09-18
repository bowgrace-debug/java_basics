package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;

/**
 * Publisher
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public class Publisher {

    private String publisherName;
    private String publisherAddress;

    public Publisher(String publisherName) {
        setPublisherName(publisherName);
    }

    public Publisher(String publisherName, String publisherAddress){
        setPublisherName(publisherName);
        setPublisherAddress(publisherAddress);
    }

    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAddress(){
        return publisherAddress;
    }
    public void setPublisherAddress(String publisherAddress){
        this.publisherAddress = publisherAddress;
    }

    public String asStringName(){
        return String.format("\nPublisher: %s", getPublisherName());
    }
    public String asString(){
        if (publisherAddress != null) {
            return String.format("\nPublisher: %s\n%s", getPublisherName(), getPublisherAddress());
        }
        else {
            return asStringName();
        }
    }
}
