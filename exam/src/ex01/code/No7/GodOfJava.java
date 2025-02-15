package ex01.code.No7;

public class GodOfJava extends Book {
    private String contents;

    public GodOfJava (String author, String isbn, String title, int price) {
        super(author, isbn, title, price);
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
