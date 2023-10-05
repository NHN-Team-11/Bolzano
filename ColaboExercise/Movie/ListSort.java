package ColaboExercise.Movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSort {
    public ArrayList<Movie> titleSort(MovieList movieList) {

        Collections.sort(movieList.getMovieList(), new Comparator<Movie>() {

            @Override
            public int compare(Movie o1, Movie o2) {
                // if(o1.getTitle().length() == o2.getTitle().length()) {
                //     return o1.compareTo(o2);
                // }
                return o1.getTitle().compareTo(o2.getTitle());
            }
            
        });

        return movieList.getMovieList();
    }

    public ArrayList<Movie> koreaTitleSort(MovieList movieList) {

        Collections.sort(movieList.getMovieList(), new Comparator<Movie>() {

            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getKoreanTitle().compareTo(o2.getKoreanTitle());
            }
            
        });

        return movieList.getMovieList();
    }

    public ArrayList<Movie> runningTimeSort(MovieList movieList) {

        Collections.sort(movieList.getMovieList(), new Comparator<Movie>() {

            @Override
            public int compare(Movie o1, Movie o2) {
                if(Integer.parseInt(o1.getRunningTime()) > Integer.parseInt(o2.getRunningTime())) {
                    return 1;
                }
                else if (Integer.parseInt(o1.getRunningTime()) == Integer.parseInt(o2.getRunningTime())) {
                    return 0;
                }
                else {
                    return -1;
                }
            }
            
        });

        return movieList.getMovieList();
    }
}
