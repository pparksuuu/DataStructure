package group.study.step09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 삽입 정렬, 거품 정렬 등의 간단한 정렬 알고리즘을 구현해 봅니다
// 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 구하시오.
// 1<= N <= 1,000
public class Q2750_수정렬하기_수현 {
	static int N;
	static int[] arr;
	static int[] test;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 오름차순 정렬
		// 버블
		//		test = arr; // 얕은 복사. 주소값을 가리켜버림. 
		test = arr.clone(); // 깊은 복사!!
		bubbleSort(test, test.length);
		printArr(test);
		System.out.println();
		
		// 삽입
		test = arr.clone();
		insertionSort(test, test.length);
		printArr(test);
		System.out.println();
		
		// 선택
		test = arr.clone();
		selectionSort(test, test.length);
		printArr(test);
		System.out.println();
		
		// 퀵
		test = arr.clone();
		quickSort(test, 0, test.length - 1);
		printArr(test);
		System.out.println();
	}

	private static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	private static void bubbleSort(int[] arr, int n) {
		for (int i = n - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (arr[j + 1] < arr[j]) {
					swap(arr, j, j + 1);
				}
			}
	}

	private static void insertionSort(int[] arr, int n) {
		int temp = 0;;
		int j = 0;
		for (int i = 1; i < n; i++) {
			// 일단 손에 쥔 패가 min이라고 가정.
			temp = arr[i];
			for (j = i; j > 0 && arr[j - 1] > temp ; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		}
	}
	
	private static void selectionSort(int[] arr, int n) {
		int min = 0;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			swap(arr, i, min);
		}
	}
	
	private static void quickSort(int[] arr, int left, int right) {
		int pl = left;
		int pr = right;
		int x = arr[(left + right) / 2]; // 피봇.
		
		do {
			while (arr[pl] < x) pl++;
			while (arr[pr] > x) pr--;
			if (pl <= pr)
				swap(arr, pl++, pr--);
		} while (pl <= pr);
		
		if (left < pr) quickSort(arr, left, pr);
		if (pl < right) quickSort(arr, pl, right);
	}
}
