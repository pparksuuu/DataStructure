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
//		mergeSort(arr, 0, arr.length - 1);
//		printArr(arr);
		
		arr = temp.clone(); // arr 초기화
		
		// 힙 정렬 - unstable sort 
		heapSort(arr, arr.length);
		printArr(arr);
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
			merge(a, left, center, right);
		}
	}
	
	private static void merge(int[] data, int p, int q, int r) {
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
	}
	
	private static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	
	// a[left] ~ a[right]를 힙으로 만든다.
	private static void heapify(int[] a, int n, int i) {
		int p = i; // 부모 인덱스
		int l = i * 2 + 1; // 왼쪽 자식 인덱스
		int r = i * 2 + 2; // 오른쪽 자식 인덱스
		
		if (l < n && a[p] < a[l]) { // 부모가 왼쪽 자식보다 작다?
			p = l; // 더 큰 아이를 부모 인덱스로
		}
		
		if (r < n && a[p] < a[r]) { // 부모가 오른쪽 자식보다 작다?
			p = r; // 더 큰 아이를 부모 인덱스로!
		}
		
		if (i != p) { // 부모가 될 아이가 바뀌었으면
			swap(a, p, i); //노드 바꾸고
			heapify(a, n, p); //새로운 부모로 다시 트리가 정렬 잘 됐는지 check. 
		}
	}
	
	private static void heapSort(int[] input, int n) {
		// init, max heap
		// 단순히 일반 배열을 힙으로 구성, 그 과정에서 자식노드로부터 부모 노드를 비교
		// n / 2 - 1부터 0까지 인덱스가 도는 이유는 부모의 인덱스를 기준으로 
		// 왼쪽 자식노드 (i * 2 + 1), 오른쪽 자식노드 (i * 2 + 2)이기 때문.
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(input, n, i);
		}
		
		// 요소가 하나 제거된 수 다시 최대 힙을 구성하기 위함.
		// for extract max element from heap
		for (int i = n - 1; i > 0; i--) {
			swap(input, 0, i); // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환. 
			heapify(input, i, 0);
		}
	}
	// 힙 정렬은 선택 정렬을 응용한 알고리즘
	// 힙에서 가장 큰 값인 루트를 꺼내고 남은 요소에서 다시 가장 큰 값을 구해야 한다.
}
