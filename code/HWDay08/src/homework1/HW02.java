package homework1;

import java.util.Scanner;

public class HW02 {
    public static boolean determineLeapYear(int year) {
        if (year > 0 && year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return  false;
    }

    public static int scan(String hint) {
        Scanner input = new Scanner(System.in);
        System.out.print(hint);
        return input.nextInt();
    }
    public static void main(String[] args) {
        System.out.println(determineLeapYear(scan("请输入年份：")));
    }
}

