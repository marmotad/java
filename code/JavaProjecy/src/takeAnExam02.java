import java.util.Scanner;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 8:46
 */
public class takeAnExam02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入1~7：");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}

