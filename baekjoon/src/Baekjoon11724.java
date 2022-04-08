import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11724 {
	/*
	 * 정점의 개수와 간선의 개수를 받음.
	 * 2차원 배열에 저장한다면?
	 * 1부터 시작하면 연결된 요소들 모두를 true로 만들고 끝
	 * 남은 것들 중에 최솟값으로 다시시작(하면서 count++)
	 * 모두 true가 됐을 때 count반환?
	 */
	static boolean[] visited;
	static int n,m;
	static int nextNode;
	static boolean[] dfsvisited;
	static int[][] v;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		v = new int[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			v[a][b] = v[b][a] = 1;
		}
		

		int count = 0;
		while(true) {
			if(check()) {
				break; //방문 안한게 없다면 이거 나갈거임.
			}
			count++;
			// 방문안한게 있다면 그거로부터 dfs시작할거야
			dfs(nextNode);
		}
		System.out.println(count);
	}
	public static boolean check() {
		boolean flag = true;	//방문 안한게 없다면 true 반환
		for (int i = 1; i < n+1; i++) {
			if(!visited[i]) { 
				flag = false;
				nextNode = i;
				break;
			}
			// 방문안한게 있다면 false
		}
		return flag;
	}
	public static void dfs(int cur) {
		visited[cur] = true;

		for (int i = 1; i < v[cur].length; i++) {
			if(v[cur][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
		return;
	}
}
