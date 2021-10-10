package day14.homework01;

import java.util.Scanner;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/10 10:16
 */
public class CurrentDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int mount = input.nextInt();
        System.out.print("请输入日期：");
        int days = input.nextInt();
        int Heaven = 0;
        //用来存放当前年数的天数
        int daysInFebruary;
        //存放二月有多少天
        for (int i = 1; i < mount ; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                Heaven += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11 ) {
                Heaven += 30;
            } else if (i == 2) {
                daysInFebruary = LeapYear.leapYear(year) ? 29 :28;
                Heaven += daysInFebruary;
            }
        }
        Heaven += days;
        System.out.println("当前天数" + Heaven);
    }
}