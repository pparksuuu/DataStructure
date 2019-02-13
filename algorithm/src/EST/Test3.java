package EST;

// Jafar 는 오직 하나의 pawn만 남았고,
// 마지막 턴을 받을 것이며
// 알라딘의 pawn을 최대한 많이 죽여야 한다.
//
// Pawn은 대각선으로 움직인다. 항상 1스텝 위-오른쪽, 위-왼쪽 방향으로만 움직임.
// Jafar의 Pawn이 움직이는 자리에 Aladdin의 Pawn이 있다면, 죽일 수 있다.
// Jafar는 죽였을 때만 다시 움직일 수 있고, 죽이지 못하면 그냥 움직이기만 한다.
//
// 규칙 1. 위 ( 행  - 1)했을 때 비어있어야 한다.
// 규칙 2. 
public class Test3 {
	public static int answer = 0;
	public static int solution(String[] B) {
		// 1. 숫자로 변환한다.
		int[][] D = new int[B.length][B.length]; // 만듦. (받아오자)

		int x, y = 0; // 내 Pawn의 좌표를 저장하자.

		for (int i = 0; i < B.length; i ++) {
			String[] temp = B[i].split("");
			for (int j = 0; j< B.length; j++) {
				if (temp[j].equals(".")) {
					D[i][j] = 0;
				} else if (temp[j].equals("X")) {
					D[i][j] = 1;
				} else if (temp[j].equals("0")) {
					D[i][j] = 2;
					x = i;
					y = j;
				}
			}
		}
		for (int i = 0; i < B.length; i ++) {
			for (int j = 0; j < B.length; j ++) {
				System.out.print(D[i][j] + " ");
			}
			System.out.println();
		}

		// 초기값 셋팅
		int answer = 0;
		boolean checker = true;

		int move = 0;
		// 행 : x, 열 : y.
		/*
		while (checker) {
			// 1. 위로 올라갔는데 1이 있으면 checker = false; 
			// 2. 행/열이 범위(인덱스로는 5/5)를 넘어가면 false;
			// 3. 홀수번째 -> 1이 있어야하고, 짝수번째 -> 1이 없어야 한다. ( 홀짝 변수 만들어주기 )

		}
		 */

		System.out.println(D.length);
		return 0;
	}

	public static int findPath(int[][] D, int x, int y, int move) {
		if (x < 0 || y < 0 || x >= D.length || y >= D.length) {
			return answer;
		} else if (x - 1 >= 0 && D[x - 1][y] == 1) { // 수직 위로 가로막혀있을 때
			return answer;
		} else if (move % 2 == 1 && x - 1 >= 0) { // 홀수번쨰 => 1이 있어야 함.
			if (x - 1 >= 0 && y + 1 < D.length) // 오른쪽
			{
				if (D[x - 1][y + 1] == 1) {
					return answer + 1;
				} else {
					return answer;
				}
			} else if (x - 1 >= 0 && y - 1 > 0) { // 왼쪽
				
			} else {
				return answer;
			}
		} else if (move % 2 == 0 && ) { // 짝수번째 => 0이 있어야 함.

		}
	}

	public static void main(String[] args) {
		String[] B = new String[6];
		B[0] = "..X...";
		B[1] = "......";
		B[2] = "....X.";
		B[3] = ".X....";
		B[4] = "..X.X.";
		B[5] = "...0..";

		solution(B);

		//
	}
}
