package day11.homework02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:25
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        date.setHour(11).setMinute(19).setSecond(22);
        System.out.println(date.getHour() + "-" + date.getMinute() + "-" + date.getSecond());
    }
}
