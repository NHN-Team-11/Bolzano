package ColaboExercise.Movie;

public class MovieBuilder {

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
