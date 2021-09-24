import java.util.*;

class SwitchTest {
	public static void  main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入名次：");
		String rank = input.next();
		
		switch (rank) {
			case "第一名":
				System.out.println("100w");
				break;
			case "第二名":
				System.out.println("50w");
				break;
			case "第三名":
				System.out.println("10w");
				break;
			default:
				System.out.println("谢谢参与");
				break;
		} 
	}
}	