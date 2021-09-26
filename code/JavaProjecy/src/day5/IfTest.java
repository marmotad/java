package day5;

import java.util.*;

class IfTest {


	public static void main(String[] args) {
		/*
		Scanner inputScore = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int score = inputScore.nextInt();
		if (score > 95 ) {
			System.out.print("奖励");
		}
		
		if (score <= 95 ) {
			System.out.print("惩罚");
		}
	}
*/

		Scanner inputNum = new Scanner(System.in);
		System.out.print("请输入第一个数字");
		int oneNum = inputNum.nextInt();	
		System.out.print("请输入第二个数字");	
		int twoNum = inputNum.nextInt();
		int sum = oneNum + twoNum;
		if (sum % 2 == 0) {
			System.out.println("偶数");
		} else if (sum % 2 == 1) {
			System.out.println("奇数");
		}
/*
		int num = inputNum.nextInt();
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else if (num % 2 == 1) {
			System.out.println("奇数");
		}
		
		if (num % 18 == 0) {
			System.out.println("18的倍数");
		} else if (num % 18 != 0) {
			System.out.println("不是18的倍数");
		}
		
		if (num >= 100 && num < 1000 ) {
			System.out.println("是三位正数");
		} else {
			System.out.println("不是三位正数");
		}
	*/
	}
}
