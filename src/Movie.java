
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int movieId;
    private String title;
    private String genre;
    private List<String> showtimes;

    // Constructor
    public Movie(int movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.showtimes = new ArrayList<>();
    }

    // Getter and Setter methods
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(List<String> showtimes) {
        this.showtimes = showtimes;
    }

    // Add a showtime to the list
    public void addShowtime(String showtime) {
        this.showtimes.add(showtime);
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Movie{" +
                "movieId =" + movieId +
                ", title ='" + title + '\'' +
                ", genre ='" + genre + '\'' +
                ", showtimes =" + showtimes +
                '}';
    }
}
