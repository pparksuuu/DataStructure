package ch01;

import java.util.Scanner;

// Q. 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
public class Difference_01_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a의 값 ");
		int a = Integer.parseInt(sc.nextLine());
		int b = 0;
		do {
			System.out.print("b의 값 ");
			b = Integer.parseInt(sc.nextLine());
			if (a > b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (a > b);
		
		System.out.printf("b - a는 %d입니다.", b - a);
	}
}
