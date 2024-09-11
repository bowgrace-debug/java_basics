package aufgaben.aufgaben_wiederholungen.eventCards;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Eventcard[] cards = new Eventcard[5];

        // Open Air Dance Night (Event)
        cards[0] = new Eventcard(
                "Open Air Dance Night", "28.08.2024", "06:00", "20,00 €", "24", 5.0);
        System.out.print(cards[0].outputEventCard());

        // <=line=>
        System.out.print("===========================================");

        // Trash (Event)
        cards[1] = new Eventcard(
                "Trash", "28.08.2024", "06:00", "50,00 €", "18",1.0);
        System.out.print(cards[1].outputEventCard());
    }
}

