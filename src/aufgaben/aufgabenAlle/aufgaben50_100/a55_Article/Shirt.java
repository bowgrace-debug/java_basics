package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Shirt
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public class Shirt extends Article{

    private String size;

    public Shirt(String title, String size, double price) {
        super(title, price);
        setSize(size);
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String asString(){
        String output = "";
        output += super.asString();
        output += "Size: " + getSize();
        return output;
    }
}
