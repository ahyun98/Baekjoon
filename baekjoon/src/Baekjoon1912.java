import java.util.Scanner;

public class Baekjoon1912 {
	static int max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		dp[1] = arr[1];
		for (int i = 1; i <= n; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
