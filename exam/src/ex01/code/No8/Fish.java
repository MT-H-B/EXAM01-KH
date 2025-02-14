package ex01.code.No8;

public class Fish extends Food implements Eatable {
    public int number;

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
