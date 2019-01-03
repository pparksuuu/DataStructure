package ch01;

import java.util.Scanner;

// 문제 : 세 정수를 입력받아서 최대값 구하기.

public class Max3_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		int MAX = a;
		if (b > MAX) MAX = b;
		if (c > MAX) MAX = c;
		
		System.out.printf("최대값은 : %d\n", MAX);
	}
}
