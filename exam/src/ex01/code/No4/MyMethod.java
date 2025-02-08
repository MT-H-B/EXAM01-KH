package ex01.code.No4;

public class MyMethod {
    public int sum(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public double average(int[] intArray) {
        return (double) sum(intArray) / intArray.length;
    }

    public int max(int[] intArray) {
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

    public int min(int[] intArray) {
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
}
