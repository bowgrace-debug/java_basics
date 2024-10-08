package aufgaben.aufgaben_wiederholungen.eventCards;


/**
 * Eventcard
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Eventcard {

    public static final String DATE_PATTERN = "([0-2][0-9]|3[0-2])[.](0[0-9]|1[1-2])[.]([0-9]{4})";
    public static final String TIME_PATTERN = "(([0-1][0-9]|2[0-3]).([0-5][0-9]))";
    public static final String PRICE_PATTERN = "([0-9]{1,9})(,[0-9]{2}) ?€";
    public static final String AGE_PATTERN = "(1[8-9])|(2[0-9]|3[0-9])|(4[0-9])|(5[0-9])|(6[0-9])(\\+{0,1})";
    public static final String RATING_PATTERN = "([0-4][.][0-9]|5[.]0)";
    public final String TITLE_LINE = "___________________________________________\n";


    // Local variablen
    private String name;
    private String date;
    private String time;
    private String price;
    private String rating;
    private String age;

    // Constructor
    public Eventcard(String name, String date, String time, String price, String age, String rating){
        this(price, age, rating);
        setName(name);
        setDate(date);
        setTime(time);
    }

    private Eventcard(String price, String age, String rating){
        setPrice(price);
        setAge(age);
        setRating(rating);
    }

    // Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isDate(String date){
        return date.matches(DATE_PATTERN);
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        if (isDate(date)) {
            this.date = date;
        }
        else {
            throw new NumberFormatException("ERROR: incorrect date entry (dd.mm.yyyy)");
        }
    }

    public boolean isTime(String time){
        return time.matches(TIME_PATTERN);
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        if (isTime(time)) {
            this.time = time;
        }
        else {
            throw new NumberFormatException("ERROR: incorrect time entry (hh.mm)");
        }
    }

    public boolean isPrice(String price){
        return price.matches(PRICE_PATTERN);
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        if (isPrice(price)) {
            this.price = price;
        }
        else {
            throw new NumberFormatException("ERROR: incorrect price entry (EUREUR,CTCT €)");
        }
    }

    public boolean isRating(String rating) {
        return rating.matches(RATING_PATTERN);
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        if (isRating(rating)) {
            this.rating = rating;
        }
        else {
            throw new NumberFormatException("ERROR: incorrect rating entry (number.number)");
        }
    }

    public boolean isAge(String age){
        return age.matches(AGE_PATTERN);
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        if (isAge(age)) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("ERROR: Age is under 18 years");
        }
    }

    public String outputEventCard(){
        return String.format(
                "\nEvent: %s\n%s\nDate: %s\tTime: %s pm\nPrice: %s\t\tRating: %s\nAge: %s\n",
                getName(),TITLE_LINE, getDate(), getTime(), getPrice(), getRating(), getAge());
    }
}