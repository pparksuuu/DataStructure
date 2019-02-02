package group.study.step11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828_스택 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		Stack stack = new Stack();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push" : stack.push(Integer.parseInt(st.nextToken())); break;
			case "pop" : stack.pop();  break;
			case "size" : stack.size();  break;
			case "empty" : stack.empty();  break;
			case "top" : stack.top();  break;
			}
		}
	}

	public static class Stack {
		int stackPointer = -1;
		int[] stack;
		Stack() {
			stack = new int[10000];
		}

		void push(int x) {
			if (stackPointer < 10000) {
				stack[++stackPointer] = x;
			} 
		}

		void pop() {
			if (stackPointer >= 0) {
				System.out.println(stack[stackPointer--]);
			} else {
				System.out.println("-1");
			}
		}

		void size() {
			System.out.println(stackPointer + 1);
		}

		void empty() {
			if (stackPointer < 0)
				System.out.println("1");
			else
				System.out.println("0");
		}

		void top() {
			if (stackPointer < 0) {
				System.out.println("-1");
			} else {
				System.out.println(stack[stackPointer]);
			}
		}
	}
}
