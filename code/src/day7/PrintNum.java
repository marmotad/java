class PrintNum {
	public static void printNum() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
	}
	public static int num() {
		int a = 10;
		return a;
	}
	public static void main(String[] args) {
		System.out.println(num());
		printNum();
		PrintNum.printNum();
	}

}