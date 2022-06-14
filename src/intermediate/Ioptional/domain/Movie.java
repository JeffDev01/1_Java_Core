package intermediate.Ioptional.domain;

public class Movie {
    private Integer id;
    private String title;
    private Integer duration;


    public Movie(Integer id, String title, Integer duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
