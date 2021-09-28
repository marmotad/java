import java.util.*;

class Homework07{

	//编写一个方法，判断一个数是奇数还是偶数
	public static String parity(int a) {
		if (a  %2 == 0) {
			return a + "是偶数";
		}
		return a + "是奇数";
	}
	//编写一个方法，根据星期得到每天做的事情
	public static String toDo(String a) {
		switch (a) {
			case "星期一" :
				return "上课";
			case "星期二" :
				return "上课";
			case "星期三" :
				return "上课";
			case "星期五" :
				return "上课";
			case "星期六" :
				return "上课";
			case "星期日" :
				return "休息";
			case "星期四" :
				return "自习";
		}
		return "输入错误";
	}
	public static void divisibleNumber() {
		int i = 100;
		
		do {
			if (i % 19 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 200);
	}
	//判断一个年龄是老年、中年、青年还是少年
	public static String judgingAge(int a) {
		if (a < 0 && a > 150) {
			return "年龄不合法";
		}
		if (a < 16) {
			return "少年";
		}
		if (a < 35) {
			return "青年";
		}
		if (a < 60) {
			return "中年";
		}
		return "老年";
	}
	//判断一个成绩，返回对应的等级A、B、C
	public static char scor(int a) {
		if (a >= 100) {
			return 'A';
		}	
		if (a >= 80) {
			return 'B';
		}
			return 'C';
	}
	//根据输入数字，返回对应的星期
	public static String week(String a) {
		switch (a) {
		case "1":
			return "星期" + a;
		case "2":
			return "星期" + a;
		case "3":
			return "星期" + a;
		case "4":
			return "星期" + a;
		case "5":
			return "星期" + a;
		case "6":
			return "星期" + a;
		case "7":
			return "星期" + a;
		}
		return "输入错误";
	}
	//判断一个数，如果大于0，则得到1，如果小于0则得到-1，否则得到0
	public static int positiveAndNegative(int a) {
		if (a > 0) {
			return 1;
		}
		if (a < 0) {
			return -1;
		}
		return 0;
	}
	//两个变量中的值进行互换
	public static String exchangeValue(int i, int j) {
		System.out.println("i:" + i + "j:" +j);
		i = i + j;
		j = i - j;
		i = i - j;
		return "i:" + i + "j:" +j;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//编写一个方法，判断一个数是奇数还是偶数
		System.out.print("请输入一个数字判断是否奇偶数:");
		System.out.println(parity(input.nextInt()));
		//编写一个方法，根据星期得到每天做的事情
		System.out.print("请输入星期几:");
		System.out.println(toDo(input.next()));
		//输出100---200范围内所有能被19整除的数
		divisibleNumber();
		//判断一个年龄是老年、中年、青年还是少年
		System.out.print("请输入年龄:");
		System.out.println(judgingAge(input.nextInt()));
		//判断一个成绩，返回对应的等级A、B、C
		System.out.print("请输入成绩:");
		System.out.println(scor(input.nextInt()));
		//根据输入数字，返回对应的星期
		System.out.print("请输入1~7:");
		System.out.println(week(input.next()));
		//判断一个数，如果大于0，则得到1，如果小于0则得到-1，否则得到0
		System.out.print("请输入一个数判断正负:");
		System.out.println( positiveAndNegative(input.nextInt()));
		//两个变量中的值进行互换
		System.out.print("请输入两个数字:");
		System.out.println(exchangeValue(input.nextInt(),input.nextInt()));
		//1.在main方法中完成，判断一个数是否是水仙花数
		System.out.print("请输入一个数字判断是水仙花数:"); 
		int num = input.nextInt();
		int one = num % 10;
		int oneDigitCube = one * one * one;
		int ten = num / 10 % 10;
		int tensOfCubes = ten * ten * ten;
		int hundreds = num / 100;
		int hundredsOfCubes = hundreds * hundreds * hundreds;
		if (num > 1000 || num < 100) {
			System.out.print("不是三位数！");
			return;
		} 
		if (hundredsOfCubes + tensOfCubes + oneDigitCube == num) {
			System.out.println("是水仙花数");
			return;
		} 
		System.out.println("不是水仙花数");
	}
}
