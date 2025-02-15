package ex01.code.No7;

public class Book {
    private String author;
    private String isbn;
    private String title;
    private int price;

    public Book(String author, String isbn, String title, int price) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
