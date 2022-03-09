import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12865 {
	
	//짜고자 하는 것
	// arr로 순열을 만듬
	// 가능한 모든 부분 순열을 만들거지만 만약 버틸수있는 무게 넘으면 return;
	
	static int[] W;
	static int[] V;
	static int ans = 0;
	static int N;
	static int K;
	static int dp[][] = new int[110][100010];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		W = new int[N];
		V = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < 110; i++){
            for(int j = 0; j < 100010; j++){
                dp[i][j] = -1;
            }
        }
		System.out.println(recur(0,0));
	}
	
	static int recur(int idx, int sum) {
		if(sum>K) {
			return -10000000;
		}
		
		if(idx==N) {
			return 0;
		}
		if(dp[idx][sum] != -1) return dp[idx][sum];
		
		return dp[idx][sum] = Math.max(recur(idx+1,sum+W[idx])+V[idx], recur(idx+1,sum));

	}
}
