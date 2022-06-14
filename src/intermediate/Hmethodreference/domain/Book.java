package intermediate.Hmethodreference.domain;

public class Book {
    private String title;
    private Integer pags;

    public Book(String title, Integer pags) {
        this.title = title;
        this.pags = pags;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pags=" + pags +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPags() {
        return pags;
    }

    public void setPags(Integer pags) {
        this.pags = pags;
    }
}
