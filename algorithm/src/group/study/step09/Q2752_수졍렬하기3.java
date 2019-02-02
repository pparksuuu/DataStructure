package group.study.step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 카운팅 소트 & 라딕스 소트로 정렬해보자.
// 카운팅 소트 : https://yaboong.github.io/algorithms/2018/03/20/counting-sort/
// 라딕스 소트 : 
// 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
// 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
public class Q2752_수졍렬하기3 {
	static int N;
	static int[] arr = new int[10001];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i < 10001; i++) {
			while (0 < arr[i]--) {
				bw.write(Integer.toString(i) + "\n");
			}
		}
		br.close();
        bw.close();
//		arr = countingSort(arr);
	}
	
	private static void printArr(int[] arr) {
		for (int i : arr) 
			System.out.println(i);
	}
	
	
	
	/*
	private static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	private static int[] countingSort(int[] arr) {
		int max = getMax(arr);
		int[] countArr = new int[max + 1]; // 갯수를 셀 배열, 0은 쓰지 않음.
		int[] result = new int[arr.length]; // 결과를 담을 배열

		// 카운팅 하고
		for (int i = 0; i < arr.length; i++) {
			countArr[arr[i]]++;
		}
		
		// 범위값 나눌 카운팅으로 변경
		for (int i = 1; i < countArr.length; i++) {
			countArr[i] += countArr[i - 1];
		}

		// 누적합을 이용해 정렬
		for (int i = arr.length - 1; i >= 0; i--) {
			result[--countArr[arr[i]]] = arr[i];
		}
		
		return result;
	}
	*/
}

// 카운팅 소트
// - 원소간 비교하지 않고 각 원소가 몇 개 등장하는지 갯수를 세서 정렬하는 방법
// 모든 원소는 양의 정수여야 한다.
// 시간복잡도는 O(n + k)로 퀵정렬, 병합정렬에 비해 일반적으로 빠르다.
// 정렬을 위한 길이 n의 배열 하나, 계수를 위한 길이 k의 배열 하나. O(n + k) 의 공간복잡도를 가진다.