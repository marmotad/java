package homework;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num = input.nextInt();
        if (num % 9 == 0) {
            System.out.println(num + "可以被9整除");
            return;
        }
        System.out.println(num + "不能被9整除");
    }
}
