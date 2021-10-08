package day13.demo05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/8 17:13
 */
public class For {
    public static void main(String[] args) {
        printFor(0, 11);

        printFor(10, 20);

        printFor(80, 90);
    }

    private static void printFor(int i2, int i3) {
        for (int i = i2; i < i3; i++) {
            System.out.println(i);
        }
    }
}
