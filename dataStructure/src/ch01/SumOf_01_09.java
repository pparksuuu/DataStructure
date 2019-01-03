package ch01;

import java.util.Scanner;

// Q. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요
public class SumOf_01_09 {
	static int sumof(int a, int b) {
		int sum = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else if (b < a) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		} else {
			sum = a;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		System.out.printf("%d와 %d 사이의 합은 : %d", a, b, sumof(a,b));
	}
}
