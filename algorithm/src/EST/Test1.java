package EST;

// N은 [2...100,000]
// array ranks는 [0...1,000,000,000]의 크기
public class Test1 {
	static int[] D = new int[100000]; // 존재함을 표시하기 위해서. 
	
	public static int solution(int[] ranks) {
		int answer = 0;
		
		// 존재하면 true로 표시
		for (int i = 0; i < ranks.length; i++) { // O(N)
			D[ranks[i]] = 1;
		}
		
		for (int i = 0; i < ranks.length; i++) {
			if (D[ranks[i] + 1] == 1) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] test = {4,4,3,3,1,0};
		System.out.println(Test1.solution(test));
	}
}
