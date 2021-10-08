package day11.homework02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:13
 */
public class Date {
    int hour;
    int minute;
    int second;
    public int getHour() {
        return hour;
    }

    public Date setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        return this;
    }

    public int getMinute() {
        return minute;
    }

    public Date setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        return this;
    }

    public int getSecond() {
        return second;
    }

    public Date setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
        return this;
    }
}
