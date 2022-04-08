import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon2667 {
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		visited = new boolean[n+2][n+2];
		map = new int[n+2][n+2];
		
		for (int i = 1; i < n+1; i++) {
			String str = sc.next();
			for (int j = 1; j < n+1; j++) {
				map[i][j] = str.charAt(j-1)-'0';
			}
		}
		
		while(true) {
			if(check()) break;
			
			count++;
			num = 0;
			dfs(sR,sC);
			countlist.add(num);
		}
		Collections.sort(countlist);
		System.out.println(count);
		for (int j = 0; j < countlist.size(); j++) {			
			System.out.println(countlist.get(j));
		}
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] = true;
		num++;
		
		for (int i = 0; i < dc.length; i++) {
			int newR = r+dr[i];
			int newC = c+dc[i];
			if(map[newR][newC] == 1 && !visited[newR][newC]) {
				dfs(newR,newC);
			}
		}
		
		return;
	}
	
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
