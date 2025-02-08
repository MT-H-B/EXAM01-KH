package ex01.code.No4;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        int[] score = new int[10];
        MyMethod myMethod = new MyMethod();
        Scanner sc;

        for (int i = 0; i < 10; i++) {
            sc = new Scanner(System.in);
            score[i] = sc.nextInt();
        }

        System.out.println("Sum : " + myMethod.sum(score));
        System.out.println("Average : " + myMethod.average(score));
        System.out.println("Max : " + myMethod.max(score));
        System.out.println("Min : " + myMethod.min(score));
    }
}
