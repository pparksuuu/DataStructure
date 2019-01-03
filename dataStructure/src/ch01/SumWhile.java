package ch01;

import java.util.Scanner;

// 1, 2, ... n의 합을 구합니다.
public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 합은 %d 입니다.\n", n, sum);
	}
}
