package day25_tasks;

import java.time.LocalDate;

public class MovieObjTest {
    public static void main(String[] args) {
        Movie avatar = new Movie("United States","Avatar: The way of water","Action", LocalDate.of(2022,12,16),"James Cameron");
        String[] casts = {"Stas","Alex","BomBom","Vlad","Sasha"};

        avatar.addCasts(casts);

        avatar.addCast("Aydin");
        avatar.addCast("Lukas");

        System.out.println(avatar);

        Movie movie1 = new Movie("USA", "Java Developer: Zero to Hero", "Adventure, Comedy , Thriller", LocalDate.of(2021,4,18),"Kuzzat Altay");
        String[] casts1 = {"Ozi","Ali","Muhtar","Olga","Asel","Stanislav","Liliya","Iliya"};
        movie1.addCasts(casts1);
        System.out.println(movie1);

    }
}

