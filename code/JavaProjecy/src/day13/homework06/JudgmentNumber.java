package day13.homework06;

import java.util.Scanner;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/8 21:36
 */
public class JudgmentNumber {
    public static void main(String[] args) {
        judgmentNumber();

    }

    private static void judgmentNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("0");
        } else if (num % 2 == 1) {
            System.out.println("奇数");
        } else if (num % 2 == 0) {
            System.out.println("偶数");
        }
    }
}
