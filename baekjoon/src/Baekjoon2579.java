import java.util.Scanner;

public class Baekjoon2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+4];
		int[] stair = new int[n+4];
		for (int i = 1; i <n+1; i++) {
			stair[i] = sc.nextInt();
		}
		dp[1] = stair[1];
		dp[2] = stair[1]+stair[2];
		dp[3] = Math.max(stair[1]+ stair[3],stair[2]+stair[3]);

		
		for (int i = 4; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-3]+stair[i-1]+stair[i], dp[i-2]+stair[i]);
		}
		System.out.println(dp[n]);
	}
}
