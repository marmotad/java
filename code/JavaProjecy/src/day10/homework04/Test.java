package day10.homework04;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 19:33
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        date.setMoon(11);
        date.setDay(20);
        date.setYear(11);
        System.out.println(date.getYear() + "--" + date.getMoon() + "--" + date.getDay());
    }
}
