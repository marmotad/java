package day10.homework04;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 19:20
 * 日期类：
 *   属性：年，月，日
 *   封装属性，要求：年份在0以上，月份为12个月，日不能超过31天
 *   测试类：通过set方法对属性赋值，通过get方法完成对属性值的输出
 */
public class Date {
    private int year;
    private int moon;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
    }

    public int getMoon() {
        return moon;
    }

    public void setMoon(int moon) {
        if (moon > 0 && moon <= 12) {
            this.moon = moon;
        } else  {
            this.moon = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }
}
