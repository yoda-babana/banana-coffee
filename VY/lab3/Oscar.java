import java.util.*;

class Oscar {
    private String name;
    private String surname;
    private int movies;
    private double rating;

    public Oscar(String name, String surname, int movies, double rating) {
        this.name = name;
        this.surname = surname;
        this.movies = movies;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getMovies() {
        return movies;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}


