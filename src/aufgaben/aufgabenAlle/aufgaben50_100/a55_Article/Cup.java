package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Cup
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public class Cup extends Article{

    private int capacity;

    public Cup(String title, int capacity,double price) {
        super(title, price);
        setCapacity(capacity);
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String asString(){
        String output = "";
        output += super.asString();
        output += "Capacity: " + getCapacity() + " ml";
        return output;
    }
}
