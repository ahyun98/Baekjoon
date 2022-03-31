import java.util.Scanner;

public class Baekjoon1149 {
	static int[][] dp;
	static int[][] price;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dp = new int[N+1][3];
		price = new int[N+1][3];
		for (int i = 1; i <= N; i++) {
			price[i][0] = sc.nextInt();
			price[i][1] = sc.nextInt();
			price[i][2] = sc.nextInt();
		}
		dp[1][0] = price[1][0];
		dp[1][1] = price[1][1];
		dp[1][2] = price[1][2];
		for (int i = 1; i <= N; i++) {
			dp[i][0] = Math.min(dp[i-1][1]+price[i][0],dp[i-1][2]+price[i][0]);
			dp[i][1] = Math.min(dp[i-1][0]+price[i][1],dp[i-1][2]+price[i][1]);
			dp[i][2] = Math.min(dp[i-1][0]+price[i][2],dp[i-1][1]+price[i][2]);
		}
		
//		for (int i = 1; i <	N+1; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(price[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <	N+1; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
		
	}
}
