import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Example of both Comparable and Comparator Inteface

public class ComparableInterface {
    public static void main(String []args) throws Exception {
        // create list which will going to contain movies class object
        List<Movie> moviesList = new ArrayList<Movie>();
        // create movies class object
        Movie movie1 = new Movie("Ek tha tiger", 4.9, 2020);
        Movie movie2 = new Movie("Tiger Zinda Hai", 4.5, 2018);
        Movie movie3 = new Movie("Wanted", 3.5, 2012);
        Movie movie4 = new Movie("Pathan", 5.0, 2023);
        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);

        Collections.sort(moviesList);
        
        // display all movies sorted acc to movie release year
        for(Movie movie: moviesList) {
            System.out.println("Movie Title : "+movie.getMovieName());
        }

    Collections.sort(moviesList, new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.compareTo(o2);
        }
    });

      for(Movie movie : moviesList) {
         System.out.println(movie.getMovieName() + " "+movie.getRating());
      }
    }
}
class Movie implements Comparable<Movie> {
    private String movieName;
    private double rating;
    private int year;

    public Movie(String movieName, double rating, int year) {
         this.movieName = movieName;
         this.rating = rating;
         this.year = year;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getRating() {
        return this.rating;
    }

    public void setReleaseYear(int year) {
        this.year = year;
    }

    public int getReleaseYear() {
        return this.year;
    }

    @Override
    public int compareTo(Movie that) {
        if(this.year <  that.year) {
            return -1;
        } else if(this.year > that.year) {
            return 1;
        } else {
            return 0;
        }
    }
    
}