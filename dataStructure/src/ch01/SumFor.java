package ch01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d 입니다.\n", n, sum);
	}
}
