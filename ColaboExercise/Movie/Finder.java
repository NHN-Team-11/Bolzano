<<<<<<< Updated upstream
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
=======
package ColaboExercise.Movie;
>>>>>>> Stashed changes

public class Finder {
    public Movie findTitle(MovieList movieList, String title) {

        int start = 0;
        int end = movieList.getMovieList().size() - 1;
        int mid = 0;
        int compare = 0;
        ListSort listSort = new ListSort();
        listSort.titleSort(movieList);

        // Collections.sort(movieList.getMovieList(), new Comparator<Movie>() {

        // @Override
        // public int compare(Movie o1, Movie o2) {
        // // if(o1.getTitle().length() == o2.getTitle().length()) {
        // // return o1.compareTo(o2);
        // // }
        // return o1.getTitle().compareTo(o2.getTitle());
        // }

        // });

        while (start <= end) {
            mid = (start + end) / 2;
<<<<<<< Updated upstream
            String midTitle = movieList.getMovieList().get(mid).getTitle();
            int compareResult = title.compareTo(midTitle);

            if (compareResult == 0) {
=======
            compare = movieList.getMovieList().get(mid).getTitle().compareTo(title);
            if(compare == 0) {
>>>>>>> Stashed changes
                return movieList.getMovieList().get(mid);
            } else if (compareResult < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
<<<<<<< Updated upstream
            // if(movieList.getMovieList().get(mid).getTitle().equals(title)) {
            // return movieList.getMovieList().get(mid);
            // }
            // if(movieList.getMovieList().get(start).getTitle().compareTo(movieList.getMovieList().get(mid).getTitle())
            // > 0) {
            // if(title.compareTo(movieList.getMovieList().get(mid).getTitle()) > 0 &&
            // movieList.getMovieList().get(start).getTitle().compareTo(title) >= 0) {
            // end = mid - 1;
            // }
            // else {
            // start = mid + 1;
            // }
            // }
            // else {
            // if(title.compareTo(movieList.getMovieList().get(end).getTitle()) >= 0 &&
            // title.compareTo(movieList.getMovieList().get(mid).getTitle()) < 0) {
            // start = mid + 1;
            // }
            // else {
            // end = mid - 1;
            // }
            // }
=======
            else if(compare < 0) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
>>>>>>> Stashed changes
        }
        return null;
    }


    public Movie findKoreaTitle(MovieList movieList, String title) {
        
        ListSort listSort = new ListSort();
        listSort.koreaTitleSort(movieList);

        int start = 0;
        int end = movieList.getMovieList().size() - 1;
        int mid = 0;
        int compare = 0;
        
        
        while(start <= end) {
            mid = (start + end) / 2;
            compare = movieList.getMovieList().get(mid).getKoreanTitle().compareTo(title);
            if(compare == 0) {
                return movieList.getMovieList().get(mid);
            }
            else if(compare < 0) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return null;
    }

    public Movie findRunningTime(MovieList movieList, int runningTime) {
        
        ListSort listSort = new ListSort();
        listSort.runningTimeSort(movieList);

        int start = 0;
        int end = movieList.getMovieList().size() - 1;
        int mid = 0;
        int compare = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            compare = Integer.parseInt(movieList.getMovieList().get(mid).getRunningTime());
            if(runningTime == compare) {
                return movieList.getMovieList().get(mid);
            }
            else if(runningTime > compare) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return null;
    }
    
}
