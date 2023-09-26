import java.util.ArrayList;

public class Finder {
    public Movie findTitle(MovieList movieList, String title) {
        
        int start = 0;
        int end = movieList.getMovieList().size() - 1;
        int mid = 0;

        while(start <= end) {
            mid = (start + end) / 2;
            if(movieList.getMovieList().get(mid).getTitle().equals(title)) {
                return movieList.getMovieList().get(mid);
            }
            if(movieList.getMovieList().get(start).getTitle().compareTo(movieList.getMovieList().get(mid).getTitle()) > 0) {
                if(title.compareTo(movieList.getMovieList().get(mid).getTitle()) > 0 && movieList.getMovieList().get(start).getTitle().compareTo(title) >= 0) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(title.compareTo(movieList.getMovieList().get(end).getTitle()) >= 0 && title.compareTo(movieList.getMovieList().get(mid).getTitle()) < 0) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return null; 
    }
}
