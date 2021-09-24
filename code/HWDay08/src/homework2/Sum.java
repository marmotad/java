package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int num = input.nextInt();
        if (num >= 100 && num <= 999 ){
            System.out.println("各个位之和是" + (num % 10 + num / 10 % 10 + num / 100));
        } else {
            System.out.println("不是三位数！");
        }
    }
}
