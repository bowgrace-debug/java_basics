package aufgaben.aufgabenAlle.aufgaben50_100.a55_Article;

/**
 * Output
 * <p>
 *
 * @author Maximilian Stolle
 * @version 18.09.2024
 */
public class Output {

    public static void output(Article[] articles){
        double totalPrice = 0.0;
        String name = "Total price: ";

        for (Article piece : articles) {
            System.out.println(piece.asString());
            totalPrice += piece.getPrice();
        }

        System.out.println("===============================================================");
        System.out.println(String.format("%-52s %,.2f €",name, totalPrice));
        System.out.println("_______________________________________________________________");
    }
}
