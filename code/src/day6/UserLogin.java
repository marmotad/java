import java.util.*;

class UserLogin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("ÇëÊäÈëÓÃ»§Ãû£º");
			String userName = input.next();
			System.out.print("ÇëÊäÈëÃÜÂë£º");
			String userPasswd = input.next();
			if ("admin".equals(userName) && "123".equals(userPasswd)) {
				System.out.print("µÇÂ½³É¹¦");
				break;
			}
			System.out.println("µÇÂ¼Ê§°ÜÇëÖØÊÔ£¡");
		}
	}
}