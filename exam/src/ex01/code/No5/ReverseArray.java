package ex01.code.No5;

public class ReverseArray {
    public void reverseArray(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[intArray.length - (i + 1)] + " ");
        }

    }
}
