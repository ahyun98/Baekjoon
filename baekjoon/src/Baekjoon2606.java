import java.util.Scanner;

public class Baekjoon2606 {
	//visited배열은 각각의 노드를 들렸는지 확인
	static boolean[] visited;
	//i번 노드에 연결된 노드들을 v[i]안에 넣어줄 예정
	static int[][] v;
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //노드의 개수
		int m = sc.nextInt(); //간선의 개수
		visited = new boolean[n+1];
		v = new int[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			//이게 핵심
			// a=1 , b=3이라면 v[1]의 3번째 인덱스를 1로 바꿔줌으로써 1이랑 연결된 것들이 뭐뭐있는지 확인
			v[a][b] = v[b][a] = 1;
		}
		//1번노드랑 연결된거 몇개인지 반환
		dfs(1);
		//근데 1번 노드랑 연결된거 인데 1부터 세기 시작했으니까 하나 빼줌
		System.out.println(ans-1);
	}
	public static void dfs(int cur) {
		//들어가자마자 방문표시, 방문한거 늘었으니까 개수 추가
		visited[cur] = true;
		ans++;
		
		//아직 들린 적 없는 곳인데 cur랑 연결되어있는곳 찾아서 들어가기
		for (int i = 0; i < v[cur].length; i++) {
			if (v[cur][i]==1 && !visited[i]) {
				dfs(i);				
			}
		}
		return;
	}
}