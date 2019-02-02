package group.study.step12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1260_DFS와BFS {
	public static int graph[][];
	public static boolean[] visited;
	static int N;
	static int M;
	static int V;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();

		visited = new boolean[10001];
		graph = new int[1001][1001];

		int a, b;
		for (int i = 1; i <= M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			graph[a][b] = graph[b][a] = 1;
		}

		dfs(V);

		for (int j = 1; j <= N; j++) {
			visited[j] = false;
		}
		System.out.println();
		bfs(V);
	}

	private static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");

		for (int j = 1; j <= N; j++) {
			// 연결되어 있고 && 방문하지 않았다면.
			if (graph[i][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i + " ");
		
		int temp;
		while (!q.isEmpty()) {
			temp = q.poll();
			for (int j = 0; j < N + 1; j++) {
				if (graph[temp][j] == 1 && visited[j] == false) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}
