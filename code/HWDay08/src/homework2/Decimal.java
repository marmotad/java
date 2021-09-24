package homework2;

import homework1.HW02;

public class Decimal {
    public static int decimal(int a, int b) {
        if (a > b) {
            return b;
        } else if (a < b) {
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(decimal(HW02.scan("请输入第一个数字："), HW02.scan("请输入第二个数字：")));
    }
}
