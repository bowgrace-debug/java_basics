package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;

/**
 * Calendar
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public class Calendar extends Printed {

    private Dimensions dimensions;
    private Publisher publisher;

    public Calendar( String title, double price, Dimensions dimensions, Publisher publisher) {
        super(price, title);
        setDimensions(dimensions);
        setPublisher(publisher);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
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
        output += dimensions.asString();
        output += publisher.asStringName();
        return output;
    }
}


