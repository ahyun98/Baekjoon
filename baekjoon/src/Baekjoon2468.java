import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon2468 {
	/*
	 * dfs들어가면서 개수 세기
	 * 센건 리스트에 저장
	 * Baekjoon4963 업그레이드 문제
	 * n : 지도의 크기 
	 */
	static boolean[][] visited;
	static int[][] map;
	static ArrayList<Integer> countlist = new ArrayList<>();
	//각 단지내 집이 수 저장할 배열 (마지막에 정렬 해 줘야함)
	static int n;
	static int count; // 총 단지 수 
	static int sR,sC;
	static int[] dr = {1,-1,0,0};
	static int[] dc = {0,0,1,-1};
	static int num;
	static int ans = 1;
	static int[][] cheese;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		visited = new boolean[n+2][n+2];
		map = new int[n+2][n+2];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				map[i][j] = sc.nextInt();
				max = Math.max(max, map[i][j]);
				min = Math.min(min, map[i][j]);
			}
		}
		
		//
		for (int i = min; i < max; i++) {
			count = 0;
			visited = new boolean[n+2][n+2];
			cheese = new int[n+2][n+2];
			for (int t = 1; t < n+1; t++) {
				for (int j = 1; j < n+1; j++) {
					cheese[t][j] = Math.max(0, map[t][j]-i); 

				}
			}
			while(true) {
				if(check()) break;
				count++;
				dfs(sR,sC);
				ans = Math.max(count, ans);
			}
//			System.out.println("------------------");
//			System.out.println(i);
//			for (int j = 1; j < cheese.length-1; j++) {
//				for (int j2 = 1; j2 < cheese.length-1; j2++) {
//					System.out.print(cheese[j][j2]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println(count);

		}
		System.out.println(ans);
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] = true;
		
		for (int i = 0; i < dc.length; i++) {
			int newR = r+dr[i];
			int newC = c+dc[i];
			if(cheese[newR][newC] > 0 && !visited[newR][newC]) {
				dfs(newR,newC);
			}
		}
		
		return;
	}
	
	public static boolean check() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if(cheese[i][j] > 0 && !visited[i][j]) {
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
