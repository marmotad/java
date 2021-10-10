package day14.homework00;

import java.util.Scanner;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/10 11:56
 */
public class Days {
    public static void main(String[] args) {
        //输入日期
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = input.nextInt();
        System.out.print("请输入月份:");
        int month = input.nextInt();
        isLeapYear(year, month);
    }
    public static void printCalendarHeader(int year, int month) {
        System.out.println("\t" + year);
        System.out.println("-------------------------");
        System.out.println(" Sun Mont Tue Wed Thu Fri Sat");
        String monthName;

    }

    public static void isLeapYear ( int year, int moon){
        //判断是否是闰年
        int days = 0;
        boolean leepYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        for (int i = 1800; i < year; i++) {
            if (leepYear) {
                days += 366;
            } else if (!leepYear) {
                days += 365;
            }
        }
        for (int i = 0; i < moon; i++) {
            switch (moon) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                case 2:
                    days += leepYear ? 29 : 28;
            }
        }
        System.out.println(days);
        System.out.println(days % 7 + 1);
    }
}
