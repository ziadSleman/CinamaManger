
import java.util.ArrayList;
import java.util.List;
public class Cinema {
    private String cinemaName;
    private List<Movie> movies;

    // Constructor
    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
        this.movies = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    // Add a movie to the list
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Cinema{" +
                "cinemaName='" + cinemaName + '\'' +
                ", movies=" + movies +
                '}';
    }
}
