package day14.homework01;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/10 9:58
 */
public class LeapYear {
    public static boolean leapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return leapYear;
//        switch ()
    }
}
