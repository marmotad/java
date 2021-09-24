package day2;

class Test {
	public static void main(String[] args) {
		for (int i = 1 ; i < 10 ; i ++) {
			for (int j = 1 ; j < 10 ; j++) {
				if (i < j) {
					System.out.println();
					break;
				}
				System.out.print(j + " * " + i + " =" + j * i + "\t");
			}
		}
	}
}


