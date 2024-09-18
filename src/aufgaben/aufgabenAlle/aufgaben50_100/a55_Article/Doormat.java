package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Doormat
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public class Doormat extends Article{

    private String material;

    public Doormat(String title, String material,double price) {
        super(title, price);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String asString(){
        String output = "";
        output += super.asString();
        output += "Material: " + getMaterial();
        return output;
    }
}
