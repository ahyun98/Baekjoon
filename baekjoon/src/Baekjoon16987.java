import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon16987 {
	static int ans = 0;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		visited = new boolean[N];
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
	}
//	public static int check(int[][] arr, int cur) {
//		visited[cur] = true;
//		
//		if(cur==arr.length) {
//			return ans;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(!visited[i]) continue;
//			
//			int a = arr[i][0]-arr[cur][1];
//			int b = arr[cur][0] - arr[i][1];
//			if(a>0 && b>0) {
//				visited[i] = true;
//			}
//			
//		}
//		
//	}
}
