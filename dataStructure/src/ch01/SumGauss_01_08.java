package ch01;

import java.util.Scanner;

public class SumGauss_01_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int sum = (1 + n) * (n / 2) + (n % 2 == 1 ? (1 + n)/2 : 0);
		
		/*
		int sum = 0;
		if (n % 2 == 0) { // 짝수인 경우
			sum = (1 + n) * (n/2);
		} else { //홀수인 경우 
			sum = (1 + n) * (n/2) + (1 + n)/2;
		}
		*/
		System.out.printf("%d까지의 합 = %d", n, sum);
	}
}
