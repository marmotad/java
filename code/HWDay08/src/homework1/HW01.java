package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int num = input.nextInt();
        if (num % 2 == 0 && num % 9 == 0) {
            System.out.println("ok");
            return;
        }
        System.out.println("not ok");
    }
}
