package group.study.step12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845_큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		Queue<Integer> queue = new LinkedList<Integer>();
		int last = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				queue.add(n);
				last = n;
			} else if (command.equals("pop")) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println("-1");
				}
			} else if (command.equals("size")) {
				System.out.println(queue.size());
			} else if (command.equals("empty")) {
				if (queue.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (command.equals("front")) {
				if (!queue.isEmpty()) {
					System.out.println(queue.peek());
				} else {
					System.out.println("-1");
				}
			} else if (command.equals("back")) {
				if (!queue.isEmpty()) {
					System.out.println(last);;
				} else {
					System.out.println("-1");
				}
			}
		}
	}

}
