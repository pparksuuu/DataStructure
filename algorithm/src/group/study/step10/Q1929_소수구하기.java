package group.study.step10;

import java.util.Scanner;

// 문제 : M이상 N이하의 소수를 모두 출력하는 프로그램을 작성
// 입력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
// 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
// https://terms.naver.com/entry.nhn?docId=1179083&cid=40942&categoryId=32204
// http://blog.naver.com/PostView.nhn?blogId=occidere&logNo=220793078545
public class Q1929_소수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr = new int[N + 1];
		arr[1] = 1;
		
		for (int i = 2; i <= N; i++)
			for (int j = 2; i * j <= N; j++)
				arr[i * j] = 1;
		
		for (int i = M; i <= N; i++) {
			if (arr[i] != 1)
				System.out.println(i);
		}
	}
}
