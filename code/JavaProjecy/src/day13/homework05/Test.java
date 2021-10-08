package day13.homework05;

import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/8 21:13
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入节目序号:");
        switch (input.nextInt()) {
            case 1 :
                Piano piano = new Piano();
                piano.play();
                break;
            case 2 :
                Violin violin = new Violin();
                violin.play();
                break;
            case 3 :
                Sachs sachs = new Sachs();
                sachs.play();
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
