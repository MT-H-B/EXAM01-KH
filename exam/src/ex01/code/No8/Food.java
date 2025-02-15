package ex01.code.No8;

public class Food {
    private int calorie;
    private String origin;

    public Food(int calorie, String origin) {
        this.calorie = calorie;
        this.origin = origin;
    }

    public int getCalorie() {
        return calorie;
    }

    public String getOrigin() {
        return origin;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
