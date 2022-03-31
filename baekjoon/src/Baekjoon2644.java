import java.util.Scanner;

public class Baekjoon2644 {
	static boolean[] visited;
	static int[][] v;
	static int num1;
	static int num2;
	static int count = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 전체 사람의 수
		visited = new boolean[n + 1];
		v = new int[n + 1][n + 1];
		num1 = sc.nextInt(); // 첫 번째 번호
		num2 = sc.nextInt(); // 두 번째 번호
		int m = sc.nextInt(); // 관계의 개수

		for (int i = 1; i <= m; i++) {
			int x = sc.nextInt(); // 부모의 번호
			int y = sc.nextInt(); // 자식의 번호
			v[x][y] = v[y][x] = 1;
		}
		dfs(num1, 0);
		System.out.println(count);
	}

	public static void dfs(int cur, int cnt) {
		if (cur == num2) {
			count = cnt;
			return;
		}
		
		visited[cur] = true;
		for (int i = 1; i < v[cur].length; i++) {
			if (!visited[i] && v[cur][i] == 1) {
				dfs(i, cnt + 1);
			}
		}
	}

}
