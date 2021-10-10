package day14.homework05;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/9 20:25
 * 4 定义方法, 实现数组中各个元素的乱序, 遍历数组的每个元素,把该元素与另外一个随机下标的元素进行交换交换
 */
public class SwapArray {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = i;
        }
        swap(ints, 1, 0);
        for (int i = 0; i < ints.length ; i++) {
            System.out.print(ints[i]);
        }

    }

    private static void swap(int[] ints, int i, int i1) {
        int temp;
        temp = ints[i];
        ints[i] = ints[i1];
        ints[i1] = temp;
    }
}
