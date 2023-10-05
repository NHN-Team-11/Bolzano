package ColaboExercise.Movie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieList movieList = new MovieList("Movie.csv");
        Finder finder = new Finder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("찾으실 영화 이름을 적으세요 : ");
        String str = br.readLine();
        // System.out.println(finder.findTitle(movieList, str));
        // System.out.println(finder.findKoreaTitle(movieList, str));
        System.out.println(movieList.getMovieList().get(500));
    }
}
