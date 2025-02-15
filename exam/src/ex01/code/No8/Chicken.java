package ex01.code.No8;

public class Chicken extends Food implements Eatable {
    private int number;

    public Chicken (int calorie, String origin) {
        super(calorie, origin);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void eat() {
        // code
    }
}
