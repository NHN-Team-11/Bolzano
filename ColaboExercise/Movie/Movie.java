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

    public Movie(String movieId, String title, String koreanTitle, String plot, String releaseYear, String runningTime,
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
    
}
