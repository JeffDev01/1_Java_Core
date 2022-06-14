package intermediate.Ccolecoes.domain;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private Long id;
    private String title;
    private Double duration;
    private Integer quantity;

    public Movie(Long id, String name, Double duration) {
        Objects.requireNonNull(id, "ID must not be null");
        Objects.requireNonNull(name, "Title must not be null");
        this.id = id;
        this.title = name;
        this.duration = duration;
    }

    public Movie(Long id, String title, Double duration, Integer quantity) {
        this(id, title, duration);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id.equals(movie.id) && title.equals(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", quantity=" + quantity +
                '}';
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        //this and other
        //-1 if this < other
        //0 if this == other
        //1 if this > other

//        return this.id.compareTo(otherMovie.id);
//        return Double.compare(this.duration, otherMovie.duration);
        return this.duration.compareTo(otherMovie.duration);
    }
}
