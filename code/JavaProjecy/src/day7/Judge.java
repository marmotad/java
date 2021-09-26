class Judge{
	public static String judge() {
		if (123 % 2 == 0) {
			return "Å¼Êı";
		} else {
			return "ÆæÊı";
		}
	}
	
	public static int numJudge() {
		int num = 122;
		if (num > 0) {
			return 1;
		} else if (num < 0) {
			return -1;
		} 
		return 0;
	}
	
	public static void printNum(int j) {
		int i = 0;
		while ( i < j) {
			System.out.println(i);
			i ++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(judge());
		System.out.println(numJudge());
		printNum(99);
	}
}