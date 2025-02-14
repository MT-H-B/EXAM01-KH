package ex01.code.No7;

public class HeadFirstJava extends Book{
    public String review;

    public HeadFirstJava (String author, String isbn, String title, int price) {
        super(author, isbn, title, price);
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {

    }
}
