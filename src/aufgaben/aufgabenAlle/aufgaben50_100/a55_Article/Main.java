package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Article[] article = new Article[6];

        article[0] = new Cup("Informatiker Tasse", 330, 14.90);
        article[1] = new Shirt("Debugging T-Shirt", "XL", 19.95);
        article[2] = new Watch("Binäre Armbanduhr", "CR2032 Knopfzelle", 21.95);
        article[3] = new Cup("Purpur Tentakel Becher", 330, 9.95);
        article[4] = new Shirt("BaZnGa T-Shirt", "M", 20.95);
        article[5] = new Doormat("Fußmatte 'It's bigger on the inside'", "Kokosfasern", 24.95);

        Output.output(article);
    }
}