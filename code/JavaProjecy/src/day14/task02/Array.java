package day14.task02;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import javax.swing.text.StyledEditorKit;
import java.security.PublicKey;
import java.util.Scanner;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/9 14:28
 */
public class Array {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i;
//        }
        swap(nums, 1, 0);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
/*        String[] str = new String[6];
        for (int i = 0; i < str.length ; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个元素:");
            str[i] = input.next();
        }*/
/*        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }*/
/*        for (String str1: str
             ) {
            System.out.println(str1);
        }
    }*/
    }
    private static void swap(int[] arrName, int i, int j){
        int t = arrName[i];
        arrName[i] = arrName[j];
        arrName[j] = t;
    }
}
