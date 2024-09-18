package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Article
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public abstract class Article {

    private String title;
    private double price;

    public Article(String title, double price) {
        setTitle(title);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String asString(){
        return String.format("\nTitle: %-40sPrice: %,.2f €\n", getTitle(), getPrice());
    }
}
