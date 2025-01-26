package ex01.code;

public class No2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9")) {
                if (i % 10 == 0) {
                    System.out.println("CLAP");
                }
                else {
                    System.out.print("CLAP\t");
                }
            }
            else {
                if (i % 10 == 0) {
                    System.out.println(i);
                }
                else {
                    System.out.print(i + "\t\t");
                }
            }

        }
    }
}
