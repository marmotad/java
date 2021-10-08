import java.util.Scanner;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 8:41
 */
public class takeAnExam01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份:");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
