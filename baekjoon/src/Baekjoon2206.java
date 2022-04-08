import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2206 {
	/*
	 * bfs문제
	 *  N : 행의 개수 
	 *  M : 열의 개수 
	 *  저장할 때 distance뿐만 아니라 벽을 부셔서 손이 덜덜 떨리는지도 확인해줘야함.
	 *  중요 포인트 ! 방문 처리 배열을 각각 만들어줘야한다는 거.
	 *  왜? 이미 뚫어본애가 방문하고 지나간거 안뚫어본애가 방문했었네,, 하고 지나가면 안되니까
	 */

	static class loc {
		int r;
		int c;
		int d;
		int wall;

		loc(int r, int c, int d, int wall) {
			this.r = r;
			this.c = c;
			this.d = d;
			this.wall = wall; // 깬적 있으면 1, 없으면 0
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<loc> q = new LinkedList<loc>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		//벽을 뚫은 친구와 뚫지 않은 친구는 다르므로 별개의 방문처리 배열로 사용해야함 (0은 안뚫은 배열, 1은 뚫은 배열)
		boolean[][][] visited = new boolean[n][m][2];
		int[][] map = new int[n][m];
		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, 1, -1 };

		// 값 집어넣어서 map만들어주기
		for (int i = 0; i < map.length; i++) {
			String str = sc.next();
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		// 불가능할 경우 ans변하지 않고 나올거니까 -1로 초기화
		int ans = -1;
		// 시작점 넣어주고 방문처리
		q.add(new loc(0, 0, 1, 0));
		visited[0][0][0] = true;

		while (!q.isEmpty()) {
			loc here = q.poll();
			int hR = here.r;
			int hC = here.c;
			int wall = here.wall;
			// 만약에 도착지에 도착한다면 거기까지 걸렸던 거리 저장
			if (hR == n - 1 && hC == m - 1) {
				ans = here.d;
				break;
			}

			for (int i = 0; i < dc.length; i++) {
				int nR = hR + dr[i];
				int nC = hC + dc[i];

				// 방문한적 있거나 범위 밖으로 나가면 이 케이스는 안봄
				if (nR < 0 || nC < 0 || nR >= n || nC >= m || visited[nR][nC][wall])
					continue;

				//뚫어본적 있고 1이면 2,뚫어본적 있는데 0이면 1, 뚫어본적 없고 1이면 1, 뚫어본적 없고 0이면 0
				int nwall = wall + map[nR][nC];
				if (nwall > 1)
					continue;

				//뚫어본적 있는 경로, 또는 이번에 뚫었으면 1 되므로 뚫어본적 있는 배열에 방문처리
				//그 외는 0에 방문처리 할 거임.
				q.add(new loc(nR, nC, here.d + 1, nwall));
				visited[nR][nC][nwall] = true;

			}
		}
		System.out.println(ans);
	}

}
