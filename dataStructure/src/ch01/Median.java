package ch01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.
public class Median {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.printf("med3(%d,%d,%d)의  값은 : %d\n", a, b, c, med3(a,b,c));
	}
}
