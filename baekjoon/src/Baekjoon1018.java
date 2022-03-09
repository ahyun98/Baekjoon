import java.util.Scanner;

public class Baekjoon1018 {
	static char[][] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		char[][] arr = new char[M][N];
		char[][] white = new char[8][8];
		char[][] black = new char[8][8];
		char[] key = { 'W', 'B' };
		for (int i = 0; i < black.length; i++) {
			for (int j = 0; j < black[i].length; j++) {
				white[i][j] = key[(i + j) % 2];
				black[i][j] = key[(i + j + 1) % 2];
			}
		}
		for (int i = 0; i < M; i++) {
			String word = sc.next();
			for (int j = 0; j < N; j++) {
				arr[i][j] = word.charAt(j);
			}
		}
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < M - 7; i++) {
			for (int j = 0; j < N - 7; j++) {
				makearr(arr, i, j);

				int ans1 = 0;
				int ans2 = 0;
				for (int k = 0; k < 8; k++) {
					for (int t = 0; t < 8; t++) {
						if (check[k][t] != white[k][t]) {
							ans1++;
						}
						if (check[k][t] != black[k][t]) {
							ans2++;
						}
					}
				}
				ans = Math.min(ans, Math.min(ans1, ans2));
			}
		}
		System.out.println(ans);
	}

	static char[][] makearr(char[][] arr, int sr, int sc) {
		check = new char[8][8];
		if (sr + 7 <= arr.length && sc + 7 <= arr[sr].length) {
			for (int i = sr; i < sr + 8; i++) {
				for (int j = sc; j < sc + 8; j++) {
					check[i - sr][j - sc] = arr[i][j];
				}
			}
		}
		return check;
	}
}
