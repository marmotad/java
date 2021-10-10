package day14.task02;

import java.util.Scanner;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/9 11:16
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1、黑色;\n2、蓝色\n3、红色\n4、黄色\n" + "请输入序号：");
        int num = input.nextInt();
        switch (num) {
            case 1 :
                Black black = new Black();
                black.briad();
                break;
            case 2 :
                Blue blue = new Blue();
                blue.briad();
                break;
            case 3 :
                Red red = new Red();
                red.briad();
                break;
            case 4 :
                Yellow yellow = new Yellow();
                yellow.briad();
                break;
            default:
                System.out.println("请输入1-4");
        }
    }
}
