package group.study.step09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 병합정렬 + 퀵정렬을 구현해보자.
public class Q2751_수정렬하기2___ERROR {

	static int N;
//	static int[] temp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
//		temp = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

//		temp = arr.clone(); // 깊은 복사.

		// 병합정렬
		mergeSort(arr, 0, arr.length - 1);
		printArr(arr);
//		printArr(temp);
		// 퀵정렬
	}

	private static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) { // 하나로 쪼개질 떄까지
			int center = (left + right) / 2;
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			a = merge(a, left, center, right);
		}
	}

	// 앞과 뒤를 정렬하고 합침.
	// 시작인덱스 : p, 중간 : q, 마지막 : r
	// p ~ q, q + 1 ~ r 까지는 이미 정렬되어 있다고 가정.
	private static int[] merge(int[] a, int p, int q, int r) {
		int i = p, j = q + 1, k = p; // k 는 temp용 인덱스
		int[] temp = new int[a.length];

		// 데이터 i와 데이터 j를 비교해서 작은 값이 j로 내려오고, i나 j 그리고 k를 증가
		// 즉, temp에 작은 값을 내리고 인덱스 증가. (내린 값의 인덱스도 증가)
		while (i <= q && j <= r) {
//			temp[k++] = (a[i] <= a[j]) ?  a[i++] : a[j++];

			/* 위가 좀 더 깔끔한 코드같아
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
			 */
		}

		// 첫 번째 배열을 나온 후, 앞쪽의 배열에 데이터가 남아있느 ㄴ경우와
		// 뒤쪽의 배열에 데이터가 남아있는 경우를 각각 처리.
		while (i <= q)
			temp[k++] = a[i++];
		while (j <= r)
			temp[k++] = a[j++];

		// 추가 배열에 임시로 저장되어 있는 값을 arr 배열 안에 넣어줌.
		// 즉, temp에 복사해서 정렬된 값을, 원래 data 배열로 복사.
		return a;
	}
}
