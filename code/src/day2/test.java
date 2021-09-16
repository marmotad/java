class test {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i ++) {
			for (int j = 1; j < 10; j++) {
				if (i < j) {
					System.out.println();
					break;
				}
				System.out.print(j + " * " + i + " =" + j * i + "\t");
			}
		}
	}
}


/*
class test {
	public static void main (String[] args) {
		int j = 5;
		for (int i = 0; i < 4; i++ ) {
			//if 
			//System.out.print("\t");
			for (; j > 0; j-- ){
				System.out.print("*");
				System.out.print(j);
			}
			System.out.println();
			j -= 1;
		}
	}
}
*/