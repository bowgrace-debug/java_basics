package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * NotebookCharacteristics
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class NotebookCharacteristics {

    // local variable
    private double weight;
    private String articleNumber;
    private int ram;

    // Constructor
    public NotebookCharacteristics(double weight, String articleNumber, int ram) {
        this.weight = weight;
        this.articleNumber = articleNumber;
        this.ram = ram;
    }

    // Getter & Setter
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getArticleNumber() {
        return articleNumber;
    }
    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    // Output
    public String outputNotebookCharacteristics(){
        return String.format("\nWeight: %.1f kg\nArticle number: %s\nRAM: %d GB\n", getWeight(),getArticleNumber(), getRam());
    }
}
