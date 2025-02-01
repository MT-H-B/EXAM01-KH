package ex01.code;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int myAnswer = 0;
        int count = 0;

        Scanner scanner;

        while (answer != myAnswer) {
            System.out.print("1~100 사이의 수 입력 : ");
            scanner = new Scanner(System.in);
            myAnswer = scanner.nextInt();
            count++;

            if (myAnswer > answer) {
                System.out.println("더 작습니다");
            }
            else if (myAnswer < answer) {
                System.out.println("더 큽니다");
            }
            else {
                System.out.print("정답입니다");
                System.out.println("총 횟수 : " + count);
            }
        }
    }
}
