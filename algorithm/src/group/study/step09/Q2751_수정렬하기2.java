package group.study.step09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2751_수정렬하기2 {
	static int N;
	static int[] buff; // 작업용 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] temp = new int[N]; // arr 초기화용 Array
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		temp = arr.clone();
		
		// 병합정렬 - stable sort
		mergeSort(arr, 0, arr.length - 1);
		printArr(arr);
		
		arr = temp.clone(); // arr 초기화
		
		// 힙 정렬 - 
	}
	
	private static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			a = merge(a, left, center, right);
		}
	}
	
	private static int[] merge(int[] data, int p, int q, int r) {
		int i = p, j = q + 1, k = p;
		int[] tmp = new int[data.length];
		while (i <= q && j <= r) {
			if (data[i] <= data[j]) 
				tmp[k++] = data[i++];
			else
				tmp[k++] = data[j++];
		}
		while (i <= q)
			tmp[k++] = data[i++];
		while (j <= r)
			tmp[k++] = data[j++];
		for (i = p; i <= r; i++) {
			data[i] =tmp[i];
		}
		return data;
	}
	
	private static void swap(int[] a, int idx1, int idx2) {
		
	}
}
