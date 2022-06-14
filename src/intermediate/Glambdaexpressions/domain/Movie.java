package intermediate.Glambdaexpressions.domain;

public class Movie implements Comparable<Movie>{

    private String title;
    private Integer duraton;


    public Movie() {
    }

    public Movie(String title, Integer duraton) {
        this.title = title;
        this.duraton = duraton;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duraton=" + duraton +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuraton() {
        return duraton;
    }

    public void setDuraton(Integer duraton) {
        this.duraton = duraton;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
