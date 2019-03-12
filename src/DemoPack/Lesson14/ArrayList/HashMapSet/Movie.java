package DemoPack.Lesson14.ArrayList.HashMapSet;

import java.util.HashMap;
import java.util.SortedMap;

public class Movie {
    public static void main(String[] args) {
        HashMap<Integer, String> movies = new HashMap<>();
        movies.put(1972, "The Godfather");
        movies.put(1995, "Braveheart");
        movies.put(2000, "Gladiator");
        movies.put(2013, "Frozen");
        movies.put(1997, "Titanic");

        String movie = movies.get(0);
        System.out.println(movie);
    }
}
