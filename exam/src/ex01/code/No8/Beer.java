package ex01.code.No8;

public class Beer extends Food implements Drinkable {
    public int capacity;

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
