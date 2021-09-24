import java.util.*;

class Homework06{
	public static void main(String[] args) {	
		//输出1---100范围内既能被3也能被5整除的数，要求使用for循环和while循环完成
		for (int i = 1; i <= 100 ;i ++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------");
		int i = 1;
		while (i < 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
			i ++;
		}
		//输出z---a中的每个字符，要求：使用for循环和do while循环完成
		System.out.println("------------");
		for (char j = 'z' ; j >= 'a' ; j--) {
			System.out.println(j);
		}
		System.out.println("------------");
		char j = 'z';
		do {
			System.out.println(j);
			j --;
		} while (j >= 'a');
		//输出2000至今所有的闰年
		System.out.println("------------");
		int x = 0;
		while (x < 2021) {
			if (x % 100 != 0 && x % 4 == 0) {
				System.out.println(x);
			}
			x ++;
		}
		//输出100  95  90  85 ...... 5的结果
		System.out.println("------------");
		int y = 100;
		do {
			System.out.println(y);
			y -= 5;
		} while (y >= 5);
		//判断一个字符是大写字母、小写字母还是数字字符
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字母、数字：");
		char inputChar = input.next().charAt(0);
		if (inputChar >= 'a' && inputChar <= 'z') {
			System.out.println("小写");
		} else if (inputChar >= 'A' && inputChar <= 'Z' ) {
			System.out.println("大写");
		} else if (inputChar >= '0' && inputChar <= '9' ) {
			System.out.println("数字");
		} else {
			System.out.println("其他");
		}
		//打印九九乘法表，并且按照格式打印(面试题)
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + "*" + a + "=" + b * a + "\t");
				/*if (a == b) {
					System.out.println();
					break;
				}*/
			}
		System.out.println();
		}
	}
}