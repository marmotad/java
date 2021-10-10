package day14.homework04;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/9 20:08
 * 3 定义方法, 把int[] 数组元素连接 为字符串, 数组元素之间使用逗号分隔
 */
public class Splicing {
    public static void main(String[] args) {
        int[] ints = new int[5];
        arrayToString(ints);
    }

    private static void arrayToString(int[] ints) {
        for (int i = 0; i < ints.length ; i++) {
            System.out.print(ints[i]);
            if (i < ints.length -1) {
                System.out.print(",");
            }
        }
    }
}
