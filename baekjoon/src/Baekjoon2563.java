import java.util.Scanner;

public class Baekjoon2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[101][101];

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = y; j < y + 10; j++) {
				for (int j2 = x; j2 < x + 10; j2++) {
					arr[j][j2] = 1;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 1)
					ans++;
			}
		}
		System.out.println(ans);
	}
}
