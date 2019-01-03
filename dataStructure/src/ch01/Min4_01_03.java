package ch01;

import java.util.Scanner;

// p.19
// 네 값의 최솟값을 구하는 min4 메서드를 작성하세요

public class Min4_01_03 {
	static int min4(int a, int b, int c, int d) {
		int MIN = a;
		if (b < MIN) MIN = b;
		if (c < MIN) MIN = c;
		if (d < MIN) MIN = d;
		return MIN;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int d = Integer.parseInt(sc.nextLine());
		
		System.out.printf("min4(%d,%d,%d,%d)의 값은 : %d\n", a, b, c, d, min4(a,b,c,d));
	}
}
