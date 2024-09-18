package aufgaben.aufgabenAlle.aufgaben50_100.a54_Printed;

/**
 * Books
 * <p>
 *
 * @author Maximilian Stolle
 * @version 17.09.2024
 */
public class Books extends Printed{

    private String author;
    private String isbn;
    private Publisher publisher;

    public Books(String title,double price, String author, String isbn, Publisher publisher) {
        super(price, title);
        setAuthor(author);
        setIsbn(isbn);
        setPublisher(publisher);
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String asString(){
        String output = "";
        output += super.asString();
        output += "\nAuthor: " + getAuthor() + "\nISBN-13: " + getIsbn();
        output += publisher.asString();
        return output;
    }
}
