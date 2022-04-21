package working31.Movie;

import working31.Movie.Movie;

public class MovieObject {
    public static void main(String[] args) {
Movie movie1=new Movie("usa","Journey to SDET: Cydeo Batch 25","Adventure, Comedy","09/12=2022","kuzzat");

movie1.addCast("halil");
String [] cast={"muhtar","asia","halil"};
movie1.addCasts(cast);
        System.out.println(movie1);



    }



}
