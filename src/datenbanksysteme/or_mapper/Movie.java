package datenbanksysteme.or_mapper;

/**
 * Movie
 * <p>
 *
 * @author Maximilian Stolle
 * @version 14.11.2024
 */
public class Movie {
    private String title;
    private double score;

    public Movie(String title, double score){
        this.title = title;
        this.score = score;
    }

    @Override
    public String toString(){
        return title + " " + score;
    }
}
