package day25_tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country;
    public String title;
    public String genre;
    LocalDate releaseDate;
    public String director;
    ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String genre, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;

    }
    public void addCast(String name){
        casts.add(name);
    }
    public void addCasts(String[]names){
        casts.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                ", total number of casts="+ casts.size()+
                '}';
    }
}
/*
            addCast(String): adds the given string argument to the arrayList casts
 1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)
        Add a constructor to set the country, title, release date, and director of the Movie
        Actions
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts
    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group
        print the full info of the movie
 */

