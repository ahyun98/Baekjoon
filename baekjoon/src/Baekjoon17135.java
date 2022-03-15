import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17135 {
	public static int[][] arr;
	public static boolean[] visited;
	public static int N;
	public static int ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		N = line1.charAt(0)-'0';
		int M = line1.charAt(2)-'0';
		int D = line1.charAt(4)-'0';
		arr = new int[N+1][M];
		ans = 0;
		visited = new boolean[M];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j]=line.charAt(j*2)-'0';
			}
		}
		
		combination(0,0);
	}
	
	public static void combination(int id, int n) {
		
		if(n==3) {
			for (int i = 0; i < visited.length; i++) {
				if(visited[i]) {
					arr[N+1][i]=1;
				}
			}
//			ans = Math.max(ans, attack());
			for (int i = 0; i < visited.length; i++) {
				if(arr[N+1][i]==1) {
					arr[N+1][i]=0;
				}
			}
			return;
		}
		if(id+1<=arr[0].length) {			
			visited[id]=true;
			combination(id+1,n+1);
			visited[id]=false;
			combination(id+1,n);
		}
		return;
	}
//	
//	public static int attack() {
//		
//	}
}
