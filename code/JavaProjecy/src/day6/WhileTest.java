class WhileTest{
	public static void main(String[] args) {
		int i = 0, j = 301, x = 4567; 
		
		while (j <= 400) {
			System.out.println(j);
			j += 2;
		}
		System.out.println("------------");
		while (x <= 6000) {
			if (x % 678 == 0) {
				System.out.println(x);
			}
			x ++;
		}
		System.out.println("------------");
		while (i < 100) {
			if (i >= 10) {
				System.out.println(i);
			}
			i ++;
		}
		
	}
}