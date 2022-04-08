import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon4963 {
	/*
	 *  w : 지도의 너비
	 *  h : 지도의 높이
	 *  h개의 줄에 지도가 주어짐 (1 : 땅 , 0 : 바다)
	 *  0 0 나오면 멈추기
	 *  -> 섬의 개수 출력하기
	 *  연결요소의 개수 출력하기와 비슷한거같음.
	 *  배열을 순회하면서 연결된거 끝날때까지 이동 -> 방문처리
	 *  끊어지면 방문안한 1인거부터 다시시작 
	 */
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {1,-1,0,0,1,-1,1,-1};
	static int[] dc = {0,0,1,-1,1,1,-1,-1};
	static int sR;
	static int sC;
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			
			map = new int[h+2][w+2];
			visited = new boolean[h+2][w+2];
			
			for (int i = 1; i < h+1; i++) {
				for (int j = 1; j < w+1; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int count = 0; //count배열 초기화
			while(true) {
				if(check()) break;
				
				//방문 안한곳 있다면 count++해주고 dfs로 들어가기
				count++;
				dfs(sR,sC);
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] = true;
		
		for (int i = 0; i < dc.length; i++) {
			int newR = r+dr[i];
			int newC = c+dc[i];
			if(map[newR][newC] == 1 && !visited[newR][newC]) {
				dfs(newR,newC);
			}
		}
	}
	//방문한적 있는지, 섬인지 체크
	public static boolean check() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					sR = i;
					sC = j;
					return false;
					//만약 방문한 적 없는 섬이 있다면 그 시작 점을 저장하고 거기서부터 dfs시작
				}
			}
		}
		return true; //섬은 전부다 방문했다면 나가기
	}

}
