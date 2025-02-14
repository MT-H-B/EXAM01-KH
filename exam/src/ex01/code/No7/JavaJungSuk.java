package ex01.code.No7;

public class JavaJungSuk extends Book{
    public int edition;

    public JavaJungSuk (String author, String isbn, String title, int price) {
        super(author, isbn, title, price);
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
