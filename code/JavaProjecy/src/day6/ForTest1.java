class ForTest1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("------------");
		for (int i = 300; i <= 400; i += 2 ) {
			System.out.println(i);
		}
		System.out.println("------------");
		for (int i = 1001; i <= 2999; i++) {
			if (i % 123 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------");
		for (int i = 123; i <= 697; i++) {
			if (i % 55 == 0) {
				System.out.println(i);
			}
		}
	}
}