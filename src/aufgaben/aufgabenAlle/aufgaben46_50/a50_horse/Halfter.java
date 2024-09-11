package aufgaben.aufgabenAlle.aufgaben46_50.a50_horse;

/**
 * Halfter
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Halfter {

    private String groesse;

    public Halfter(String groesse){
        setGroesse(groesse);
    }

    public void setGroesse(String groesse){
        this.groesse = groesse;
    }
    public String getGroesse(){
        return groesse;
    }

    public String ausgabeHalfter(){
        return String.format("Zudem gibt es einen Halfter mit der größe: %s", getGroesse());
    }
}
