package ch01;

import java.util.Scanner;

// n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28' 로 출력하는 프로그램 작성
public class SumForEx_01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i < n) {
				System.out.printf("%d + ", i);
			} else {
				System.out.printf("%d = %d", i, sum);
			}
		}
	}
}
