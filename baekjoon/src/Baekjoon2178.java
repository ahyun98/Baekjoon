import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2178 {
	/*
	 * bfs문제이다.
	 * 가는데 까지 걸리는 최소문제의 경우 bfs의 깊이를 구하면 됨. 
	 */
	public static void main(String[] args) {
		Queue<loc> que = new LinkedList<loc>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//방문처리해줄 배열과, map을 담을 배열은 인덱스가 넘어가지 않도록 크기+2로 생성
		boolean[][] visited = new boolean[n+2][m+2];
		int[][] map = new int[n+2][m+2];
		
		//4방으로 왔다갔다 해줄 배열
		int[] dr = { 1, -1, 0, 0 };
	    int[] dc = { 0, 0, 1, -1 };
	    
	    //내용 담음
		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			for (int j = 1; j <= m; j++) {
				map[i][j] = str.charAt(j-1)-'0';
			}
		}
		
		//모든 변수 초기화, 시작값 (1,1) 거리 1로 시작 시작한 곳 방문 처리
		int ans = 0;
		int sR = 1;
		int sC = 1;
		int sD = 1;
		visited[1][1] = true;
		que.add(new loc(sR,sC,sD));
		
		//bfs함수 부분
		while(!que.isEmpty()) {
			//큐에서 현재 위치 꺼내서 변수에 삽입
			loc cur = que.poll();
			sR = cur.r;
			sC = cur.c;
			sD = cur.d;

			//나가는 조건. 만약 도착하면 이 객체까지의 거리를 답으로 저장하고 나감
			if(cur.r==n && cur.c==m) {
				ans = cur.d;
				break;
			}
			
			
			//상하좌우로 탐색
			for (int i = 0; i < 4; i++) {
				int nR = sR + dr[i];
				int nC = sC + dc[i];
				
				//만약 내가 앞으로 가고 싶은곳이 방문할 수 없는 곳(0)이거나 방문한적 있는 곳이라면 더 보지않고 넘어감
				if(map[nR][nC]==0 || visited[nR][nC]) continue;
				
				//그런게 아니라면 que에 넣어줌, 여기까지 왔던 distance에 +1해줘야 각자의 위치까지의 거리 저장가능
				que.add(new loc(nR,nC,sD+1));
				//방문처리
				visited[nR][nC] = true;
			}
		}
		System.out.println(ans);
	}
	
	static class loc{
		int r;
		int c;
		int d;
		loc(int r, int c, int d) {
			this.r = r;
			this.c = c;
			this.d = d;
		}
	}
}
