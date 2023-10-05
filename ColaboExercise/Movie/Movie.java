package ColaboExercise.Movie;
public class Movie {
    private String movieId;
    private String title;
    private String koreanTitle;
    private String plot;
    private String releaseYear;
    private String runningTime;
    private String gradeId;
    private String gradeInKoreaId;
    private String poster;
    private String releaseDateInKorea;
    private String boxOfficeWWGross;
    private String boxOfficeUSGross;
    private String budget;
    private String originalAuthor;
    private String originalSource;

    public Movie(MovieBuilder movieBuilder){
        this.movieId = movieBuilder.movieId;
        this.title = movieBuilder.title;
        this.koreanTitle = movieBuilder.koreanTitle;
        this.plot = movieBuilder.plot;
        this.releaseYear = movieBuilder.releaseYear;
        this.runningTime = movieBuilder.runningTime;
        this.gradeId = movieBuilder.gradeId;
        this.gradeInKoreaId = movieBuilder.gradeInKoreaId;
        this.poster = movieBuilder.poster;
        this.releaseDateInKorea = movieBuilder.releaseDateInKorea;
        this.boxOfficeWWGross = movieBuilder.boxOfficeWWGross;
        this.boxOfficeUSGross = movieBuilder.boxOfficeUSGross;
        this.budget = movieBuilder.budget;
        this.originalAuthor = movieBuilder.originalAuthor;
        this.originalSource = movieBuilder.originalSource;
    }

    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", title=" + title + ", koreanTitle=" + koreanTitle + ", plot=" + plot
                + ", releaseYear=" + releaseYear + ", runningTime=" + runningTime + ", gradeId=" + gradeId
                + ", gradeInKoreaId=" + gradeInKoreaId + ", poster=" + poster + ", releaseDateInKorea="
                + releaseDateInKorea + ", boxOfficeWWGross=" + boxOfficeWWGross + ", boxOfficeUSGross="
                + boxOfficeUSGross + ", budget=" + budget + ", originalAuthor=" + originalAuthor + ", originalSource="
                + originalSource + "]";
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getKoreanTitle() {
        return koreanTitle;
    }

    public String getPlot() {
        return plot;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public String getGradeId() {
        return gradeId;
    }

    public String getGradeInKoreaId() {
        return gradeInKoreaId;
    }

    public String getPoster() {
        return poster;
    }

    public String getReleaseDateInKorea() {
        return releaseDateInKorea;
    }

    public String getBoxOfficeWWGross() {
        return boxOfficeWWGross;
    }

    public String getBoxOfficeUSGross() {
        return boxOfficeUSGross;
    }

    public String getBudget() {
        return budget;
    }

    public String getOriginalAuthor() {
        return originalAuthor;
    }

    public String getOriginalSource() {
        return originalSource;
    }

public static class MovieBuilder {

    String movieId;
    String title;
    String koreanTitle;
    String plot;
    String releaseYear;
    String runningTime;
    String gradeId;
    String gradeInKoreaId;
    String poster;
    String releaseDateInKorea;
    String boxOfficeWWGross;
    String boxOfficeUSGross;
    String budget;
    String originalAuthor;
    String originalSource;

    public MovieBuilder(String movieId, String title, String koreanTitle, String plot, String releaseYear, String runningTime,
                        String gradeId, String gradeInKoreaId, String poster, String releaseDateInKorea, String boxOfficeWWGross,
                        String boxOfficeUSGross, String budget, String originalAuthor, String originalSource) {
                            this.movieId = movieId;
                            this.title = title;
                            this.koreanTitle = koreanTitle;
                            this.plot = plot;
                            this.releaseYear = releaseYear;
                            this.runningTime = runningTime;
                            this.gradeId = gradeId;
                            this.gradeInKoreaId = gradeInKoreaId;
                            this.poster = poster;
                            this.releaseDateInKorea = releaseDateInKorea;
                            this.boxOfficeWWGross = boxOfficeWWGross;
                            this.boxOfficeUSGross = boxOfficeUSGross;
                            this.budget = budget;
                            this.originalAuthor = originalAuthor;
                            this.originalSource = originalSource;
                        }

    public MovieBuilder setMovieId(String movieId) {
        this.movieId = movieId;
        return this;
    }

    public MovieBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder setKoreanTitle(String koreanTitle) {
        this.koreanTitle = koreanTitle;
        return this;
    }

    public MovieBuilder setPlot(String plot) {
        this.plot = plot;
        return this;
    }

    public MovieBuilder setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public MovieBuilder setRunningTime(String runningTime) {
        this.runningTime = runningTime;
        return this;
    }

    public MovieBuilder setGradeId(String gradeId) {
        this.gradeId = gradeId;
        return this;
    }

    public MovieBuilder setGradeInKoreaId(String gradeInKoreaId) {
        this.gradeInKoreaId = gradeInKoreaId;
        return this;
    }

    public MovieBuilder setPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public MovieBuilder setReleaseDateInKorea(String releaseDateInKorea) {
        this.releaseDateInKorea = releaseDateInKorea;
        return this;
    }

    public MovieBuilder setBoxOfficeWWGross(String boxOfficeWWGross) {
        this.boxOfficeWWGross = boxOfficeWWGross;
        return this;
    }

    public MovieBuilder setBoxOfficeUSGross(String boxOfficeUSGross) {
        this.boxOfficeUSGross = boxOfficeUSGross;
        return this;
    }

    public MovieBuilder setBudget(String budget) {
        this.budget = budget;
        return this;
    }

    public MovieBuilder setOriginalAuthor(String originalAuthor) {
        this.originalAuthor = originalAuthor;
        return this;
    }

    public MovieBuilder setOriginalSource(String originalSource) {
        this.originalSource = originalSource;
        return this;
    }

    public Movie build() {
        return new Movie(this);
    }

    
}

}
