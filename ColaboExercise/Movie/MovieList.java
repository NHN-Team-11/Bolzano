import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MovieList {
    
    private ArrayList<Movie> movieList;
    private String fileName;
    
    public MovieList(String fileName) throws IOException {
        this.fileName = fileName;
        readMovie(fileName);
    }

    public void readMovie(String fileName) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String line = br.readLine();

        movieList = new ArrayList<>();
        while((line = br.readLine()) != null) {

            String[] csvItem = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            
            String id = csvItem[0];
            String title = csvItem[1];
            String koreanTitle  = csvItem[2];
            String plot = csvItem[3];
            String releaseYear = csvItem[4];
            String runningTime = csvItem[5];
            String gradeId = csvItem[6];
            String gradeInKoreaId = csvItem[7];
            String poster = csvItem[8];
            String releaseDateInKorea = csvItem[9];
            String boxOfficeWWGross = csvItem[10];
            String boxOfficeUSGross = csvItem[11];
            String budget = csvItem[12];
            String originalAuthor = csvItem[13];
            String originalSource = csvItem[14];
            movieList.add(new Movie(id, title, koreanTitle, plot, releaseYear, runningTime,
                                    gradeId, gradeInKoreaId, poster, releaseDateInKorea, boxOfficeWWGross,
                                    boxOfficeUSGross, budget, originalAuthor, originalSource));
            
        }
        
    }
    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public Movie find(String str) {

        for (int i = 0; i < movieList.size(); i++) {
            if(movieList.get(i).getTitle().equals(str)){
                return movieList.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        MovieList movieList = new MovieList("Movie.csv");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("찾으실 영화 이름을 적으세요 : ");
        String str = br.readLine();
        System.out.println(movieList.find(str));
            
        
    }

    
    
}
