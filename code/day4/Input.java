import java.util.*;

class Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("姓名：");
		String name = input.next();
		System.out.print("年龄：");
		int age = input.nextInt();
		System.out.print("身高：");
		double hight = input.nextDouble();
		System.out.print("姓名：");
		System.out.print("姓名" + name + ";年龄" + age + ";身高" + hight);
	}
}