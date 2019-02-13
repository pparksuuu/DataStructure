package EST;

// 비즈 중 네가 가장 마음에 드는 애를 기억해야 한다.
// 비즈의 숫자중 가장 크고, tangle하지 않는 아이를 찾는 것에 관심이 있다
// 비즈의 숫자는 [0 ~ N - 1] , 
// 각각의 값은 바로 다음 비즈를 꿴다.
// A의 범위 [0 ~ N - 1] ====> 최대 : [0 ~ 999,999] 
// N의 범위 : [0... 1,000,000] : 100만...
public class Test2 {
	
	public int solution(int[] A) {
		int answer = 0;
		// D is the MAX of necklaces. Default setted all 0.
		int[] D = new int[A.length];
		D[0] = 1; 
		
		// if D == 0 / D > 0
		for (int i = 0; i < D.length; i++) {
			if (i != 0 && D[i] > 0) continue;
//			System.out.println("A");
			// 아닌 경우, ---- recursive
			// 1. 자기 자신인 경우
			if (A[i] == i) {
//				System.out.println("B");
				D[i] = 1;
				answer = Math.max(answer, 1);
			} else { // 2. 자기 자신이 아닌 경우 -> 2개 이상 꿰어있는 경우
//				System.out.println("C");
				int testAnswer = 1; // 일단 해당하는 아이를 1로.
				D[i] = 1;
				boolean check = true;
				while (check == true) {
					int temp = A[i];
					if (D[temp] == 0) {
//						System.out.println("--");
						D[temp] = testAnswer++; 
						i = temp;
					} else {
//						System.out.println("testAnswer의 답 : " + testAnswer);
						answer = Math.max(answer, testAnswer);
						check = false;
					}
				}
//				System.out.println("C의 답 : " + answer);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		int[] A = {5,4,0,3,1,6,2};
		int[] B = {6,3,1,4,7,2,0,5};
		System.out.println(t.solution(A));
		System.out.println(t.solution(B));
	}
}
