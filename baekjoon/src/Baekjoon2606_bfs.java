import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2606_bfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] visited = new boolean[n+1];
		ArrayList<Integer> v[] = new ArrayList[n+1];
		for (int i = 0; i < v.length; i++) {
			v[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			v[a].add(b);
			v[b].add(a);
		}
		

		que.add(1);
		visited[1] = true;
		int count = -1;
		
		
		while(!que.isEmpty()) {
			int cur = que.poll();
//			System.out.println(cur);
			count++;
			
			for (int i = 0; i < v[cur].size(); i++) {
				int nxt = v[cur].get(i);
				
				if(visited[nxt]) continue;
				
				que.add(nxt);
				visited[nxt] = true;
			}
		}
		System.out.println(count);
	}
}
