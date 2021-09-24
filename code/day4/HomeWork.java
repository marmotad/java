import java.util.Scanner;
class HomeWork {
	public static void main(String[] args) {
		//1.判断一个数是否是五位的正数
		Scanner inputNum = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int num = inputNum.nextInt();
		if (num > 10000 && num < 100000) {
			for (int i = 0; i < 5; i++) {
				System.out.println(num % 10);
				num /= 10;
			}
		} else {
			System.out.print("数字错误");
		}
		//判断一个数是否是水仙花数
		Scanner inputNarNum = new Scanner(System.in);
		System.out.print("请输入一个三位数字：");
		int narNum = inputNarNum.nextInt();
		if (narNum > 0 && narNum < 300) {
			int narNumDigits = narNum % 10;
			int narNumTens = narNum / 10 % 10;
			int narNumHundreds  = narNum / 100 % 10;
		boolean narNumBool = narNum == narNumDigits * narNumDigits * narNumDigits + 
				narNumTens * narNumTens * narNumTens + 
				narNumHundreds * narNumHundreds * narNumHundreds;
			System.out.println(narNumBool ? narNum + "是水仙花数" :narNum + "不是水仙花数");
		}
	}
}