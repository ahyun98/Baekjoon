import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17070 {
	public static int[][] arr;
	public static int shape;
	public static int N;
	public static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j * 2) - '0';
			}
		}
		cnt = 0;
		dfs(0, 1, 3);
		System.out.println(cnt);

	}

	// 가로=3; 세로 = 4; 대각선 =5;
	public static void dfs(int i, int j, int shape) {
		if (i == N - 1 && j == N - 1) {
			cnt++;
			return;
		}
		if (shape == 3) {

			if (i + 1 < N && j + 1 < N && arr[i + 1][j] != 1 && arr[i][j + 1] != 1 && arr[i + 1][j + 1] != 1) {
				dfs(i + 1, j + 1, 5);
			}
			if (i < N && j + 1 < N && arr[i][j + 1] != 1) {
				dfs(i, j + 1, 3);
			}

		} else if (shape == 4) {

			if (i + 1 < N && j + 1 < N && arr[i + 1][j] != 1 && arr[i][j + 1] != 1 && arr[i + 1][j + 1] != 1) {
				dfs(i + 1, j + 1, 5);
			}
			if (i + 1 < N && j < N && arr[i + 1][j] != 1) {
				dfs(i + 1, j, 4);
			}

		} else if (shape == 5) {

			if (i + 1 < N && j + 1 < N && arr[i + 1][j] != 1 && arr[i][j + 1] != 1 && arr[i + 1][j + 1] != 1) {
				dfs(i + 1, j + 1, 5);
			}
			if (i < N && j + 1 < N && arr[i][j + 1] != 1) {
				dfs(i, j + 1, 3);
			}
			if (i + 1 < N && j < N && arr[i + 1][j] != 1) {
				dfs(i + 1, j, 4);
			}
		}
		return;
	}
}
