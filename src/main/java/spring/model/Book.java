package spring.model;

public class Book {
    private Integer bookId;
    private String bookTitle;
    private String bookGenre;
    private Integer authorId;
    private Integer authorName;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Integer authorName) {
        this.authorName = authorName;
    }
}
