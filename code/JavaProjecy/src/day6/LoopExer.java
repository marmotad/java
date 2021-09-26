class LoopExer {
	public static void  main(String[] args) {
		for (char i = 'A'; i <= 'Z'; i++ ) {
			System.out.println(i);
		}
		System.out.println("------------");
		//方法1
		for (int j = 0; j < 4; j ++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		//方法2
		for (int i = 1; i <= 40; i++){
			System.out.print("*");
			if (i % 10 == 0) {
				System.out.	println();
			}
		}
	}
}