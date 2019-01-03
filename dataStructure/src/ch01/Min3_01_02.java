package ch01;

// p.19
// 세 값의 최솟값을 구하는 min3 메서드를 작성하시오

import java.util.Scanner;

public class Min3_01_02 {
	static int min3(int a, int b, int c) {
		int MIN = a;
		if (b < MIN) MIN = b;
		if (c < MIN) MIN = c;
		return MIN;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.printf("min3(%d,%d,%d)의 최소 값은 : %d\n", a, b, c, min3(a,b,c));
	}
}
