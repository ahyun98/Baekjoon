import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon1260 {
	static boolean[] visited;
	static ArrayList<Integer>[] v;
	static Queue<Integer> que = new LinkedList<Integer>();
	static int V;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정점의 개수
		int N = sc.nextInt();
		//간선의 개수
		int M = sc.nextInt();
		//시작하는 정점의 번호
		V = sc.nextInt();
		
		//정점의 개수에 해당하는 인덱스 만들기
		visited = new boolean[N+1];
		v = new ArrayList[N+1];
		
		//각각의 인덱스에 리스트 넣기
		for (int i = 0; i < N+1; i++) {
			v[i] = new ArrayList<Integer>();
		}
		
		//값 집어넣기
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			v[a].add(b);
			v[b].add(a);
		}
		//정렬
		for (int i = 0; i < N+1; i++) {
			Collections.sort(v[i]);
		}
		
		dfs(V);
		
		System.out.println();
		//끝났으니까 visited초기화
		visited = new boolean[N+1];
		
		bfs(V);
		
	}
	public static void dfs(int cur) {
		System.out.print(cur+" ");
		visited[cur] = true;
		
		for (int i = 0; i < v[cur].size(); i++) {
			int nxt = v[cur].get(i);
			if(visited[nxt]) continue;
			dfs(nxt);
		}
	}
	public static void bfs(int V) {
		que.add(V);
		visited[V] = true;
		while(!que.isEmpty()) {
			int cur = que.poll();
			System.out.print(cur+" ");
			
			for (int i = 0; i < v[cur].size(); i++) {
				int nxt = v[cur].get(i);
				if(visited[nxt]) continue;
				que.add(nxt);
				visited[nxt] = true;
			}
		}
	}
}
