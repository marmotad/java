class SumNum{
	public static void main(String[] args) {
		int num = 123;
		int base = 100;
		int digits = num % 10, then = num / 10 % 10, hundreds = num / 100 % 10;
		System.out.println(digits + then + hundreds);
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(10 > 0 ? "10":"0");
		System.out.println(18 % 2 == 0 ? "Å¼Êý" : "ÆæÊý");
		int a = -1;
		System.out.println(a > 0 ? 1 : a < 0 ? -1 : 0 );
	}
}	

