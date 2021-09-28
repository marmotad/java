package day10.homework02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 18:56
 */
public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        System.out.println(computer1.toString());
        Computer computer2 = new Computer("哈哈", 25.5);
        System.out.println(computer1.toString());
        Computer computer3 = new Computer("computer3", 28.01, "red", 15);
        System.out.println(computer3.toString());
    }
}
