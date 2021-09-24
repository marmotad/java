class DoWhileTest {
	public static void main(String[] args) {
		int i = 50, j = 123;
		do {
			System.out.println(i);
			i++;
		} while (i <= 100);
		System.out.println("------------");
		do {
			if (j % 2 == 1) {
				System.out.println(j);
			}
			j++;
		} while (j <= 200);
		System.out.println("------------");
		j = 123;
		do {
			System.out.println(j);
			j += 2;
		} while (j <= 200);
	}

}