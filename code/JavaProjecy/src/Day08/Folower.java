import java.util.*;

class Folower {
	public static boolean isFolower(int num){
		if (num < 100 || num > 999){
			return false;
		}
		int gw = num % 10;
		int sw = num / 10 % 10;
		int bw = num /100;
		int sum = gw * gw *gw + sw * sw * sw + bw * bw * bw; 
		return sum == num;
	}

	public static void printFolower() {
		for (int i = 100; i <= 999; i++) {
			if (isFolower(i)) {
				System.out.println(i);
			}
		}
	}	
	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个三位数字:");
		System.out.println(isFolower(input.nextInt()));
		*/
		 printFolower();
	}
}
