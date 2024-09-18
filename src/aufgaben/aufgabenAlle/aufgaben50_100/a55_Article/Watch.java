package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Watch
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public class Watch extends Article{

    private String powerSupply;

    public Watch(String title, String powerSupply,  double price) {
        super(title, price);
        setPowerSupply(powerSupply);
    }

    public String getPowerSupply() {
        return powerSupply;
    }
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String asString(){
        String output = "";
        output += super.asString();
        output += "PowerSupply: " + getPowerSupply();
        return output;
    }
}
