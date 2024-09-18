package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;

/**
 * Magazin
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public class Magazin extends Printed{

    private String appearance;
    private String issn;
    private Publisher publisher;

    public Magazin(String title, double price, String appearance, String issn, Publisher publisher) {
        super(price, title);
        setAppearance(appearance);
        setIssn(issn);
        setPublisher(publisher);
    }

    public String getAppearance() {
        return appearance;
    }
    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getIssn() {
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }

    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String asString(){
        String output = "";
        output += super.asString();
        output += "\nAppearance: " + getAppearance() + "\nISSN: " + getIssn();
        output += publisher.asString();
        return output;
    }
}
