package ch01;

public class Max3m {
	
	static int max3(int a, int b, int c) {
		int MAX = a;
		if (b > MAX) MAX = b;
		if (c > MAX) MAX = c;
		return MAX;
	}
	
	public static void main(String[] args) {
		System.out.printf("max3(3,2,1) = %d\n", max3(3,2,1));
		System.out.printf("max3(3,2,2) = %d\n", max3(3,2,2));
		System.out.printf("max3(3,1,2) = %d\n", max3(3,1,2));
		System.out.printf("max3(1,2,3) = %d\n", max3(1,2,3));
	}
}
