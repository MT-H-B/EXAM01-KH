package ex01.code.No8;

public class Beer extends Food implements Drinkable {
    private int capacity;

    public Beer(int calorie, String origin) {
        super(calorie, origin);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void drink() {
        // code
    }
}
