package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;

/**
 * Printed
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public abstract class Printed {

    private double price;
    private String title;

    public Printed(double price, String title) {
        setPrice(price);
        setTitle(title);
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String asString(){
        return String.format("\nTitle: %s\nPrice: %.2f €\n", getTitle(), getPrice());
    }
}
