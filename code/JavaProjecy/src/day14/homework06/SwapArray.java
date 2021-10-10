package day14.homework06;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/9 20:44
 */
public class SwapArray {
    public static void main(String[] args) {
        //定义一个数组并对数组中内容赋值
        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }
        swap(numArray);
    }

    private static void swap(int[] numArray) {
        int[] temp = new int[numArray.length];
        //temp数组，存储倒序的原数组
        for (int j = 0; j <= numArray.length - 1; j++) {
            //使用原数组倒序对temp数组赋值
            temp[j] = numArray[numArray.length -j -1];
        }
        numArray = temp;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }
}
