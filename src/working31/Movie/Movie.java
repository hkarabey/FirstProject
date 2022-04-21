package working31.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String genre;
    public String releaseDate;
    public String director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, String releaseDate,String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director=director;
        casts=new ArrayList<>();
    }

    public void addCast(String name){
        casts.add(name);
    }
    public void addCasts(String[] name){
        casts.addAll(Arrays.asList(name));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }
}
