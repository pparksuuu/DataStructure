package ch01;

import java.util.Scanner;

// p.19
// Q. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요
//    네 값은 사용자에게 입력받아야 합니다.
public class Max4_01_01 {
	
	static int max4(int a, int b, int c, int d) {
		int MAX = a;
		if (b > MAX) MAX = b;
		if (c > MAX) MAX = c;
		if (d > MAX) MAX = d;
		return MAX;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int d = Integer.parseInt(sc.nextLine());
		
		System.out.printf("max(%d,%d,%d,%d)의 값은 : %d\n", a, b, c, d, max4(a,b,c,d));
	}
}
